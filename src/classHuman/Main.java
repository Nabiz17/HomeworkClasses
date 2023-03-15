package classHuman;

public class Main {
  public static void main(String[] args) {

    Human max = new Human("Максим");
    Human anna = new Human("Анна");
    Human egor = new Man("Егор");
    Human ira = new Women("Ира");


    System.out.println(max);
    System.out.println(anna);
    System.out.println(egor);
    System.out.println(ira);

    max.humanGreat();
    anna.humanGreat();
    egor.humanGreat();
    ira.humanGreat();
  }
}