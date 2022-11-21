public class Perceive {
  private Boolean location;
  private Boolean isDirty;

  Perceive(Enviroment enviroment) {
    this.location = enviroment.getLocation();
    this.isDirty = enviroment.isDirty(location);
  }

  public Boolean getLocation() {
    return location;
  }

  public Boolean getIsDirty() {
    return isDirty;
  }
}
