import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Snack", "5sn", 5f);
        Product product2 = new Product("Fruit", "65fr", 6.5f);
        Product product3 = new Product("Candy", "451cd", 4.5f);
        Product product4 = new Product("Biscuit", "3bs", 3f);
        Product product5 = new Product("Donut", "10dn", 10f);
        Product product6 = new Product("Cola", "52cl", 5.2f);
        ProductManager products = new ProductManager();

        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);
        products.add(product6);
        products.display();

        System.out.println("\nSorted by name:");
        products.sortByName();

        System.out.println("\nSorted by price:");
        products.sortByPrice();

//        products.fixWithID("10dn","Shit","100shit",100f);
//        products.fixWithID("100dn","Shit","100shit",100f);
//        System.out.println("\nAfter fixed");
//        products.display();

//        products.removeWithID("100shit");
//        products.removeWithID("100dn");
//        System.out.println("\nAfter removed");
//        products.display();
//
//        System.out.print("\nSearched product (Cola): ");
//        products.search("Cola");
//        System.out.print("\nSearched product (Toy): ");
//        products.search("Toy");

    }
}
