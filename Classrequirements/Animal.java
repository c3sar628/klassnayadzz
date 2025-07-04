package klassnayadzz.klassnayadzz.Classrequirements;
public class Animal {
        String name;

        public Animal(String name) {
            this.name = name;
        }

        public void makeSound() {
            System.out.println("Some animal sound");
        }

        public void move() {
            System.out.println("Some movement");
        }

        public void eat() {
            System.out.println("Some food");
        }

        public void info() {
            System.out.println("Animal name: " + name);
        }
    }