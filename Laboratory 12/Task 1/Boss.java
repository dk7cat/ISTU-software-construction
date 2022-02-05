public class Boss extends Person {

    @Override
    public void update(Event event) {
//      Человек выполняет действие в зависимости от полученного сигнала
        switch (event) {
            case Arrest: {
                System.out.println("Это Босс. Ограбление провалено.");
                gang.notifyGang(Event.Failed);
                break;
            }
        }
    }

    public void beginRobbery() {
//      Уведомить всех членов о ограблении
        System.out.println("Это Босс. Идем грабить банк.");
        gang.notifyGang(Event.Robbery);
    }
}
