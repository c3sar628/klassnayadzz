package klassnayadzz.klassnayadzz.Classrequirements;
public class Lion extends Animal {

    public Lion(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Lion roars!");
    }

    @Override
    public void move() {
        System.out.println("Lion runs!");
    }

    @Override
    public void eat() {
        System.out.println("Lion eats meat!");
    }
}