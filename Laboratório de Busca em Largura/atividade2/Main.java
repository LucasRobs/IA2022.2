package atividade2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    Mapp mapp = new Mapp(ler.nextLine());
    widthSearch(mapp);
  }

  public static boolean widthSearch(Mapp mapp) {
    final long tempoInicial = System.currentTimeMillis();
    No no = new No(null, mapp.getCurrentLocation(), 0);
    ArrayList<No> bordas = new ArrayList<No>();
    bordas.add(no);
    ArrayList<No> esplorados = new ArrayList<No>();
    while (!bordas.isEmpty()) {
      no = bordas.remove(0);
      esplorados.add(no);
      for (Transition filho : no.sun.adjacents) {
        if (no.sun.equals(mapp.destine)) {
          showAway(no);
          System.out.print("Custo: " + no.cost + ", Tempo: ");
          System.out.println((System.currentTimeMillis() - tempoInicial) / 1000d);
          return true;
        }
        bordas.add(new No(no, filho.destine, filho.distance + no.cost));
      }
    }
    System.out.print("error");
    return false;
  }

  public static Boolean bastCost(ArrayList<No> array, No element) {
    for (No value : array) {
      if (value.cost > element.cost) {
        return false;
      }
    }
    return true;
  }

  public static Boolean containsIn(ArrayList<No> array, No element) {
    for (No value : array) {
      if (value.sun.name.equals(element.sun.name)) {
        return true;
      }
    }
    return false;
  }

  public static void showAway(No away) {
    if (away.father != null)
      showAway(away.father);

    System.out.print(away.sun.name + "->");
  }

  public static void showAway(ArrayList<No> caminhos, Mapp mapp) {
    String caminho = "";
    for (No state : caminhos) {
      caminho += state.sun.name;
      if (!state.sun.equals(mapp.destine))
        caminho += "->";
    }
    System.out.println(caminho);
  }
}
