// import java.util.Scanner;

public class Comparelargestnumber {
  public static void main(String arg[]){
    // Scanner sc = new Scanner(System.in);
    int a = 90; int b = 20; int c = 6;

    if((a >= b) && (a >= c)){
      System.out.print("a is greate number bitween a,b,c " + a);
    }else if(b >= c){
      System.out.println("b is greater number bitween a,b,c " + b);
    }else{
      System.out.print("c is greater number bitween a,b,c " + c);
    }
  }
}
