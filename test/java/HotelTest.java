import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Bedroom bedroom1, bedroom2, bedroom3, bedroom4;
    ConferenceRoom conf1, conf2, conf3, conf4;
    DiningRoom din1, din2, din3, din4;
    Guest guest1, guest2, guest3;

    @Before
    public void before(){
        hotel = new Hotel("CodeClanTowers");
        guest1 = new Guest("Bob");
        guest2 = new Guest("Mary");
        guest3 = new Guest("Sue");
        bedroom1 = new Bedroom(100, 2, "Double");
        bedroom2 = new Bedroom(101, 4, "Double");
        bedroom3 = new Bedroom(102, 5, "Double");
        bedroom4 = new Bedroom(103, 3, "Double");
        hotel.addBedRoom(bedroom1);
        hotel.addBedRoom(bedroom2);
        hotel.addBedRoom(bedroom3);
        hotel.addBedRoom(bedroom4);
        conf1 = new ConferenceRoom("Tom", 2);
        conf2 = new ConferenceRoom("Jerry", 4);
        conf3 = new ConferenceRoom("Itchy", 5);
        conf4 = new ConferenceRoom("Scratchy", 3);
        hotel.addConferenceRoom(conf1);
        hotel.addConferenceRoom(conf2);
        hotel.addConferenceRoom(conf3);
        hotel.addConferenceRoom(conf4);
        din1 = new DiningRoom("Tom", 2);
        din2 = new DiningRoom("Jerry", 4);
        din3 = new DiningRoom("Itchy", 5);
        din4 = new DiningRoom("Scratchy", 3);
        hotel.addDiningRoom(din1);
        hotel.addDiningRoom(din2);
        hotel.addDiningRoom(din3);
        hotel.addDiningRoom(din4);


    }

    @Test
    public void testHotelHasName() {
        assertEquals("CodeClanTowers", hotel.getName());
    }
    @Test
    public void testAddBedroom() {
        assertEquals(4, hotel.getNumberOfBedrooms());
    }
    @Test
    public void canAddGuestToRoom() {
        hotel.addGuestToBedRoom(guest2, bedroom1);
        assertEquals(1, hotel.numberOfGuestsInRoom(bedroom1));
    }
    @Test
    public void canAddGuestToRoom_capacity_reached() {
        hotel.addGuestToBedRoom(guest2, bedroom1);
        hotel.addGuestToBedRoom(guest1, bedroom1);
        assertEquals(2, hotel.numberOfGuestsInRoom(bedroom1));
        hotel.addGuestToBedRoom(guest3, bedroom1);
        assertEquals(2, hotel.numberOfGuestsInRoom(bedroom1));
    }

    @Test
    public void testRemoveGuestFromRoom() {
        hotel.addGuestToBedRoom(guest2, bedroom1);
        hotel.addGuestToBedRoom(guest1,bedroom1);
        assertEquals(2, hotel.numberOfGuestsInRoom(bedroom1));
        hotel.removeGuestFromBedRoom(guest1, bedroom1);
        assertEquals(1, hotel.numberOfGuestsInRoom(bedroom1));
    }
    @Test
    public void testAddConferenceRoom() {
        assertEquals(4, hotel.getNumberOfConferenceRooms());
    }
    @Test
    public void canAddGuestToConferenceRoom() {
        hotel.addGuestToConferenceRoom(guest2, conf1);
        assertEquals(1, hotel.numberOfGuestsInConferenceRoom(conf1));
    }
    @Test
    public void canAddGuestToConferenceRoom_capacity_reached() {
        hotel.addGuestToConferenceRoom(guest2, conf1);
        hotel.addGuestToConferenceRoom(guest1, conf1);
        assertEquals(2, hotel.numberOfGuestsInConferenceRoom(conf1));
        hotel.addGuestToConferenceRoom(guest3, conf1);
        assertEquals(2, hotel.numberOfGuestsInConferenceRoom(conf1));
    }

    @Test
    public void testRemoveGuestFromConferenceRoom() {
        hotel.addGuestToConferenceRoom(guest2, conf1);
        hotel.addGuestToConferenceRoom(guest1, conf1);
        assertEquals(2, hotel.numberOfGuestsInConferenceRoom(conf1));
        hotel.removeGuestFromConferenceRoom(guest1, conf1);
        assertEquals(1, hotel.numberOfGuestsInConferenceRoom(conf1));
    }
    @Test
    public void testAddDiningRoom() {
        assertEquals(4, hotel.getNumberOfDiningRooms());
    }
    @Test
    public void canAddGuestToDiningRoom() {
        hotel.addGuestToDiningRoom(guest2, din1);
        assertEquals(1, hotel.numberOfGuestsInDiningRoom(din1));
    }
    @Test
    public void canAddGuestToDiningRoom_capacity_reached() {
        hotel.addGuestToDiningRoom(guest2, din1);
        hotel.addGuestToDiningRoom(guest1, din1);
        assertEquals(2, hotel.numberOfGuestsInDiningRoom(din1));
        hotel.addGuestToDiningRoom(guest3, din1);
        assertEquals(2, hotel.numberOfGuestsInDiningRoom(din1));
    }

    @Test
    public void testRemoveGuestFromDiningRoom() {
        hotel.addGuestToDiningRoom(guest2, din1);
        hotel.addGuestToDiningRoom(guest1, din1);
        assertEquals(2, hotel.numberOfGuestsInDiningRoom(din1));
        hotel.removeGuestFromDiningRoom(guest1, din1);
        assertEquals(1, hotel.numberOfGuestsInDiningRoom(din1));
    }
}
