import java.util.ArrayList;
import java.util.List;

public class Gang {
    List<Person> members = new ArrayList<>();
//  Добавить человека в банду
    public void addPerson(Person person) {
        members.add(person);
    }
//  Удалить человека из банды
    public void deletePerson(Person person) {
        members.remove(person);
    }
//  Уведомить банду
    public void notifyGang(Event event) {
        for (Person person: members) {
            person.update(event);
        }
    }
}
