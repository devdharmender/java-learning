import java.util.Scanner;

public class ReverseNumber {
  public static void main(String arg[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int rev = 0;
    while(n > 0){
      int lastdigit = n%10;
      // System.out.print(lastdigit);
      rev = rev * 10 + lastdigit;
      n /= 10;
    }
    System.out.println(rev);
    sc.close();
  }
}
