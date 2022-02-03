public class Boss extends Person {

    @Override
    public void update(Event event) {
        switch (event) {
            case Arrest: {
                System.out.println("Это Босс. Ограбление провалено.");
                gang.notifyGang(Event.Failed);
                break;
            }
        }
    }

    public void beginRobbery() {
        System.out.println("Это Босс. Идем грабить банк.");
        gang.notifyGang(Event.Robbery);
    }
}
