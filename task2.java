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


public class task2 {
    public static void main(String[] args) {
        String spisok = ("Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова, Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина, Мария Рыкова, Марина Лугова, Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов");
        // ArrayList<String> list = new ArrayList<String>();
        String[] array = spisok.split("\\, | ");
        int razmernost = array.length;
        String[] array_name = new String[razmernost];
        int j=0;
        for (int i = 0; i < razmernost; i += 2) {
                if (array_name[j]!=null){            
                array_name[j] = array[i];
                }j++;
            System.out.println(array_name[i]);
        }
        ArrayList<String> strList = new ArrayList<String>();
        for (int i = 0; i < array_name.length; i++) {
            strList.add(array_name[i]);
        }        
        System.out.print("The ArrayList is: " + strList);



        
        // list.add(spisok);
        // System.out.println(list);




        // String spisok = ("Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова, Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина, Мария Рыкова, Марина Лугова, Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов");
        // // формируем список имён
        // String[] array = spisok.split("\\, | ");
        // int razmernost = array.length;
        // String[] array_name = new String[razmernost];
        // for (int i = 0; i < razmernost; i += 2) {
        //     for (int j = 0; j < razmernost / 2; j++)
        //         array_name[i] = array[i];
        //     System.out.println(array_name[i]);
        // }

    }
}
