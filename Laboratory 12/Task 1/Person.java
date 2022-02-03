public abstract class Person {
    Gang gang;
    public void update(Event event) {}
    public void enterGang(Gang gang) {
        this.gang = gang;
        gang.addPerson(this);
    }
}
