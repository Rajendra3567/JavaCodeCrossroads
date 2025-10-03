public class Dog implements Animal{

    @Override
    public void makeSound() {
        System.out.println("Bark");
    }

    public static void main(String[] args) {
        Dog g = new Dog();
        g.makeSound();
    }
}
