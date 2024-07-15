import java.util.Scanner;
public class W05_01_ifElse_OddEvenNumber {
    public static void main (String [] arg){
    Scanner kb = new Scanner(System.in); {
    System.out.print("Enter The Number: ");
        int number = kb.nextInt();
        int result = number%2;
        
        // Case 1
        if(result!=0){
            System.out.println(number + " is an odd number.");
        }else{
            System.out.println(number + " is an even number. ");

        // Case 2
        //  if(result==1){
        //     System.out.println(number + " is an odd number.");
        // }else{
        //     System.out.println(number + " is an even number. ");

        // Case 3
        //  if(result==0){
        //     System.out.println(number + " is an even number.");
        // }else{
        //     System.out.println(number + " is an odd number. ");

        // Case4
        //  if(result!=1){
        //     System.out.println(number + " is an even number.");
        // }else{
        //     System.out.println(number + " is an odd number. ");
        }
    }   
}
}