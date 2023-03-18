import objects.Dice;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiceTests {

    @Test
    public void colorDice()
    {
        Dice dice = new Dice(6, "red");
        assertEquals(6, dice.getSides());
        assertNotEquals("black", dice.getColor());
    }

}
