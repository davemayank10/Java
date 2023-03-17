/*Write an application that declares a class named Person. It should 
have instance variables to record name, age & salary. Use the new 
operator to create a Person object. Set & display its instance 
variables.*/
public class Person {
    private String name;
    private int age;
    private double salary;

    public   Person(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
    public static void main(String[] args) {
        Person person= new Person("Mayank",20,50000);
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Salary: $" + person.getSalary());
    }
}


OUTPUT:
Name: Mayank
Age: 20
Salary: $50000.0
