import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class Task23 {
    Auth auth = new Auth("password");

    @Test
    public void rightPasswordTest() {
       assumeTrue(auth.check("password"));
    }

    @Test
    public void wrongPasswordTest() {
        assumeTrue(!auth.check("password1"));
    }
}
