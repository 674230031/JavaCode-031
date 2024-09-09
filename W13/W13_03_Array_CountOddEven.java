package W13;

public class W13_03_Array_CountOddEven {

    public static void main(String[] arg) {
        // ให้นับเลขคู่เลขคี่ใน array ด้านล่าง
        int[] number = {1, 4, 5, 7, 10, 11, 15, 17, 20, 21, 22};

        int countOdd = 0;
        int countEven = 0;

        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
            if (number[i] % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }
        System.out.println("\nAmount of all number: " + number.length);
        System.out.println("Amount of Odd number: " + countOdd);
        System.out.println("Amount of Even number: " + countEven);
    }
}
