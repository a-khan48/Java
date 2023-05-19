package validating;

import java.util.Scanner;
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        if (name == null || name.length() > 40 || name.isEmpty()) {
            throw new IllegalArgumentException("This name is invalid, it cannot be null, empty, or greater than 40 characters.");
        } else if (age <= 0 || age > 120) {
            throw new IllegalArgumentException("This age is invalid, age cannot be less than or equal to 0 and cannot be over 120.");
        }


        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter a name: ");
            String name = scanner.nextLine();

            System.out.println("Enter an age: ");
            int age = scanner.nextInt();

            Person person = new Person(name, age);

            System.out.println("Your name is " + person.getName() + ". Your age is " + person.getAge() + ".");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}