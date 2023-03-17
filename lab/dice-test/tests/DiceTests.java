import objects.Dice;
import org.junit.jupiter.api.RepeatedTest;

import static org.junit.jupiter.api.Assertions.*;

public class DiceTests {

    @RepeatedTest(2)
    public void colorDice()
    {
        Dice dice = new Dice(6, "red");
        assertEquals(6, dice.getSides());
        assertNotEquals("black", dice.getColor());
    }

}
