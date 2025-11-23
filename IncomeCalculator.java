import java.util.Scanner;

public class IncomeCalculator {
  public static void main(String arg[]){
    Scanner sc = new Scanner(System.in);
    int income = sc.nextInt();
    if(income < 500000){
      System.out.println("your tax is 0");
    }else if(income >= 500000 && income < 1000000){
      System.out.println("your tax is 20% " + income*0.2);
    }else{
      System.out.print("your tax is 30% " + income*0.3);
    }
    sc.close();
  }
}
