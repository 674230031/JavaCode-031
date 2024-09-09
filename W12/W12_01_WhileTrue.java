package W12;

public class W12_01_WhileTrue {

    public static void main(String[] args) {

        int i = 1;                      // กำหนดค่าเริ่มต้น
        while (true) {
            i++;                            // เพิ่มค่า i ที่ละ 1
            System.out.print(i + " ");    //แสดงค่า 1                        
                                      

            if (i >= 1000) {
                break;                    //ออกจากลูป
            }

            // ตรวจสอบเงื่อนไข ถ้ารอบมากกว่าหรือเท่ากับ 1000 ให้ออกจากลูป
            // ออกจากลูป                            
        }
    }
}
