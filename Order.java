public class Order {
    private int orderId;
    private Book book;
    private int quantity;

    public Order(int orderId, Book book, int quantity) {
        this.orderId = orderId;
        this.book = book;
        this.quantity = quantity;
    }

    public int getOrderId() {
        return orderId;
    }

    public Book getBook() {
        return book;
    }

    public int getQuantity() {
        return quantity;
    }
}
