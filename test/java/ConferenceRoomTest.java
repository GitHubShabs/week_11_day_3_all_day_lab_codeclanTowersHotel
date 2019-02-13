import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {


    ConferenceRoom conferenceRoom, conferenceRoom1;
    Guest guest1;
    Guest guest2;
    Guest guest3;



    @Before
    public void before(){
        guest1 = new Guest("Bob");
        guest2 = new Guest("Mary");
        guest3 = new Guest("Sue");
        conferenceRoom = new ConferenceRoom("TheInternational", 100);
        conferenceRoom1 = new ConferenceRoom("TheVerySmall", 2);
    }

    @Test
    public void roomHasName() {
        assertEquals("TheInternational", conferenceRoom.getRoomName());
    }

    @Test
    public void roomHasSpace() {
        assertEquals(true, conferenceRoom.hasSpace());
    }
    @Test
    public void testAddGuestToRoom() {
        conferenceRoom.addGuest(guest1);
        assertEquals(true, conferenceRoom.roomHasGuests());
    }
    @Test
    public void testRemoveGuestFromRoom() {
        conferenceRoom.addGuest(guest1);
        assertEquals(true, conferenceRoom.roomHasGuests());
        conferenceRoom.removeGuest(guest1);
        assertEquals(false, conferenceRoom.roomHasGuests());
    }
    @Test
    public void testAddGuestToRoom_roomAtCapacity() {
        conferenceRoom1.addGuest(guest1);
        conferenceRoom1.addGuest(guest2);
        assertEquals(2, conferenceRoom1.numberOfGuestsInRoom());
        conferenceRoom1.addGuest(guest3); // Should not work!
        assertEquals(3, conferenceRoom1.numberOfGuestsInRoom()); // Did work because capacity check is done at hotel level
    }

}
