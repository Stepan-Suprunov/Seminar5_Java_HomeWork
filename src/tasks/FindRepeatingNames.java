// Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений.
// Отсортировать по убыванию популярности.

package tasks;

import java.util.*;

public class FindRepeatingNames {

    static Comparator<Map.Entry<String, Integer>> comparator = new Comparator<>() {
        @Override
        public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
            return o2.getValue().compareTo(o1.getValue());
        }
    };

    public static ArrayList<String> getList() {
        ArrayList<String> names = new ArrayList<>();
        names.add("Иван Иванов");
        names.add("Светлана Петрова");
        names.add("Кристина Белова");
        names.add("Анна Мусина");
        names.add("Анна Крутова");
        names.add("Иван Юрин");
        names.add("Петр Лыков");
        names.add("Павел Чернов");
        names.add("Иван Иванов");
        names.add("Петр Чернышов");
        names.add("Мария Федорова");
        names.add("Марина Светлова");
        names.add("Мария Савина");
        names.add("Иван Иванов");
        names.add("Мария Рыкова");
        names.add("Анна Крутова");
        names.add("Марина Лугова");
        names.add("Анна Владимирова");
        names.add("Петр Лыков");
        names.add("Иван Мечников");
        names.add("Петр Петин");
        names.add("Петр Лыков");
        names.add("Иван Ежов");
        names.add("Иван Ежов");
        names.add("Иван Ежов");
        names.add("Иван Ежов");
        return names;
    }

    private static final Map<String, Integer> namesRepeats = new HashMap<>();

    public static void findRepeats() {
        ArrayList<String> names = getList();
        for (int i = 0; i < names.size(); i++) {
            if (namesRepeats.get(names.get(i)) == null) {
                namesRepeats.put(names.get(i), 1);
            } else {
                namesRepeats.put(names.get(i), namesRepeats.get(names.get(i)) + 1);
            }
        }
        for (int i = 0; i < names.size(); i++) {
            namesRepeats.putIfAbsent(names.get(i), 1);
            if (namesRepeats.get(names.get(i)) == 1) {
                namesRepeats.remove(names.get(i));
            }
        }
        Map<String, Integer> mapSorted = new LinkedHashMap<>();
        List<Map.Entry<String, Integer>> entries = new LinkedList<>(namesRepeats.entrySet());
        entries.sort(comparator);
        for (Map.Entry<String, Integer> entry : entries) {
            mapSorted.put(entry.getKey(), entry.getValue());
        }
        System.out.println(mapSorted);
    }
}
