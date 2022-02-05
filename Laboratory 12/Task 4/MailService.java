import java.util.ArrayList;
import java.util.HashMap;

public class MailService {
//  Люди подписанные на новости
    ArrayList<Man> newsSubscribers = new ArrayList<>();
//  Люди подписанные на журналы
    ArrayList<Man>  magazineSubscribers = new ArrayList<>();
//  Список всех уже поступивших новостных выпусков и журналов
    HashMap<String, Paper> library = new HashMap<>();
// Метод в зависимости от типа (журнал/новости), добавляет подписчика
    public void addMember(Man man, Paper paperType) {
        switch (paperType) {
            case News: {
                newsSubscribers.add(man);
                break;
            }
            case Magazine: {
                magazineSubscribers.add(man);
                break;
            }
        }
    }
//  Удалить подписчика
    public void removeMember(Man man, Paper paperType) {
        switch (paperType) {
            case News: newsSubscribers.remove(man);
            case Magazine: magazineSubscribers.remove(man);
        }
    }
//  Оповестить всех подписчиков
    public void notifySubscribers(Paper paperType, String title) {
        ArrayList<Man> subscribers;
//      В зависимости от типа (журнал/новости) оповещаем людей о поступлении.
        switch (paperType) {
            case Magazine: {
                subscribers = magazineSubscribers;
                break;
            }
            case News: {
                subscribers = newsSubscribers;
                break;
            }
            default: return;
        }
        for (Man man: subscribers) {
            man.update(title);
        }
    }
//  Метод для добавления носителя информации
    public void addPaper(Paper paperType, String title) {
        library.put(title, paperType);
        notifySubscribers(paperType, title);
    }
}
