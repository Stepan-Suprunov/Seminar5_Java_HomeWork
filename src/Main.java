// Домашнее задание к семинару №5 JAVA API Супрунов Степан

import tasks.FindRepeatingNames;
import tasks.PhoneBook;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    private static final Map<String, List<String>> myPhoneBook = new HashMap<>();

    public static void main(String[] args) {
        PhoneBook.addToPhoneBook(myPhoneBook);
        PhoneBook.addToPhoneBook(myPhoneBook);
        PhoneBook.addToPhoneBook(myPhoneBook);
        System.out.println();
        FindRepeatingNames.findRepeats();
    }
}