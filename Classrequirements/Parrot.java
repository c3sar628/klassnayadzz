package klassnayadzz.klassnayadzz.Classrequirements;

public class Parrot extends Animal {

    public Parrot(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Parrot talks!");
    }

    @Override
    public void move() {
        System.out.println("Parrot flies!");
    }

    @Override
    public void eat() {
        System.out.println("Parrot eats seeds!");
    }
}