package classHuman;

public class Woman extends Human {

  public Woman(String name) {
    super(name);
  }

  @Override
  public void humanGreat() {
    System.out.println("Я родилась!");
  }
  @Override
  public String toString() {
    return "Женщина по имени " + getName();
  }
}
