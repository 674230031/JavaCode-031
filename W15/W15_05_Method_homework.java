package W15;

import java.util.Scanner;

public class W15_05_Method_homework {
    // method ตามหาวีธีคิด
    static int calculate(int factorial) {
        // สร้างตัวแปรใหม่ให้เป็น 1 เพราะว่า 1 คูณกับอะไรก็จะได้เท่าเดิมเวลาดูแลจะไม่มีผลอะไร
        int num = 1;
        // โชว์
        System.out.print("Factorial for " + factorial + " is ");
        // วนลูป for เพื่อหาคำตอบและเขียนสูตร
        for (int i = 1; i <= factorial; i++) {
            // แสดงค่าตัวที่มาคูณ
            System.out.print(i);
            // ใช้ if else ใส่เครื่องหมายถ้าตัว i น้อยกว่าค่าจากคีย์บอร์ดใส่ x ถ้าไม่ใช่จะใส่ =
            if (i < factorial) {
                System.out.print(" x ");
            } else {
                System.out.print(" = ");
            }
            // หาผลลัพธ์
            num = num * i;
        }
        // ให้ factorial ให้ตัวเองมีค่าเท่ากับคำตอบ
        factorial = num;
        return factorial;
    }

    public static void main(String[] args) {
        // รับค่าจากคีย์บอร์ด
        Scanner mj = new Scanner(System.in);
        System.out.print("Enter Numbar ");
        int factorial = mj.nextInt();
        // แสดงผล method calculate
        System.out.println(calculate(factorial));
    }
}