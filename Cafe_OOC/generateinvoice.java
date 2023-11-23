
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
class GenerateInvoice extends product {

    public GenerateInvoice() {
        super();
        this.GenerateInvoice = new HashMap<>();
    }

    public void addProductToBill(String invoiceId, String productId, int quantity) { //how id of bill can be generated when each bill has been checked out?
        GenerateInvoice invoice = this.invoices.get(invoiceId);
        product product = this.getproduct(productId);
        if (invoice != null && product != null) {
            invoice.addProduct(product, quantity);
        }
    }

    public void generateBill(String invoiceId) {
        String id = UUID.randomUUID().toString(); 
        this.invoices.put(id, new Invoice(id));
    }

    public GenerateInvoice getInvoice(String id) {
        return this.invoices.get(id);
    }
}