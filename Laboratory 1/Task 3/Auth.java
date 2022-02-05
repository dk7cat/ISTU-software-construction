public class Auth {
    private final String password;
//    Конструктор
    public Auth(String password) {
        this.password = password;
    }
//    Метод проверяет соответствие пароля шаблону
    public boolean check(String password) {
        return this.password.equals(password);
    }
}
