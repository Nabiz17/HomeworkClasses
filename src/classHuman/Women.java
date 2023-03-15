package classHuman;

public class Women extends Human {

  public Women(String name) {
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
