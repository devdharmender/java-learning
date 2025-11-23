import java.util.Scanner;

public class OddEven {
  public static void main(String arg[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    if(a%2 == 0){
      System.out.print("a is even number");
    }else{
      System.out.print("a is Odd number");
    }
    sc.close();
  }
}
