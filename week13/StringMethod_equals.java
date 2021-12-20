package week13;

public class StringMethod_equals {
    public static void main(String[] args) {
        String lastname1 = "Khanthong";
        String lastname2 = "khanthong";

            //เปรียนเทียบเท่ากัน .equals()s
        boolean result = lastname1.equals(lastname2);
        // System.out.println(result);

        //เปรียนเทียบเท่ากันไม่สนใจอักษรเล็กหรือใหญ่ .equals()s 
        boolean result2 = lastname1.equalsIgnoreCase(lastname2);

        if (result2 == true) {
            System.out.println(lastname1 + "  เหมือนกับ  " + lastname2);

        } else {
            System.out.println(lastname1 + "  ไม่เหมือนกับ  " + lastname2);

        }

    }
}
