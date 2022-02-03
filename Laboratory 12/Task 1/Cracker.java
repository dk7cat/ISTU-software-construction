public class Cracker extends Person {

    @Override
    public void update(Event event) {
        switch (event) {
            case Robbery: {
                System.out.println("Это взломщик. Я готов.");
                break;
            }
        }
    }
}
