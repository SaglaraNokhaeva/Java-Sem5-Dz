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

        Scanner in = new Scanner(System.in);
        System.out.print("Введите фамилию контакта: ");
        String sekond_name = in.nextLine();
        System.out.print("Введите Имя контакта: ");
        String first_name = in.nextLine();
        
        
        while (true) {

            System.out.println("Введите команду:'ok' для добавления контакта;'+' ввода ещё одного номера: ");
            String str = in.nextLine();
            if (str.equals("ok"))

                break;
            
            if (str.equals("+")) {
                stack.push(Calcul());
            }
            
            if (str.equals("cancel")) {
                stack.pop();
                System.out.println(stack.peek());
            }             
        }
                  
        
        System.out.print("Введите номер телефона: ");
        String phone = in.nextLine();

        intList.add(sekond_name);
        intList.add(first_name);
        intList.add(phone);
        listMap.put(1, intList);
        System.out.println(listMap);
        String abon = listMap.toString();

        try (FileWriter writer = new FileWriter("phoneBook.txt", true)) {
            writer.append(abon);
            // writer.write(text);
            writer.append('\n');

            writer.flush();
        } catch (Exception e) {

            System.out.println("что-то не так");

        }

    }
}