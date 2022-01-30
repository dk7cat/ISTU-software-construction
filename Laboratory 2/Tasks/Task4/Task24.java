package Task4;

import org.junit.jupiter.api.Test;

public class Task24 {

    Substractioneer substr = new Substractioneer();

    @Test
    public void positiveSubstractTest() {
        assert substr.substract(3, 2) == 1;
    }

    @Test
    public void negativeSubstractTest() {
        assert substr.substract(1, 2) == -1;
    }

    @Test
    public void zeroSubstractTest() {
        assert substr.substract(2, 2) == 0;
    }
}
