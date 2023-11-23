import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class viewrecord extends GenerateInvoice {
        public viewrecord() {
            super();
        }
    
        public void getRecord(String invoiceId) {
            GenerateInvoice invoice = this.getInvoice(invoiceId);
            if (invoice != null) {
                System.out.println("Invoice ID: " + invoice.id);
                // System.out.println("Total: " + invoice.calculateTotal());
            }
        }
    }

