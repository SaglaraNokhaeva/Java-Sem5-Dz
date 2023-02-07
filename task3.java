import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


// На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга. 
// И вывести Доску. 0x00000 0000x00 00x0000


public class task3 {
    public static void main(String[] args) {
        int[][] twoDimArray = {{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0}};
        for (int i = 0; i < 8; i++) {  //идём по строкам
            for (int j = 0; j < 8; j++) {//идём по столбцам
                System.out.print(" " + twoDimArray[i][j] + " "); //вывод элемента
            }
            System.out.println();//перенос строки ради визуального сохранения табличной формы
        }
       
        int x[]=new int[9];
        int y[]=new int[9];
        for (int k=0;k<8;k++){
            for (int i=0;i<8;i++){
                for (int j=0;j<8;j++){
                    for (int z=0;z<k;z++){
                        if(x[z]!=i&&y[z]!=i&&x[z]-y[z]!=i-j&&x[z]+y[z]!=i+j){
                            twoDimArray[i][j]=1;
                            x[k+1]=i;
                            y[k+1]=i;
                            break;
                        }
                    }
                }
            }
        }
        for (int i = 0; i < 8; i++) {  //идём по строкам
            for (int j = 0; j < 8; j++) {//идём по столбцам
                System.out.print(" " + twoDimArray[i][j] + " "); //вывод элемента
            }
            System.out.println();//перенос строки ради визуального сохранения табличной формы
        }
        // scan.close();
    }     
}
