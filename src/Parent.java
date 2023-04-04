public class Parent {
    String name;
    void display() {
        System.out.println("Super Class Is Running!");
    }
}
class Child extends Parent {
    int age;

    @Override
    void display() {
        System.out.println("Sub Class Is Running!");

    }
}
class Downcasting {
    public static void main(String[] args) {
        Parent p = new Child();
        p.name = "Anupa";
        Child c = (Child) p;
        c.age = 21;
        System.out.println(p.name);
        System.out.println(c.age);
        c.display();
    }
}