package hybrid;

 class Dog implements Mammal, Carnivore {
     public void eat() {
        System.out.println("Lion eats meat");
    }
    public void drink() {
        System.out.println("this animal drinks water");
    }
    public void sound() {
        System.out.println("dog barks");
    }
     public void produce() 
    {
        System.out.println("milk");
    }
}
