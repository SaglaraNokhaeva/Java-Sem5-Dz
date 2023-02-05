import java.util.List;

// Пусть дан список сотрудников:
// Иван Иванов
// Светлана Петрова
// Кристина Белова
// Анна Мусина
// Анна Крутова
// Иван Юрин
// Петр Лыков
// Павел Чернов
// Петр Чернышов
// Мария Федорова
// Марина Светлова
// Мария Савина
// Мария Рыкова
// Марина Лугова
// Анна Владимирова
// Иван Мечников
// Петр Петин
// Иван Ежов

// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности Имени.

import java.util.ArrayList;
import java.sql.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Comparator;

public class task2 {
    public static void main(String[] args) {
        String spisok = ("Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова, Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина, Мария Рыкова, Марина Лугова, Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов, Светлана Рыжова");
        // Сплитуем по запятой
        String[] array = spisok.split("\\, | ");
        int razmernost = array.length;
               // Создаём лист с именами
        String[] array_name = new String[razmernost / 2];
        int j = 0;
        for (int i = 0; i < razmernost / 2; i++) {
            array_name[i] = array[j];
            j += 2;
            // System.out.println(array_name[i]);
        }
        ArrayList<String> strList = new ArrayList<String>();
        for (int i = 0; i < array_name.length; i++) {
            strList.add(array_name[i]);
        }
        // Сортировка по алфавиту
        strList.sort(Comparator.naturalOrder());
        System.out.print("The ArrayList is: " + strList);
        System.out.println();
        // Сортировка по убыванию
        int count=1;
        int max=1;
        for (int i = 0; i < razmernost / 2-1; i++) {
            
            if (strList.get(i).equals(strList.get(i+1))){
                count++;                              
            }
            else{
                if (count>max){
                    max=count;
                    System.out.println("The count is: " +count); 
                    System.out.println("The max is: " +max);
                
                }System.out.printf("%s = %d; \n",strList.get(i),count);
                count=1;
            }           
        }
        
        System.out.printf("%s = %d; \n",strList.get(razmernost / 2-1),count);
        System.out.println(max);
    }
}
