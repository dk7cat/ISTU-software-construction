package Task5;

import org.junit.jupiter.api.Test;

public class Task25 {

    SubStringFinder ssf = new SubStringFinder();

    @Test
    public void stringWithSubstringTest() {
        assert ssf.check("fjghdfghaa").equals("yes");
    }

    @Test
    public void stringWithoutSubstringTest() {
        assert ssf.check("fjghdfgha").equals("no");
    }
}
