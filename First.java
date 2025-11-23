import java.util.*;
public class First{
  public static void main(String arg[]){
    // System.out.print("jai shree ram");
    Scanner sc = new Scanner(System.in);
      // String input = sc.next(); // this is for signle word print break after space
      // System.out.print(input);
      // String input = sc.nextLine(); // this is for a sentence printing
      // System.out.print(input);

      // int num = sc.nextInt();
      // System.out.print(num); // this is for taking number value

      // boolean bul = sc.nextBoolean();
      // if(bul == true){        
      //   System.out.print("this is true");
      // }else{
      //   System.out.print("this is false");
      // }

      int a=63,b=36;
      boolean x= (a<b)?true:false;
      int y= (a>b)?a:b;
      System.out.println(x +","+y);
    sc.close();

  }
}