import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class product {
    String id;
    String name;
    double price;



    public product(String id, String name, double price) { // constructor to initialize initial value
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

class ManageProduct {
    Map<String, product> products;

    public ManageProduct() {
        this.products = new HashMap<>();
    }

    public void addProduct(String name, double price) {
        String id = UUID.randomUUID().toString();
        this.products.put(id, new product(id, name, price));
    }

    public void deleteProduct(String id) {
        this.products.remove(id);
    }

    public void editProduct(String id, String newName, double newPrice) {
        product product = this.products.get(id);
        if (product != null) {
            product.name = newName;
            product.price = newPrice;
        }
    }

    public product getProduct(String id) {
        return this.products.get(id);
    }
}
