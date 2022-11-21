public class Agent {
  public Agent() {

  }

  public Perceive perceives(Enviroment enviroment) {
    return new Perceive(enviroment);
  }

  public String act(Perceive perceives) {
    if (perceives.getIsDirty()) {
      return "aspirar";
    } else if (perceives.getLocation()) {
      return "direita";
    } else {
      return "esquerda";
    }
  }
}
