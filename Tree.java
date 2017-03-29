package InitDnepr.Tree;

import java.util.Scanner;

/**
 * Created by d1mys1klapo4ka on 30.03.2017.
 */
public class Tree {

    final static String DEFAULT_NAME = "sprout";
    final static double DEFAULT_HEIGHT = 1.0;
    private String name;
    private double height;
    private static int count;

    public static int getCount() {
        return count;
    }

    public Tree(String name){
        this(name, DEFAULT_HEIGHT);
    }

    public Tree(String name, double height){
        this.name = name;
        this.height = height;
        count++;
    }

    public void printInformation(){
        System.out.println("Name: " + this.name + " Height: " + this.height);
    }

    static int getInt() {

        Scanner scanner = new Scanner(System.in);
        int treeNumber = 0;
        System.out.println("Введите количество.");
        if (!scanner.hasNextInt()) {

            System.out.println("get integer number");
            System.out.println();
        }else {
            treeNumber = scanner.nextInt();
        }
        return treeNumber;
    }
}
