public class Student {
    String name;
    int age;
    int grade;

    public Student(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    /*Student student = new Student("Bob", 16, 10);*/

    public void studentInfo() {
        System.out.println("this is " + name + " he is " + age + " and he is in the " + grade + " grade!");
    }
    private int getAge(int age) {
        return age;
    }
    private String getName(String name) {
        return name;
    }
    private void validateAge() {
        if (age < 18) {
            System.out.println("sorry you are not legal age!");
        } else {
            System.out.println("congrats you're 18!");
        }
    }

    public static void main(String[] args) {
        Student student = new Student("Bob", 16, 10);
        student.studentInfo();
        student.validateAge();
    }
}


