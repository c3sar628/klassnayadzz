package klassnayadzz.klassnayadzz.Classrequirements;
public class Zoo {
    public static void main(String[] args) {
        Animal[] animals = {
                new Lion("Simba"),
                new Parrot("Kesha"),
                new Fish("Nemo")
        };

        for (Animal animal : animals) {
            animal.info();
            System.out.println("Type: " + animal.getClass().getSimpleName());
            animal.makeSound();
            animal.move();
            animal.eat();
            System.out.println();  // пустая строка для разделения
        }
    }
}
