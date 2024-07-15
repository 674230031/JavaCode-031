import java.util.Scanner;
public class W04_02_ifElse_compareNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first numbers: ");
        int num1 = input.nextInt();
        System.out.println("Enter the second numbers: ");
        int num2 = input.nextInt();

        int result = 0;

        if(num1>num2) {
            System.out.println("The numbers 1 is greater than the numbers 2");
            result = num1-num2;
        } else {
            System.out.println("The number 1 is less than or epual to the number 2");
            result = num1+num2;
        }
        System.out.println("The result is:" + result);
    }
}