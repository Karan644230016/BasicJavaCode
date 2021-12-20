package week15;

public class Array_Insert_To100 {
    public static void main(String[]args){
        int x = 1;
        int [] m =new int [100];
        for (int i = 0; i < m.length; i++) {
            m[i] = x;
            x = m[i]+1;
            System.out.print(m[i]+" ");
            
        }
    }
}
