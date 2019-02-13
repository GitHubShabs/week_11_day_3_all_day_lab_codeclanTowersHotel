import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {


    Bedroom bedroom;
    Guest guest1;
    Guest guest2;
    Guest guest3;



    @Before
    public void before(){
        guest1 = new Guest("Bob");
        guest2 = new Guest("Mary");
        guest3 = new Guest("Sue");
        bedroom = new Bedroom(100, 2, "Double");
    }

    @Test
    public void roomHasNumber() {
        assertEquals(100, bedroom.getRoomNumber());
    }

    @Test
    public void roomHasSpace() {
        assertEquals(true, bedroom.hasSpace());
    }
    @Test
    public void testAddGuestToRoom() {
        bedroom.addGuest(guest1);
        assertEquals(true, bedroom.roomHasGuests());
    }
    @Test
    public void testRemoveGuestFromRoom() {
        bedroom.addGuest(guest1);
        assertEquals(true, bedroom.roomHasGuests());
        bedroom.removeGuest(guest1);
        assertEquals(false, bedroom.roomHasGuests());
    }
    @Test
    public void testAddGuestToRoom_roomAtCapacity() {
        bedroom.addGuest(guest1);
        bedroom.addGuest(guest2);
        assertEquals(2, bedroom.numberOfGuestsInRoom());
        bedroom.addGuest(guest3); // Should not work!
        assertEquals(2, bedroom.numberOfGuestsInRoom());
    }

//    @Test
//    public void testNumberOfGuestsInRoom() {
//        System.out.println(bedroom.numberOfGuestsInRoom());
////        assertEquals( 0, bedroom.numberOfGuestsInRoom());
//    }

}
