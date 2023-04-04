public class Human {
    void printDate(){
        System.out.println("Method of Super Class!");
    }
}
class Man extends Human {
    @Override
    void printDate() {
        System.out.println("Method of Sub Class!");

    }
}
class Test{
    public static void main(String[] args) {
        Human h = new Man();
        Human h1 = new Man();
        h.printDate();
        h1.printDate();
    }
}