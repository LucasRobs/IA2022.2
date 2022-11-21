package atividade2;

import java.util.ArrayList;

public class Mapp {
  ArrayList<State> states = new ArrayList<State>();
  State currentLocation;
  State destine;

  public Mapp(String currentLocation) {
    createStates();
    /*
     * print mapp
     * for (State state : states) {
     * System.out.println(state);
     * }
     */
    for (State state : states) {
      if (currentLocation.equals(state.name))
        this.currentLocation = state;
    }
  }

  public State getCurrentLocation() {
    return this.currentLocation;
  }

  public void createStates() {
    State oradea = new State("oradea");
    State zerind = new State("zerind");
    State arad = new State("arad");
    State timisoara = new State("timisoara");
    State lugoj = new State("lugoj");
    State mehadia = new State("mehadia");
    State drobeta = new State("drobeta");
    State craiova = new State("craiova");
    State rimnicuVilceo = new State("rimnicu vilceo");
    State sibiu = new State("sibiu");
    State fagaras = new State("fagaras");
    State pitesti = new State("pitesti");
    State bucharest = new State("bucharest");
    State giurgiu = new State("giurgiu");
    State urziceni = new State("urziceni");
    State hirsova = new State("hirsova");
    State eforie = new State("eforie");
    State vaslui = new State("vaslui");
    State iasi = new State("iasi");
    State neamt = new State("neamt");

    oradea.addAdjacent(new Transition(zerind, 71));
    oradea.addAdjacent(new Transition(sibiu, 151));
    states.add(oradea);

    zerind.addAdjacent(new Transition(oradea, 71));
    zerind.addAdjacent(new Transition(arad, 75));
    states.add(zerind);

    arad.addAdjacent(new Transition(zerind, 75));
    arad.addAdjacent(new Transition(sibiu, 140));
    arad.addAdjacent(new Transition(timisoara, 118));
    states.add(arad);

    timisoara.addAdjacent(new Transition(arad, 118));
    timisoara.addAdjacent(new Transition(lugoj, 111));
    states.add(timisoara);

    lugoj.addAdjacent(new Transition(timisoara, 111));
    lugoj.addAdjacent(new Transition(mehadia, 70));
    states.add(lugoj);

    mehadia.addAdjacent(new Transition(lugoj, 70));
    mehadia.addAdjacent(new Transition(drobeta, 75));
    states.add(mehadia);

    drobeta.addAdjacent(new Transition(mehadia, 75));
    drobeta.addAdjacent(new Transition(craiova, 120));
    states.add(drobeta);

    craiova.addAdjacent(new Transition(drobeta, 120));
    craiova.addAdjacent(new Transition(pitesti, 138));
    craiova.addAdjacent(new Transition(rimnicuVilceo, 146));
    states.add(craiova);

    rimnicuVilceo.addAdjacent(new Transition(sibiu, 80));
    rimnicuVilceo.addAdjacent(new Transition(pitesti, 97));
    rimnicuVilceo.addAdjacent(new Transition(craiova, 146));
    states.add(rimnicuVilceo);

    sibiu.addAdjacent(new Transition(oradea, 151));
    sibiu.addAdjacent(new Transition(arad, 140));
    sibiu.addAdjacent(new Transition(fagaras, 99));
    sibiu.addAdjacent(new Transition(rimnicuVilceo, 80));
    states.add(sibiu);

    fagaras.addAdjacent(new Transition(sibiu, 99));
    fagaras.addAdjacent(new Transition(bucharest, 211));
    states.add(fagaras);

    pitesti.addAdjacent(new Transition(rimnicuVilceo, 97));
    pitesti.addAdjacent(new Transition(bucharest, 101));
    pitesti.addAdjacent(new Transition(craiova, 138));
    states.add(pitesti);

    bucharest.addAdjacent(new Transition(giurgiu, 91));
    bucharest.addAdjacent(new Transition(urziceni, 85));
    bucharest.addAdjacent(new Transition(pitesti, 101));
    bucharest.addAdjacent(new Transition(fagaras, 211));
    states.add(bucharest);

    urziceni.addAdjacent(new Transition(bucharest, 85));
    urziceni.addAdjacent(new Transition(vaslui, 98));
    urziceni.addAdjacent(new Transition(hirsova, 142));
    states.add(urziceni);

    hirsova.addAdjacent(new Transition(urziceni, 98));
    hirsova.addAdjacent(new Transition(eforie, 86));
    states.add(hirsova);

    eforie.addAdjacent(new Transition(hirsova, 86));
    states.add(eforie);

    vaslui.addAdjacent(new Transition(urziceni, 142));
    vaslui.addAdjacent(new Transition(iasi, 92));
    states.add(vaslui);

    iasi.addAdjacent(new Transition(vaslui, 92));
    iasi.addAdjacent(new Transition(neamt, 87));
    states.add(iasi);

    neamt.addAdjacent(new Transition(iasi, 87));
    states.add(neamt);

    destine = neamt;
  }
}
