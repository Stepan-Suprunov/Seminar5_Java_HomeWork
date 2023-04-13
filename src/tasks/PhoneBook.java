// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.

package tasks;

import java.util.*;

public class PhoneBook {
    public static Map<String, String> phoneBook = new HashMap<>();

    public static Map<String, List<String>> addToPhoneBook(Map<String, List<String>> map) {
        System.out.print("Введите Имя нового Абонента -> ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.print("Введите колличество номеров -> ");
        int quantity;
        quantity = scanner.nextInt();
        List<String> numbers = new ArrayList<>();
        for (int i = 0; i < quantity; i++) {
            System.out.print("Введите номер без пробелов -> ");
            numbers.add(scanner.next());
        }
        map.put(name, numbers);
        System.out.println(map);
        return map;
    }
}
