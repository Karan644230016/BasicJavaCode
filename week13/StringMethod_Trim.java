package week13;

public class StringMethod_Trim {
    public static void main(String[] args) {
        String fullname = "   Karan Khanthong   ";
        System.out.println("มีตัวอักษร = "+fullname.length());

        // . trim()  ตัดช่องว่างหน้าหลังออก
        String a = fullname.trim();
        //System.out.println(fullname.trim());
        System.out.println(a.length());

        // .indexof() แสดงผลตำแหน่งที่ขออักษร
        System.out.println(fullname.indexOf("Ka"));

        //.toUpperCase()  .toLowerCase()
        System.out.println(fullname.toUpperCase());
        System.out.println(fullname.toLowerCase());

        // .substring()  ตัดคำที่ต้องการ
        String uni = "Nakhon pathom Rajabhat Uiversity";
        System.out.println(uni.substring(5,10));
    
    }
}
