package classHuman;

public class Women extends Human {

  public Women(String name) {
    super(name);
  }

  @Override
  public String toString() {
    return "Женщина по имени " + getName();
  }
}
