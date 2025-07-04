package klassnayadzz.klassnayadzz.Classrequirements;
public class Fish extends Animal {

    public Fish(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Fish bubbles!");
    }

    @Override
    public void move() {
        System.out.println("Fish swims!");
    }

    @Override
    public void eat() {
        System.out.println("Fish eats algae!");
    }
}

