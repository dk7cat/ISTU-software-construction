public class Driver extends Person {

    @Override
    public void update(Event event) {
        switch (event) {
            case Robbery: {
                System.out.println("Это водитель. Я готов.");
                break;
            }
        }
    }
}
