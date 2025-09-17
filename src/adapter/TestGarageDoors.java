package Adapter;

public class TestGarageDoors {
    public static void main(String[] args) {
        GarageDoorAdapter my_door = new GarageDoorAdapter("17");

        my_door.open();
        my_door.close();
    }
}
