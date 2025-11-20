import java.util.*;
public class Assigment1 {
  public static void main(String args[]){
    /*
      Question1:Inaprogram,input3numbers:A,BandC.Youhavetooutputtheaverageofthese 3 numbers.
      (Hint : Average of N numbers is sum of those numbers divided by N)
    */
      Scanner sc = new Scanner(System.in);
      System.out.println("enter value of a");
      int a = sc.nextInt();
      System.out.println("enter value of b");
      int b = sc.nextInt();
      System.out.println("enter value of c");
      int c = sc.nextInt();
      System.out.println("avg of all number : ");
      int avg = (a + b + c) / 3;
      System.out.print(avg);

    sc.close();

  

  }
}
