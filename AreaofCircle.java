//Area of circle -: Pi*(r*r)
  
import java.util.*;

public class AreaofCircle {
    public static void main(String args[]){
        float pi = 3.14f;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of circle -:");
        float radius = sc.nextFloat();
        float area = pi*(radius*radius);
        System.out.println("Area of circle is -:" +area);
    }
}
