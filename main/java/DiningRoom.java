import java.util.ArrayList;

public class DiningRoom {

    private String roomName;
    private int roomCapacity;
    private ArrayList<Guest> guests;

    public DiningRoom(String roomName, int roomCapacity){
        this.roomName = roomName;
        this.roomCapacity = roomCapacity;
        this.guests = new ArrayList<>();
    }

    public void addGuest(Guest guest){
        this.guests.add(guest);
    }
    public void removeGuest(Guest guest){
        this.guests.remove(guest);
    }
    public boolean hasSpace(){
        return this.guests.size() < this.roomCapacity;
    }
    public String getRoomName() {
        return this.roomName;
    }
    public boolean roomHasGuests() {
        return this.guests.size() > 0;
    }
    public ArrayList getGuestsInRoom() {
        return this.guests;
    }
    public int numberOfGuestsInRoom() {
        return this.guests.size();
    }

}
