package Adapter;

public class GarageDoorAdapter implements GarageDoor {
    PremiumGarageDoor this_door;
    public GarageDoorAdapter(String id){
        this_door = new PremiumGarageDoor(id);
    }

    public void open(){
        this_door.moveUp(10);
    }

    public void close(){
        this_door.moveDown(10);
    }
}
