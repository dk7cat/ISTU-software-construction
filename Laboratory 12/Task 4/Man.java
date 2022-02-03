public class Man {

    String name;

    public Man(String name) {
        this.name = name;
    }

    public void update(String type) {
        System.out.println("Hey, its " + name +". i've got " + type);
    }
}
