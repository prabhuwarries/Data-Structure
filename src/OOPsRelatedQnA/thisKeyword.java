package OOPsRelatedQnA;

public class thisKeyword {
    static class student {
        int id;
        String name;

        // Constructor with parameters
        public student(int id, String name) {
            this.id = id; // Using 'this' to refer to the instance variable
            this.name = name; // Using 'this' to refer to the instance variable
        }

        public void display() {
            System.out.println("ID: " + id + ", Name: " + name);
        }
    }
    public static void main(String[] args) {
        student s1 = new student(101, "Prabhat Ranjan");
        student s2 = new student(102, "John Doe");

        s1.display(); // Output: ID: 101, Name: Prabhat Ranjan
        s2.display(); // Output: ID: 102, Name: John Doe
    }
}

// In this example, the 'this' keyword is used within the constructor of the 'student' class to distinguish between the instance variables (id and name) and the constructor parameters (id and name).
// When the constructor is called to create a new 'student' object, the 'this' keyword ensures that the instance variables are assigned the values passed as parameters.
// This is particularly useful when the parameter names are the same as the instance variable names, as it helps avoid ambiguity.
// The display method is used to print the details of the student object.
// The main method creates two instances of the 'student' class and calls the display method to show their details.