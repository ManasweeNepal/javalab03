package hierarchial;

public class Main {
    public static void main(String[] args) {
        Carnivore obj1 = new Carnivore();
        obj1.drink();    
        obj1.eat();    
        Hervivore obj2 = new Hervivore();
        obj2.drink();    
        obj2.food();     
    }
    
}
