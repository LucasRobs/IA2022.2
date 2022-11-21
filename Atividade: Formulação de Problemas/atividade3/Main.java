package atividade2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    Mapp mapp = new Mapp(ler.nextLine());
    widthSearch(mapp);
  }

  /**
   * @param mapp
   * @return
   */
  public static boolean widthSearch(Mapp mapp) {
    State no = mapp.getCurrentLocation();
    ArrayList<State> bordas = new ArrayList<State>();
    bordas.add(no);
    ArrayList<State> esplorados = new ArrayList<State>();
    while (true) {
      if (bordas.isEmpty())
        return false;
      no = bordas.remove(0);
      esplorados.add(no);
      no.adjacents.sort(Comparator.comparing(Transition::getDistance));
      for (Transition filho : no.adjacents) {
        if (!bordas.contains(filho.destine) && !esplorados.contains(filho.destine)) {
          if (filho.destine.equals(mapp.destine)) {
            esplorados.add(filho.destine);
            String caminho = "";
            for (State state : esplorados) {
              caminho += "[" + state.name + "]";
              if (!state.equals(mapp.destine))
                caminho += "->";
            }
            System.out.println(caminho);
            return true;
          }
          bordas.add(filho.destine);
        }
      }
    }
  }
}

static class SortByDistance implements Comparator<Transition> {
  @Override
  public int compare(Transition a, Transition b) {
    return a.destine.compareTo(b.destine);
  }
}
