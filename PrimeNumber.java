import java.util.*;

public class PrimeNumber {
  public static void main(String arg[]){
    Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      if(n == 2){
        System.out.println("this is prime number.");
      }else{
        boolean primenum = true;
          // for(int i=2;i<= n-1; i++){ 
          for(int i=2;i<= Math.sqrt(n); i++){ 
            if(n%i == 0){
              primenum = false;
            }
          }

          if(primenum == true){
            System.out.println("this number is prime");
          }else{
            System.out.println("sorry! this is not prime number");
          }
      }
    sc.close();
  }
}