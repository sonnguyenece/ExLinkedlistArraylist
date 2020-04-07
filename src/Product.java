public class Product implements Comparable<Product> {
    private String nameProduct;
    private String id;
    private float price;

    Product() {

    }

    Product(String nameProduct, String id, float price) {
        this.nameProduct = nameProduct;
        this.id = id;
        this.price = price;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public String getId() {
        return id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    @Override
    public String toString() {
        return "Product{" +
                "nameProduct='" + nameProduct + '\'' +
                ", id='" + id + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Product product) {
        return this.getNameProduct().compareTo(product.getNameProduct());
    }
}
