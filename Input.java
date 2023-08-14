import java.util.Scanner;

public class Input {
  public static void main(String[] args) {
    Scanner myInput = new Scanner(System.in);
    System.out.println("Enter Your Name: ");

    String myName = myInput.nextLine();
    System.out.println("Enter your age: ");
    int age = myInput.nextInt();  
    boolean isStudent = true;
    System.out.println("Your name is " + myName + " You are " + age + " years old!");
    System.out.println("Student: " + isStudent);
  }
}
