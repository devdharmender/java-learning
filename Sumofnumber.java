import java.util.Scanner;

public class Sumofnumber {
  public static void main(String arg[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int sum = 0;
    int b = 0;
    while (b<= a) {
      sum+=b;
      b++;
    }
    System.out.print(sum);
    sc.close();
  }
}
