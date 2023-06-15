import java.io.*;

public class StudentWorker {
    public static void write(Student student, String fileName) {

        try (DataOutputStream stream = new DataOutputStream(
                new BufferedOutputStream(new FileOutputStream(fileName)))) {

            stream.writeUTF(student.name);
            stream.writeInt(student.age);
            stream.writeDouble(student.mark);
            stream.writeBoolean(student.alive);

            stream.flush();

        } catch (IOException exception) {
            System.out.println(exception);
        }
    }

    public static Student read(String fileName) {
        Student student = new Student();

        try (DataInputStream stream = new DataInputStream(new BufferedInputStream(
                new FileInputStream(fileName)))) {

            student.name = stream.readUTF();
            student.age = stream.readInt();
            student.mark = stream.readDouble();
            student.alive = stream.readBoolean();

        } catch (IOException exception) {
            System.out.println(exception);
        }

        return student;
    }
}
