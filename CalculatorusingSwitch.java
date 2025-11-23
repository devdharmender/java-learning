import java.util.Scanner;

public class CalculatorusingSwitch {
  public static void main(String arg[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter value 1 : ");
    int a = sc.nextInt();
    System.out.println("enter oprator +,-,*,/,%: ");
    char oprator = sc.next().charAt(0);
      System.out.println("enter value 2 : ");
      int b = sc.nextInt();

      switch (oprator) {
        case '+' : System.out.println("sum is "+ (a+b));break;
        case '-' : System.out.println("minus is " + (a-b));break;
        case '*' : System.out.println("multiply is " + (a*b)); break;
        case '/' : System.out.println("division is " + (a/b)); break;
        case '%' : System.out.println("you reminder is " + (a%b));break;
        default : System.out.print("no output entered");

      }
    sc.close();
  }
}
