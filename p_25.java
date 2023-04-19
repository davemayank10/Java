import java.util.Scanner;

class Employee {
    String name;
    int empNo;
    int salary;

    void set_data(){};
    void get_data(){};
}

class Teaching extends Employee{
    String nameOfSubject;

    void set_data(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Details Of Teaching Employee");
        System.out.print("Enter Name: ");
        this.name = sc.nextLine();
        System.out.print("Enter Employee No.: ");
        this.empNo = sc.nextInt();
        System.out.print("Enter Name Of Subject: ");
        this.nameOfSubject = sc.next();
        System.out.print("Enter Salary: ");
        this.salary = sc.nextInt();
    }

    void get_data(){
        System.out.println("Name: "+this.name);
        System.out.println("Employee No: "+this.empNo);
        System.out.println("Name Of Subject: "+this.nameOfSubject);
        System.out.println("Salary: "+this.salary);
    }
}

class NonTeaching extends Employee{
    String typeOfWork;

    void set_data(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Details Of Non-Teaching Employee");
        System.out.print("Enter Name: ");
        this.name = sc.nextLine();
        System.out.print("Enter Employee No.: ");
        this.empNo = sc.nextInt();
        System.out.print("Enter Salary: ");
        this.salary = sc.nextInt();
        System.out.print("Enter Type Of Work: ");
        this.typeOfWork = sc.nextLine();
    }

    void get_data(){
        System.out.println("Name: "+this.name);
        System.out.println("Employee No.: "+this.empNo);
        System.out.println("Type Of Work: "+this.typeOfWork);
        System.out.println("Salary: "+this.salary);
    }
}

class Pra_25{
    public static void main(String[] args){
        Teaching emp1 = new Teaching();
        NonTeaching emp2 = new NonTeaching();
        emp1.set_data();
        emp2.set_data();

       emp1.get_data();
        emp2.get_data();
    }
}
