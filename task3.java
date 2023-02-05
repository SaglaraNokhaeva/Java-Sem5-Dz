import java.util.ArrayList;
import java.util.Arrays;


// На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга. 
// И вывести Доску. 0x00000 0000x00 00x0000


public class task3 {
    public static void main(String[] args) {
        Integer[] a = {0,0,0,0,0,0,0,0};
        ArrayList<Integer> str1 = new ArrayList<Integer>(Arrays.asList(a));
        System.out.println(str1);
        ArrayList<Integer> str2 = new ArrayList<Integer>(Arrays.asList(a));
        System.out.println(str2);
        ArrayList<Integer> str3 = new ArrayList<Integer>(Arrays.asList(a));
        System.out.println(str3);
        ArrayList<Integer> str4 = new ArrayList<Integer>(Arrays.asList(a));
        System.out.println(str4);
        ArrayList<Integer> str5 = new ArrayList<Integer>(Arrays.asList(a));
        System.out.println(str5);
        ArrayList<Integer> str6 = new ArrayList<Integer>(Arrays.asList(a));
        System.out.println(str6);
        ArrayList<Integer> str7 = new ArrayList<Integer>(Arrays.asList(a));
        System.out.println(str7);
        ArrayList<Integer> str8 = new ArrayList<Integer>(Arrays.asList(a));
        System.out.println(str8);
    }
    
}
