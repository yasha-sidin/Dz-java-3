package Homework3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Task2 {
    public static void main(String[] args) {
        List<ArrayList<String>> products = new ArrayList<ArrayList<String>>();
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите количество категорий товаров: ");
        int amountOfCategories = iScanner.nextInt();

        for(int i = 0; i < amountOfCategories; i++) {
            System.out.print("Введите название категории: ");
            String nameOfCategory = iScanner.next();
            products.add(new ArrayList<String>());
            products.get(i).add(nameOfCategory);

            System.out.print("Введите количество товаров в данной категории: ");
            int amountInCategory = iScanner.nextInt();
            System.out.println("Введите через Enter товары, которые будут входить в данную категорию: ");
            for(int j = 0; j < amountInCategory; j++) {
                String productInCategory = iScanner.next();
                products.get(i).add(productInCategory);
            }
        }
        System.out.println(products);
        iScanner.close();

    }
}
