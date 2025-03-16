// Person class definition
class Person {
    // Attributes with default access modifiers
    String name;
    int age;

    // Parameterized constructor to initialize name and age
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Default constructor to initialize name as "Unknown" and age as 0
    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Method to display person's name and age
    public void displayPerson() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Main class for running the program
public class PersonDemo {
    public static void main(String[] args) {
        // Create a Person object using the parameterized constructor
        Person person1 = new Person("Bob", 30);

        // Create another Person object using the default constructor
        Person person2 = new Person();

        // Call the displayPerson() method on both person objects
        person1.displayPerson();
        person2.displayPerson();
    }
}