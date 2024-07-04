import java.util.Scanner; 
public class Main {
  public static void main(String[] args) {
    System.out.println("Fruits you need for a Smoothie");
    String[] Fruits = {"Apple", "Banana", "Orange", "Dragon Fruit"};
    Scanner myObj = new Scanner(System.in); 
    System.out.println("Numbers of Smoothie");
    int times = Integer.parseInt(myObj.nextLine());
    int a = 0;
    while (a < times) {
      a = a + 1;
        for (String i : Fruits) {
          System.out.println("We need " + i);
      }   
    }
  }
}