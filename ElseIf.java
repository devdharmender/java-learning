import java.util.*;

public class ElseIf {
  public static void main(String arg[]){
    Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      if(a > 18){
        System.out.println("you are allow to drive");
      }else if(a > 13 && a < 18){
        System.out.println("you are teen ager please wait for some more year");
      }else{
        System.out.println("are bhai tu bachha hai abhi jaa bad me aa jaiyo");
      }
    sc.close();
  }
}
