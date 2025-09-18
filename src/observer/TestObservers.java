package observer;

public class TestObservers {
    public static void main(String[] args) {
        // create stores
        Store walmart = new Store("Walmart", 10.0f);
        Store costco = new Store("Costco", 15.0f);

        // create customers and register them to their favourite stores
        Customer customer1 = new Customer("John Doe", walmart);
        Customer customer2 = new Customer("Jane Doe", costco);

        customer1.register(costco);
        customer2.register(walmart);

        // change discounts and see the notifications
        walmart.setDiscount("new years", 20.0f);
        costco.setDiscount("black friday", 25.0f);

        // unregister customer1 from costco and change discount again
        customer1.unregister(costco);
        
        // change discounts and see the notifications
        walmart.setDiscount("easter", 30.0f);
    }
}
