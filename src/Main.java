import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String fileName = "d:\\vikvik\\student.bin";
//        String stFileName = "d:\\vikvik\\student.info";
        Student student = new Student("Alex", 20, 10, true);
        StudentSerializator.write(student, fileName);

//        StudentWorker.write(student, stFileName);
//        System.out.println(StudentWorker.read(stFileName));
        Student st = StudentSerializator.read(fileName);
        System.out.println( st == null ? "Error" : st );
    }
}