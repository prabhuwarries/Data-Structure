package OOPsRelatedQnA;

public class Interface {
    interface  Animal {
        void sound();
        void eat();
    }
    static class Dog implements Animal {
        @Override
        public void sound() {
            System.out.println("Dog barks");
        }

        @Override
        public void eat() {

        }
    }
    static class Cat implements Animal {
        @Override
        public void sound() {
            System.out.println("Cat meows");
        }

        @Override
        public void eat() {
            System.out.println("Cat eats fish");
        }
    }
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        dog.sound(); // Output: Dog barks
        cat.sound(); // Output: Cat meows
        cat.eat();  // Output: Cat eats fish
    }
    
}
