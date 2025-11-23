import java.util.*;

public class Compare2Number {
  public static void main(String arg[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    if(a> b){
      System.out.println("a is greatest number");
    }else{
      System.out.println("b is greatest number");
    }
    sc.close();
  }
}
