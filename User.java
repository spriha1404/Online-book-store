import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private String password;
    private List<Order> orders;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.orders = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public boolean checkPassword(String password) {
        return this.password.equals(password);
    }

    public void addOrder(Order order) {
        orders.add(order);
    }
}
