import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

    DiningRoom diningRoom, diningRoom1;
    Guest guest1;
    Guest guest2;
    Guest guest3;



    @Before
    public void before(){
        guest1 = new Guest("Bob");
        guest2 = new Guest("Mary");
        guest3 = new Guest("Sue");
        diningRoom = new DiningRoom("Spectrum", 100);
        diningRoom1 = new DiningRoom("Small", 2);
    }

    @Test
    public void roomHasName() {
        assertEquals("Spectrum", diningRoom.getRoomName());
    }

    @Test
    public void roomHasSpace() {
        assertEquals(true, diningRoom.hasSpace());
    }
    @Test
    public void testAddGuestToRoom() {
        diningRoom.addGuest(guest1);
        assertEquals(true, diningRoom.roomHasGuests());
    }
    @Test
    public void testRemoveGuestFromRoom() {
        diningRoom.addGuest(guest1);
        assertEquals(true, diningRoom.roomHasGuests());
        diningRoom.removeGuest(guest1);
        assertEquals(false, diningRoom.roomHasGuests());
    }
    @Test
    public void testAddGuestToRoom_roomAtCapacity() {
        diningRoom1.addGuest(guest1);
        diningRoom1.addGuest(guest2);
        assertEquals(2, diningRoom1.numberOfGuestsInRoom());
        diningRoom1.addGuest(guest3);
        assertEquals(3, diningRoom1.numberOfGuestsInRoom()); // Did work because capacity check is done at hotel level
    }


}
