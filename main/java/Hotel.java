import java.util.ArrayList;

public class Hotel {

    private String name;
    private ArrayList<Bedroom> bedrooms;

    public Hotel(String name){
        this.name = name;
        this.bedrooms = new ArrayList<>();
    }

    public void addBedRoom(Bedroom bedroom){
        this.bedrooms.add(bedroom);
    }


    public void addGuestToBedRoom(Guest guest, Bedroom bedroom){
        if (bedroom.hasSpace()){
            bedroom.addGuest(guest);
        }
    }
     public void removeGuestFromBedRoom(Guest guest, Bedroom bedroom){
        bedroom.removeGuest(guest);
    }
    public int numberOfGuestsInRoom(Bedroom bedroom){
        return bedroom.numberOfGuestsInRoom();
    }
    public String getName() {
        return this.name;
    }
    public int getNumberOfBedrooms(){
        return this.bedrooms.size();
    }
}
