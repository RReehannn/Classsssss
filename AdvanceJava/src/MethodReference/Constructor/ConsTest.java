package MethodReference.Constructor;

public class ConsTest {
    public static void main(String[] args) {

        System.out.println("Learning Constructor Reference");

        //constructor reference
        //ClassName::new
        Provider provider = Student::new;
        Student student = provider.getStudent();

        student.display();
    }
}
