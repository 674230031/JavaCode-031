import java.util.Scanner;
public class Home06_24_7{
    public static void main (String[]args){
    System.out.println("ชื่อนักศึกษาสุริยา เดชมณี");
    System.out.println("คะแนนที่ได้");
    Scanner kb = new Scanner(System.in);
    int score = kb.nextInt();

    if (score >=101){
    
    System.out.println("Please enter a value between 0 and 100");

    }else if (score <=0){
        System.out.println("Please enter a value between 0 and 100");
    }else if (score <=49){
        System.out.println("เกรดที่ได้ E");        
    }else if (score <=59){
        System.out.println("เกรดที่ได้ D"); 
    }else if (score <=69){
        System.out.println("เกรดที่ได้ C"); 
    }else if (score <=79){
        System.out.println("เกรดที่ได้ B"); 
    }else{
        System.out.println("เกรดที่ได้ A"); 
    }
    }
}