package OOPsRelatedQnA;
public class PolymorphismCompileVsRuntime {
    public void display() {
        System.out.println("Compile-time polymorphism: Method in base class");
    }

    public static void main(String[] args) {
        PolymorphismCompileVsRuntime obj = new PolymorphismCompileVsRuntime();
        obj.display(); // Output: Compile-time polymorphism: Method in base class
    }
}
// In this example, the display method in the PolymorphismCompileVsRuntime class is an example of compile-time polymorphism.
// The method to be executed is determined at compile time based on the reference type of the object.
// Since the reference type is PolymorphismCompileVsRuntime, the display method in that class is executed.
// There is no method overriding involved here, so it is considered compile-time polymorphism.

class  subClass extends PolymorphismCompileVsRuntime {
    @Override
    public void display() {
        System.out.println("Runtime polymorphism: Overridden method in subclass");
    }

    public static void main(String[] args) {
        PolymorphismCompileVsRuntime obj = new subClass();
        obj.display(); // Output: Runtime polymorphism: Overridden method in subclass
    }
}
// In this example, the display method in the subClass overrides the display method in the PolymorphismCompileVsRuntime class.
// When we call the display method on an object of type PolymorphismCompileVsRuntime that actually references a subClass object,
// the overridden method in the subClass is executed. This is an example of runtime polymorphism,
// where the method to be executed is determined at runtime based on the actual object type, not the reference type.
// The @Override annotation is used to indicate that the method is intended to override a method in the superclass.
// If the method does not correctly override a method in the superclass (for example, due to a typo in the method name or incorrect parameters),
// the compiler will generate an error. This helps catch mistakes early in the development process.


class AnotherSubClass extends PolymorphismCompileVsRuntime {
    @Override
    public void display() {
        System.out.println("Runtime polymorphism: Overridden method in AnotherSubClass");
    }

    public static void main(String[] args) {
        PolymorphismCompileVsRuntime obj = new AnotherSubClass();
        obj.display(); // Output: Runtime polymorphism: Overridden method in AnotherSubClass
    }
}
// In this example, the display method in the AnotherSubClass overrides the display method in the PolymorphismCompileVsRuntime class.
// When we call the display method on an object of type PolymorphismCompileVsRuntime that actually references an AnotherSubClass object,
// the overridden method in the AnotherSubClass is executed. This is another example of runtime polymorphism,
// where the method to be executed is determined at runtime based on the actual object type, not the reference type.
// The @Override annotation is used to indicate that the method is intended to override a method in the superclass.
// If the method does not correctly override a method in the superclass (for example, due to a typo in the method name or incorrect parameters),
// the compiler will generate an error. This helps catch mistakes early in the development process.

class Main {
    public static void main(String[] args) {
        PolymorphismCompileVsRuntime baseObj = new PolymorphismCompileVsRuntime();
        baseObj.display(); // Output: Compile-time polymorphism: Method in base class

        PolymorphismCompileVsRuntime subObj = new subClass();
        subObj.display(); // Output: Runtime polymorphism: Overridden method in subclass

        PolymorphismCompileVsRuntime anotherSubObj = new AnotherSubClass();
        anotherSubObj.display(); // Output: Runtime polymorphism: Overridden method in AnotherSubClass
    }
}
// In this example, we create objects of the base class PolymorphismCompileVsRuntime and its subclasses subClass and AnotherSubClass.
// Then we call the display method on each object. The output demonstrates both compile-time polymorphism
// (for the base class object) and runtime polymorphism (for the subclass objects).
// The @Override annotation is used in the subclass methods to indicate that they are intended to override methods in the superclass.
// If the methods do not correctly override methods in the superclass (for example, due to typos in the method names or incorrect parameters),
// the compiler will generate errors. This helps catch mistakes early in the development process.
