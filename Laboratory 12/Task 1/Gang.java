import java.util.ArrayList;
import java.util.List;

public class Gang {
    List<Person> members = new ArrayList<>();

    public void addPerson(Person person) {
        members.add(person);
    }

    public void deletePerson(Person person) {
        members.remove(person);
    }

    public void notifyGang(Event event) {
        for (Person person: members) {
            person.update(event);
        }
    }
}
