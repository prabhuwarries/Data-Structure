package OOPsRelatedQnA;

public class InheritanceMethodOverriding {
    public void move() {
        System.out.println("Parent is moving");
    }
}

class Child extends InheritanceMethodOverriding {
    @Override
    public void move() {
        System.out.println("Child is moving");
    }

    public static void main(String[] args) {
        InheritanceMethodOverriding obj = new Child();
        obj.move(); // Output: Child is moving
    }
}
// In this example, the Child class overrides the move method of the parent class InheritanceMethodOverriding.
// When we call the move method on an object of type InheritanceMethodOverriding that actually references a Child object,
// the overridden method in the Child class is executed

// This demonstrates runtime polymorphism in Java, where the method that gets executed is determined at runtime based on the actual object type, not the reference type.
// The @Override annotation is used to indicate that the method is intended to override a method in the superclass.
// If the method does not correctly override a method in the superclass (for example, due to a typo in the method name or incorrect parameters),
// the compiler will generate an error. This helps catch mistakes early in the development process.

class Bike extends InheritanceMethodOverriding {
    @Override
    public void move() {
        System.out.println("Bike is moving");
    }

    public static void main(String[] args) {
        InheritanceMethodOverriding obj = new Bike();
        obj.move(); // Output: Bike is moving
    }
}
// In this example, the Bike class also overrides the move method of the parent class InheritanceMethodOverriding.
// When we call the move method on an object of type InheritanceMethodOverriding that actually references a Bike object,
// the overridden method in the Bike class is executed. This further demonstrates runtime polymorphism in Java.
// The @Override annotation is used to indicate that the method is intended to override a method in the superclass.
// If the method does not correctly override a method in the superclass (for example, due to a typo in the method name or incorrect parameters),
// the compiler will generate an error. This helps catch mistakes early in the development process.

class Car extends InheritanceMethodOverriding {
    @Override
    public void move() {
        System.out.println("Car is moving");
    }

    public static void main(String[] args) {
        InheritanceMethodOverriding obj = new Car();
        obj.move(); // Output: Car is moving
    }
}
// In this example, the Car class also overrides the move method of the parent class InheritanceMethodOverriding.
// When we call the move method on an object of type InheritanceMethodOverriding that actually references a Car object,
// the overridden method in the Car class is executed. This further demonstrates runtime polymorphism in Java.
// The @Override annotation is used to indicate that the method is intended to override a method in the superclass.
// If the method does not correctly override a method in the superclass (for example, due to a typo in the method name or incorrect parameters),
// the compiler will generate an error. This helps catch mistakes early in the development process.


class Truck extends InheritanceMethodOverriding {
    @Override
    public void move() {
        System.out.println("Truck is moving");
    }

    public static void main(String[] args) {
        InheritanceMethodOverriding obj = new Truck();
        obj.move(); // Output: Truck is moving
    }
}
// In this example, the Truck class also overrides the move method of the parent class InheritanceMethodOverriding.
// When we call the move method on an object of type InheritanceMethodOverriding that actually references a Truck object,
// the overridden method in the Truck class is executed. This further demonstrates runtime polymorphism in Java.
// The @Override annotation is used to indicate that the method is intended to override a method in the superclass.
// If the method does not correctly override a method in the superclass (for example, due to a typo in the method name or incorrect parameters),
// the compiler will generate an error. This helps catch mistakes early in the development process.

class TestInheritanceMethodOverriding {
    public static void main(String[] args) {
        InheritanceMethodOverriding obj1 = new Child();
        obj1.move(); // Output: Child is moving

        InheritanceMethodOverriding obj2 = new Bike();
        obj2.move(); // Output: Bike is moving

        InheritanceMethodOverriding obj3 = new Car();
        obj3.move(); // Output: Car is moving

        InheritanceMethodOverriding obj4 = new Truck();
        obj4.move(); // Output: Truck is moving
    }
}