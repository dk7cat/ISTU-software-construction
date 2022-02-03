import java.util.ArrayList;
import java.util.HashMap;

public class MailService {

    ArrayList<Man> newsSubscribers = new ArrayList<>();
    ArrayList<Man>  magazineSubscribers = new ArrayList<>();
    HashMap<String, Paper> library = new HashMap<>();

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

    public void removeMember(Man man, Paper paperType) {
        switch (paperType) {
            case News: newsSubscribers.remove(man);
            case Magazine: magazineSubscribers.remove(man);
        }
    }

    public void notifySubscribers(Paper paperType, String title) {
        ArrayList<Man> subscribers;
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

    public void addPaper(Paper paperType, String title) {
        library.put(title, paperType);
        notifySubscribers(paperType, title);
    }
}
