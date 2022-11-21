
import java.util.ArrayList;

public class State {
  String name;
  ArrayList<Transition> adjacents = new ArrayList<Transition>();

  public State(String name) {
    this.name = name;
  }

  public void addAdjacent(Transition adjacent) {
    this.adjacents.add(adjacent);
  }

  public String getName() {
    return this.name;
  }

  public String getAdjacents() {
    String response = "";
    for (Transition adjacent : adjacents) {
      response += adjacent.getDestine() + ",";
    }
    return response;
  }

  @Override
  public String toString() {
    return "{" +
        " name='" + getName() + "'" +
        ", adjacents='" + getAdjacents() + "'" +
        "}";
  }

}
