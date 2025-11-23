import java.util.*;
public class Conditional {
  public static void main(String arg[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    if(a>18){
      System.out.print("you are adult brother");
    }if(a>13 && b<18){
      System.out.println("you are teen ager brother");
    }else{
      System.out.print("you are small brother");
    }
    sc.close();
  }
}