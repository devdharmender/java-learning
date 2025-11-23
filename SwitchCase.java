import java.util.*;

public class SwitchCase {
  public static void main(String arg[]){
    Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      switch (a) {
        case 1 : System.out.println("case 1 run"); break;
        case 2 : System.out.println("case 2 run"); break;
        case 3 : System.out.println("case 3 run"); break;
        default : System.out.println("this is default case");
      }
    sc.close(); 
  }
}
