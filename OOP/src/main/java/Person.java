public class Person {
    String name;
    String department;
    double salary;
    int age;

    public Person(String name, String department, double salary, int age) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            throw new RuntimeException("sorry you cannot make under $0");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            throw new RuntimeException("Sorry you cannot be under 0 years old!");
        }
    }

    public static void main(String[] args) {
        Person person = new Person(" ", " ", 0, 0);
        person.setAge(45);
        person.setSalary(78000);
        person.getAge();
        person.getSalary();
        System.out.println(" ");
    }
}
