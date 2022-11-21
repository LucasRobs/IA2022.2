package atividade2;

public class Transition {
  State destine;
  int distance;

  public Transition(State destine, int distance) {
    this.destine = destine;
    this.distance = distance;
  }

  @Override
  public String toString() {
    return "{" +
        destine.name + "'" + this.distance + "'" +
        "}";
  }

  public String getDestine() {
    return destine.name + " " + distance;
  }
}
