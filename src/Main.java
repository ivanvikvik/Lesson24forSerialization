import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList
        String fileName = "d:\\vikvik\\student.bin";
//        Student student = new Student("Alex", 20, 10, true);
//        StudentSerializator.write(student, fileName);

        Student st = StudentSerializator.read(fileName);
        System.out.println( st == null ? "Error" : st );
    }
}