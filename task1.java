// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.

import java.util.Scanner;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class task1 {
    
    public static void main(String[] args) {
        // LinkedList <String> contact = new LinkedList<>();
        Map<Integer, LinkedList> db = new HashMap<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите: 1, - добавление контакта, 2 - печать тел. книги");
        Integer act = scan.nextInt();
        if (act==1){            
            System.out.println("Введите фамилию контакта: ");
            String sekond_name=scan.nextLine();
            System.out.println("Введите Имя контакта: ");
            String first_name=scan.nextLine();
            int i=0;
            Map.put(i,[sekond_name,first_name]);

            




        }

        if (act==2){

        }
        
        

        for (int str : db.keySet()) {

            if (db.get(str).equals(sekond_name)) {
                System.out.printf("%s %s \n", str, db.get(str));
            }

        }
    }

}
