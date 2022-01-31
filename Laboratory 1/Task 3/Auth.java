public class Auth {
    private final String password;
    public Auth(String password) {
        this.password = password;
    }

    public boolean check(String password) {
        return this.password.equals(password);
    }
}
