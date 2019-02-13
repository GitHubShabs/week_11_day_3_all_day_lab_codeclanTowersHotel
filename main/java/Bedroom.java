import java.util.ArrayList;

public class Bedroom {
    private int roomNumber;
    private int roomCapacity;
    private String roomType;
    private ArrayList<Guest> guests;

    public Bedroom(int roomNumber, int roomCapacity, String roomType){
        this.roomNumber = roomNumber;
        this.roomCapacity = roomCapacity;
        this.roomType = roomType;
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
    public int getRoomNumber() {
        return this.roomNumber;
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
