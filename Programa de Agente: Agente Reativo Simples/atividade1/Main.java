public class Main {
  public static void main(String[] args) {
    Enviroment enviroment = new Enviroment(true, true, true);
    Agent agent = new Agent();
    System.out.println(enviroment);
    for (int i = 0; i < 5; i++) {
      Perceive perceive = new Perceive(enviroment);
      enviroment.update(agent.act(perceive));
      System.out.println(enviroment);
    }
  }
}