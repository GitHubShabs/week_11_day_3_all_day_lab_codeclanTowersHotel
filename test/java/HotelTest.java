import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Bedroom bedroom1, bedroom2, bedroom3, bedroom4;
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
        hotel.addGuestToBedRoom(guest1, bedroom1);
        assertEquals(2, hotel.numberOfGuestsInRoom(bedroom1));
        hotel.removeGuestFromBedRoom(guest1, bedroom1);
        assertEquals(1, hotel.numberOfGuestsInRoom(bedroom1));
    }
}
