package atividade2;

public class No {
  public No father;
  public State sun;
  public int cost;

  public No(No father, State state, int cost) {
    this.father = father;
    this.sun = state;
    this.cost = cost;
  }

  @Override
  public String toString() {
    return "{" +
        "'" + sun.name + "'" +
        "}\n";
  }
}
