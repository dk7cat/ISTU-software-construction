public class Man {
    String name;

    public Man(String name) {
        this.name = name;
    }
//  При получении оповещения, сообщает что получил
    public void update(String type) {
        System.out.println("Hey, its " + name +". i've got " + type);
    }
}
