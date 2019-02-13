import java.util.ArrayList;

public class Hotel {

    private String name;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel(String name){
        this.name = name;
        this.bedrooms = new ArrayList<>();
        this.conferenceRooms = new ArrayList<>();
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
    public void addConferenceRoom(ConferenceRoom conferenceRoom){
        this.conferenceRooms.add(conferenceRoom);
    }

    public void addGuestToConferenceRoom(Guest guest, ConferenceRoom conferenceRoom){
        if (conferenceRoom.hasSpace()){
            conferenceRoom.addGuest(guest);
        }
    }
    public void removeGuestFromConferenceRoom(Guest guest, ConferenceRoom conferenceRoom){
        conferenceRoom.removeGuest(guest);
    }
    public int numberOfGuestsInConferenceRoom(ConferenceRoom conferenceRoom){
        return conferenceRoom.numberOfGuestsInRoom();
    }
    public int getNumberOfConferenceRooms(){
        return this.conferenceRooms.size();
    }
}
