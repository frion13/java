// Пусть дан список сотрудников: Иван, Пётр, Антон и так далее. 
// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
//  Отсортировать по убыванию популярности.


import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class task2 {
    public static void main(String[] args) {
        List<String> listing = new ArrayList<>();
        listing.add("Иван");
        listing.add("Иван");
        listing.add("Пётр");
        listing.add("Антон");
        listing.add("Михаил");
        listing.add("Пётр");
        listing.add("София");
        listing.add("Пётр");
        listing.add("Иван");
        listing.add("Иван");
        listing.add("Анатолий");
        listing.add("Михаил");

        System.out.println("Список сотрудников: " + listing);
        Map<String, Integer> listings = new HashMap<>();
        for (int i = 0; i < listing.size(); i++) {
            int count = 1;
            for (int j = 0; j < listing.size(); j++) {
                if (listing.get(i).equals(listing.get(j)))
                    count++;
                if (count > 1 || j == listing.size() - 1)
                    listings.put(listing.get(i), count - 1);
            }
        }

        Map<String, Integer> sortedMap = listings.entrySet().stream()
                .sorted(Comparator.comparingInt(e -> -e.getValue()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a, b) -> {
                            throw new AssertionError();
                        },
                        LinkedHashMap::new));
        System.out.println("Отсортированный по убыванию популярности список сотрудников: ");
        sortedMap.entrySet().forEach(System.out::println);
    }
}