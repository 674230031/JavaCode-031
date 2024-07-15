import java.util.Scanner;
public class W04_01_Areacicle {
    
    public static void main (String[] agrs) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius circle : ");
        double radius = sc.nextDouble();
        double area = 0;
        double PI=3.14159;
        if(radius > 0) {
            area = PI*radius*radius;
            System.out.println("Area circle = "+area);
        }else{
            System.out.println("Please enter radius circle greater than 0");
        }
        // double radius;    
        // radius = 10;
        
        
        
        
    }
}