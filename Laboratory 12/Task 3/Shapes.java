// Класс реализующие интерфейс фигуры

class OShape implements Shape {
    String name = "O";

    public OShape() {
        System.out.println("Created "+ this.name +" shape");
    }

}

class JShape implements Shape {
    String name = "J";

    public JShape() {
        System.out.println("Created "+ this.name +" shape");
    }
}

class IShape implements Shape {
    String name = "I";

    public IShape() {
        System.out.println("Created "+ this.name +" shape");
    }
}

class LShape implements Shape {
    String name = "L";

    public LShape() {
        System.out.println("Created "+ this.name +" shape");
    }
}

class SuperOShape implements Shape {
    String name = "Super O";

    public SuperOShape() {
        System.out.println("Created "+ this.name +" shape");
    }
}

class SuperJShape implements Shape {
    String name = "Super J";

    public SuperJShape() {
        System.out.println("Created "+ this.name +" shape");
    }
}

class SuperIShape implements Shape {
    String name = "Super I";

    public SuperIShape() {
        System.out.println("Created "+ this.name +" shape");
    }
}

class SuperLShape implements Shape {
    String name = "Super L";

    public SuperLShape() {
        System.out.println("Created "+ this.name +" shape");
    }
}
