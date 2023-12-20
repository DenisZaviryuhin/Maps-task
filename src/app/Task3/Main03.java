package app.Task3;

import java.util.LinkedHashMap;
import java.util.Map;


public class Main03 {
    public static void main(String[] args) {
        showData(getData());
        showUpdatedData(getData());

    }

    private static LinkedHashMap<String, String> getData() {
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        map.put("Tom", "tom@mail.com");
        map.put("Lisa", "lisa@mail.com");
        map.put("Alice", "alisa.@mail.com");
        map.put("Denis", "den@mail.com");
        return map;

    }

    private static void showData(LinkedHashMap<String, String> map) {
        int count = 0;
        System.out.println("Initial contacts:");
        for (Map.Entry<String, String> contact : map.entrySet()) {
            count++;
            System.out.println(count + ") " + contact.getKey() + ", " + contact.getValue());
        }
    }

    private static void showUpdatedData(LinkedHashMap<String, String> map) {
        map.replace("Tom", "tomasdev@glob.net");
        int count = 0;
        System.out.println("Updated contacts:");
        for (Map.Entry<String, String> contact : map.entrySet()) {
            count++;
            System.out.println(count + ") " + contact.getKey() + ", " + contact.getValue());
        }
    }
}
