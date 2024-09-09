package W13;

public class W13_01_introArray {

    public static void main(String[] args) {
        // ประกาศตัวแปรชนิด Array แบบที่1 - รู้จำนวนข้อมูลล่วงหน้า
        String[] colors = {"Purple", "Cyan", "blue", "Green", "Yellow", "Orange", "Red"};
        // String colors [] or String [] colors เขียนได้2แบบ
        int[] banks = {20, 50, 100, 500, 1000};
        char[] Alphabet = {'A', 'B', 'C', 'D', 'E'};

        // แสดงผลลัพธ์โดยใช้ index ของ array
        System.out.println("The first color is " + colors[0]);
        System.out.println("The Third alphabet is " + Alphabet[2]);

        // แสดงผลโดยใช้ Loop
        System.out.println(" ");
        System.out.println("=============================");
        System.out.println("Colors in the array are:");
        for (int i = 0; i < 7; i++) {
            System.out.print(colors[i] + " ");
        }
        System.out.println(" ");
        for (int i = 6; i >= 0; i--) {
            System.out.print(colors[i] + " ");

        }
        System.err.println(" ");
        System.out.println("=============================");
        System.out.println("Banks in the array are:");
        for (int i = 0; i < banks.length; i++) {   //ใช้ .length ในการหาขนาดของ Array
            System.out.print(banks[i] + " ");
        }
    }
}
