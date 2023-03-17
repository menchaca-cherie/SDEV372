import objects.Dice;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class DiceTests {

    @RepeatedTest(10)
    public void constructorDice(int sides, String color)
    {
        Dice dice = new Dice()
        {

        }
    }
}
