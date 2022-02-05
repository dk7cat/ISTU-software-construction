public class Agent extends Person {

    @Override
    public void update(Event event) {
//      Человек выполняет действие в зависимости от полученного сигнала
        switch (event) {
            case Arrest: {
                // Я ведь полицейский :)
                break;
            }
            case Robbery: {
                System.out.println("Это полиция. Вы арестованы.");
                gang.notifyGang(Event.Arrest);
                break;
            }
        }
    }
}
