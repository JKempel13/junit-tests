import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class KitchenTest {

    Kitchen emptyKitchen;
    Kitchen kitchenWithOne;
    Kitchen kitchenWithMany;

    @Before
    public void setUp(){
        emptyKitchen = new Kitchen();

        kitchenWithOne = new Kitchen();
        kitchenWithOne.add("red tortilla");

        kitchenWithMany = new Kitchen();
        kitchenWithMany.add("red tortilla");
        kitchenWithMany.add("blue tortilla");
        kitchenWithMany.add("yellow tortilla");
    }

    @Test
    public void testIfTortillaExists(){
        assertEquals(0, emptyKitchen.size());
        assertTrue(emptyKitchen.isEmpty());

        assertEquals(1,kitchenWithOne.size());
        assertFalse(kitchenWithOne.isEmpty());

        assertEquals(3,kitchenWithMany.size());
        assertFalse(kitchenWithMany.isEmpty());
    }

    @Test
    public void testIfTortillaCanBeAdded(){
        //run this test to make sure that the red tortilla doesn't already exist//
        assertFalse(emptyKitchen.contains("red tortilla"));
        //this adds the red tortilla//============================//Also no longer needed because it is in the @Before unit above
        kitchenWithOne.add("red tortilla");
        // do this to test if red tortilla was added (try assertFalse first to see the problem break, so that way you know how to make it correct)//
        assertTrue(kitchenWithOne.contains("red tortilla"));
        assertTrue(kitchenWithMany.contains("yellow tortilla"));
    }

    @Test
    public void testIFTortillaCanBePopped(){
        // this removed the one and only tortilla from the list and should no longer have any tortillas //
        kitchenWithOne.pop();
        // tested with 1 expected first to show that it breaks, and changes to 0 to make the test pass //
        assertEquals(0, kitchenWithOne.size());

        kitchenWithMany.pop();
        assertEquals(2,kitchenWithMany.size());
    }

}
