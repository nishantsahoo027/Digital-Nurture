import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class SearchDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=================================");
        System.out.println(" E-Commerce Search System ");
        System.out.println("=================================");
        System.out.print("Enter Number of Products : ");
        int n = sc.nextInt();
        Product[] products = new Product[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter Details of Product " + (i + 1));
            System.out.print("Product ID : ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Product Name : ");
            String name = sc.nextLine();
            System.out.print("Category : ");
            String category = sc.nextLine();
            products[i] = new Product(id, name, category);
        }

        System.out.println("\nChoose Search Method");
        System.out.println("1. Linear Search");
        System.out.println("2. Binary Search");
        System.out.print("Enter Choice : ");
        int choice = sc.nextInt();
        System.out.print("Enter Product ID to Search : ");
        int searchId = sc.nextInt();
        Product result = null;
        switch (choice) {
            case 1:
                result = SearchOperations.linearSearch(products, searchId);
                System.out.println("\nLinear Search Selected");
                break;
            case 2:
                Arrays.sort(products,
                Comparator.comparingInt(p -> p.productId));
                result = SearchOperations.binarySearch(products, searchId);
                System.out.println("\nBinary Search Selected");
                break;
            default:
                System.out.println("Invalid Choice");
                sc.close();
                return;
        }

        if (result != null) {
            System.out.println("\nProduct Found\n");
            result.display();
        }
        else {
            System.out.println("\nProduct Not Found");
        }

        System.out.println("\n=================================");
        System.out.println("Time Complexity Analysis");
        System.out.println("=================================");
        System.out.println("\nLinear Search");
        System.out.println("Best Case    : O(1)");
        System.out.println("Average Case : O(n)");
        System.out.println("Worst Case   : O(n)");
        System.out.println("\nBinary Search");
        System.out.println("Best Case    : O(1)");
        System.out.println("Average Case : O(log n)");
        System.out.println("Worst Case   : O(log n)");
        System.out.println("\nConclusion");
        System.out.println("Binary Search is faster because");
        System.out.println("it repeatedly divides the search");
        System.out.println("space into halves.");
        sc.close();
    }
}