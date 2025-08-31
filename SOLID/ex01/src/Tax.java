public class Tax {
    private double taxRate;

    public Tax(double taxRate) {
        this.taxRate = taxRate;
    }

    double totalWithTax(double subtotal) {
        return subtotal + subtotal * taxRate;
    }
}