public class W03_NetPrice {
    public static void main (String [] args){
        // สร้างตัวแปรเพื่อเก็บค่าของแต่ละอย่าง
        short price = 350; 
        byte quantity = 10;

        int totalPrice = price * quantity;
        int discount = totalPrice * 5 / 100;
        int netPrice = totalPrice - discount;

            System.out.println("total price = "+( totalPrice + "Baht"));
            System.out.println("discount = "+( discount + "Baht"));
            System.out.println("netprice = "+( netPrice + "Baht"));
        
    }
}