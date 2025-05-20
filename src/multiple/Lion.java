package multiple;

class Lion implements Animal,Carnivore {
    public void eat() {
        System.out.println("Lion eats meat");
    }
    public void drink() {
        System.out.println("this animal drinks water");
    }
    public void sound() {
        System.out.println("Lion roars");
    }
}
