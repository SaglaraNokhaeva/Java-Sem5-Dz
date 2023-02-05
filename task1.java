// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.

import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {

        LinkedList<String> intList = new LinkedList<String>();
        Map<Integer, LinkedList<String>> listMap = new HashMap<Integer, LinkedList<String>>();
        int key=0;

        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите команду:'add' - для добавление нового контакта; 'stop' - для выхода: ");
            String str = in.nextLine();

            if (str.equals("add")) {
                key++;
                System.out.print("Введите фамилию контакта: ");
                String sekond_name = in.nextLine();
                System.out.print("Введите Имя контакта: ");
                String first_name = in.nextLine();
                System.out.print("Введите номер телефона: ");
                String phone = in.nextLine();
                intList.add(sekond_name);
                intList.add(first_name);
                intList.add(phone);

                // добавление нескольких номеров, если они имеются
                while (true) {
                    System.out
                            .println(
                                    "Введите команду:'+' - для ввода ещё одного номера; 'ok' - для добавления контакта: ");
                    str = in.nextLine();
                    if (str.equals("+")) {
                        System.out.print("Введите номер телефона: ");
                        phone = in.nextLine();
                        intList.add(phone);
                    }
                    if (str.equals("ok")) {
                        break;
                    }
                }

                listMap.putIfAbsent(key, intList);
                System.out.println(listMap);
            String abon = listMap.toString();  
            try (FileWriter writer = new FileWriter("phoneBook.txt", true)) {
                writer.append(abon);                
                writer.append('\n');

                writer.flush();
            } catch (Exception e) {

                System.out.println("что-то не так");
            }
            if (str.equals("stop")) {
                break;
            }   
                            
            }
            

        }
    }
}
