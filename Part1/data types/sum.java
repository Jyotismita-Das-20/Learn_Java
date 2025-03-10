import java.util.Scanner;

public class sum {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("Welcome to our calculator");
    System.out.println("Please enter first number");
    int firstNum=input.nextInt();
    System.out.println("Now, please enter the second number");
    int secondNum=input.nextInt();
    int sum=firstNum+secondNum;
    System.out.println("Sum of your numbers is :"+sum);
    input.close();
  }
}
