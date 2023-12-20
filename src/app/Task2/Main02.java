package app.Task2;

import app.utils.Constants;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        getOutput(getSearchResult(getSearch(), getData()));

    }

    private static Map<String, Double> getData() {
        Map<String, Double> goods = new HashMap<>();
        goods.put("cover", 1.99);
        goods.put("smartphone", 299.95);
        goods.put("laptop", 499.99);
        goods.put("tablet", 249.95);
        goods.put("headphones", 39.99);
        return goods;
    }

    private static String getSearch() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of technique for check the price: ");
        return scanner.nextLine().trim();

    }

    private static String getSearchResult(String codeName, Map<String, Double> goods) {
        boolean hasContain = goods.containsKey(codeName);
        if (hasContain) {
            Double name = goods.get(codeName);
            return codeName + " is cost " + Constants.CURRENCY + name;

        } else return codeName + " is not found";


    }

    private static void getOutput(String output) {
        System.out.println(output);
    }

}
