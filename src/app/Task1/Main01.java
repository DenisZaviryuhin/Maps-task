package app.Task1;

import app.utils.Constants;

import java.util.HashMap;
import java.util.Map;


public class Main01 {

    public static void main(String[] args) {
        showData(getData());
        showUpdatedData(getData());

    }

    private static Map<String, Integer> getData() {
        Map<String, Integer> products = new HashMap<>();
        products.put("orange", 12);
        products.put("banana", 25);
        products.put("lemon", 8);
        products.put("pineapple", 13);
        products.put("grape", 9);
        return products;
    }

    private static void showData(Map<String, Integer> products) {
        int count = 0;
        System.out.println("Initial data:");
        for (Map.Entry<String, Integer> unit : products.entrySet()) {
            count++;
            System.out.println(count + ") " + unit.getKey() + ", " + unit.getValue() + Constants.MEASURE);

        }
    }

    private static void showUpdatedData(Map<String, Integer> products) {
        products.replace("banana", 14);
        products.putIfAbsent("plum", 15);
        int count = 0;
        System.out.println("\nUpdated data:");
        for (Map.Entry<String, Integer> unit : products.entrySet()) {
            count++;
            System.out.println(count + ") " + unit.getKey() + ", " + unit.getValue() + Constants.MEASURE);

        }

    }
}
