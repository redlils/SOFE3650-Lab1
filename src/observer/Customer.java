package observer;

public class Customer extends Observer {

    String name;
    float discount;
    Store favouriteStore;

    public Customer(String name, Store favouriteStore) {
        this.name = name;
        this.favouriteStore = favouriteStore;
        // Automatically register the favourite store
        register(favouriteStore);
        this.discount = 0.0f;
    }

    @Override
    void update(float discount) {
        System.out.println("Updating discount for customer \"" + name + "\" to " + discount + ".");
    }

    void register(Store store) {
        System.out.println("Registering customer \"" + name +"\" to store \"" + store.name + "\".");
        store.register(this);
    }

    void unregister(Store store) {
        System.out.println("Unregistering customer \"" + name +"\" from store \"" + store.name + "\".");
        store.unregister(this);
    }
}
