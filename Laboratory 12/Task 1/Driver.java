public class Driver extends Person {

    @Override
    public void update(Event event) {
//      Человек выполняет действие в зависимости от полученного сигнала
        switch (event) {
            case Robbery: {
                System.out.println("Это водитель. Я готов.");
                break;
            }
        }
    }
}
