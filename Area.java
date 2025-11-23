import java.util.*;

public class Area {
  public static void main(String arg[]){
    Scanner sc = new Scanner(System.in);
    float red = sc.nextFloat();
    float areaofcircle = 3.14f * red * red;
    System.out.println(areaofcircle);
    sc.close();
  }
}
