public class Carrier extends Person {

    @Override
    public void update(Event event) {
        switch (event) {
            case Robbery: {
                System.out.println("Это носильщик. Я готов.");
                break;
            }
        }
    }
}
