import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductManager {
    List<Product> products;

    ProductManager() {
        products = new ArrayList<Product>();
    }

    public void add(Product product) {
        products.add(product);
    }

    public String fixWithID(String id, String newName, String newID, float newPrice) {
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            if (id.compareTo(product.getId()) == 0) {
                product.setNameProduct(newName);
                product.setId(newID);
                product.setPrice(newPrice);
                return "fixed";
            }
        }
        return "cant find that ID";
    }

    public String removeWithID(String id) {
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            if (id.compareTo(product.getId()) == 0) {
                products.remove(i);
                return "removed";
            }
        }
        return "cant find that ID";
    }

    public void display() {
        for (Product product : products) {
            System.out.printf("%-8s%-8s%-5.2f\n", product.getNameProduct(), product.getId(), product.getPrice());
        }
    }

    public void search(String name) {
        boolean checkSearch = false;
        for (Product product : products) {
            if (name.compareTo(product.getNameProduct()) == 0) {
                System.out.printf("%10s%5s%5.2f", product.getNameProduct(), product.getId(), product.getPrice());
                checkSearch = true;
            }
        }
        if (!checkSearch) System.out.println("cant find that product");
    }

    public void sortByName() {
        Collections.sort(products);
        display();
    }

    public void sortByPrice() {
        PriceComparator priceComparator = new PriceComparator();
        products.sort(priceComparator);
        display();
    }

}
