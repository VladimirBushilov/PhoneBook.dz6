package org.example;

    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.Map;
    
    public class PhoneBook {
        // Метод, который добавляет номера в книгу
        public static void addNumber(String key, int value, Map<String, ArrayList<Integer>> map) {
            if (map.containsKey(key)) {
                map.get(key).add(value);
            } else {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(value);
                map.put(key, list);
            }
        }
    
        // Метод, который печатает список контактов
        public static void printBook(Map<String, ArrayList<Integer>> map) {
            for (var item : map.entrySet()) {
                String phones = "";
                for (int el : item.getValue()) {
                    phones = phones + el + ", ";
                }
                System.out.printf("%s: %s \n", item.getKey(), phones);
            }
        }
    
        public static void main(String[] args) {
            Map<String, ArrayList<Integer>> bookPhone = new HashMap<>();
            addNumber("Зверев", 2223123, bookPhone);
            addNumber("Зверев", 2135235, bookPhone);
            addNumber("Леонтьев", 111222333, bookPhone);
            addNumber("Басков", 987876614, bookPhone);
            addNumber("Зверев", 1111111, bookPhone);
            addNumber("Леонтьев", 345634636, bookPhone);
            printBook(bookPhone);
        }
    }
    
