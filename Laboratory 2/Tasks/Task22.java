import org.junit.jupiter.api.Test;

public class Task22 {

    Numbers numbers = new Numbers();

    @Test
    public void threeNumbersTest() {
        assert numbers.summarize(1, 2, 3) == 6;
    }

    @Test
    public void twoNumbersTest() {
        assert numbers.summarize(1, 2) == 3;
    }

    @Test
    public void oneNumberTest() {
        assert numbers.summarize(1) == 1;
    }
}
