public class Enviroment {
  private Boolean isDirtyA;
  private Boolean isDirtyB;
  private Boolean agentLocation;

  Enviroment(Boolean isDirtyA, Boolean isDirtyB, Boolean agentLocation) {
    this.isDirtyA = isDirtyA;
    this.isDirtyB = isDirtyB;
    this.agentLocation = agentLocation;
  }

  public void update(String action) {
    System.out.println(action);
    if (action.equals("aspirar")) {
      if (agentLocation)
        this.isDirtyA = false;
      else
        this.isDirtyB = false;
    } else if (action.equals("direita")) {
      if (agentLocation)
        agentLocation = !agentLocation;
    } else {
      if (!agentLocation)
        agentLocation = !agentLocation;
    }
  }

  public String toString() {
    return "[" + (agentLocation ? "A" : " ") + (isDirtyA ? ".." : "  ") + "][" + (!agentLocation ? "A" : " ")
        + (isDirtyB ? ".." : "  ") + "]";
  }

  public Boolean getLocation() {
    return agentLocation;
  }

  public Boolean isDirty(Boolean locatin) {
    return agentLocation ? isDirtyA : isDirtyB;
  }
}
