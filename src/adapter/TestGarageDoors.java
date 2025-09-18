package Adapter;

public class TestGarageDoors {
    public static void main(String[] args) {
        GarageDoorAdapter my_door = new GarageDoorAdapter("17");
        PremiumGarageDoor door = new PremiumGarageDoor("premium");
        
        my_door.open(); // no speed (for basic door)
        my_door.close(); // no speed (for basic door)

        door.moveUp(20.0); // speed given (for premium door) ; opening
        door.moveDown(15.0); // speed given (for premium door) ; closing    

    }
}
