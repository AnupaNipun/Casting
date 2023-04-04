public class Animal {
    String name;
    void setName(){
        System.out.println("Elephant");
    }
}
class fish extends Animal{
    String color;

    @Override
    void setName() {
        System.out.println("Blue Fish");
    }
}
class Run{
    public static void main(String[] args) {
        Animal a = new fish();
        a.name = "Alagoduwa";
        fish f = new fish();
        f.name = "Linna";
        f.color = "grey";
        System.out.println("Name  :- " + a.name);
        a.setName();
        System.out.println("Name  :- " + f.name);
        System.out.println("Color :- " + f.color);
    }

}