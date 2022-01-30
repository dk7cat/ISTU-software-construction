import org.junit.jupiter.api.Test;

public class Task21 {
    Auth auth = new Auth("password");

    @Test
    public void rightPasswordTest() {
        assert auth.check("password");
    }

    @Test
    public void wrongPasswordTest() {
        assert !auth.check("password1");
    }
}
