public class InvoiceTest {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("ABC123", "Apple", 5, 1.99);

        System.out.println("Part Number: " + invoice.getPartNumber());
        System.out.println("Part Description: " + invoice.getPartDescription());
        System.out.println("Quantity: " + invoice.getQuantity());
        System.out.println("Price per Item: $" + invoice.getPricePerItem());
        System.out.println("Total Invoice Amount: $" + invoice.getInvoiceAmount());

        invoice.setQuantity(-3);
        invoice.setPricePerItem(-50.0);

        System.out.println("\nAfter setting negative values:");
        System.out.println("Quantity: " + invoice.getQuantity());
        System.out.println("Price per Item: $" + invoice.getPricePerItem());
        System.out.println("Total Invoice Amount: $" + invoice.getInvoiceAmount());
    }
}
