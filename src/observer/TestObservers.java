package observer;

public class TestObservers {
    public static void main(String[] args) {
        Store walmart = new Store("Walmart", 10.0f);
        Store costco = new Store("Costco", 15.0f);

        Customer customer1 = new Customer("John Doe", walmart);
        Customer customer2 = new Customer("Jane Doe", costco);
    }
}
