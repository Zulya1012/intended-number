import java.util.Scanner;
public class secret {
  public static void main(String[] arg) {
    Scanner s = new Scanner(System.in);
    int b = 10;
    System.out.println("Enter the number:");
    int a = s.nextInt();

    int x = a - b;

    if (x > 30) {
      System.out.println("Cold");
    } else if (x == 0) {
      System.out.println("Guessed");
    } else if (x < 30) {
      System.out.println("Warmer");
    }
  }

}
