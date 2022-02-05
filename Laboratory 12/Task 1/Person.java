public abstract class Person {
    Gang gang;
    public void update(Event event) {}
    public void enterGang(Gang gang) {
//        При входе в банду, человек сохраняет банду себе, чтобы иметь возможность оповестить членов банды
        this.gang = gang;
        gang.addPerson(this);
    }
}
