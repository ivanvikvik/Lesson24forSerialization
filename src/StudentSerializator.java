import java.io.*;

public class StudentSerializator {
    public static void write(Student student, String fileName) {
        ObjectOutputStream stream = null;

        try {
            stream =
                    new ObjectOutputStream(
                            new BufferedOutputStream(
                                    new FileOutputStream(fileName)));

            stream.writeObject(student);
            stream.flush();

        } catch (IOException exception) {
            System.out.println(exception);
        } finally {
            if (stream != null) {
                try {
                    stream.close();
                } catch (IOException exception) {
                    System.out.println(exception);
                }
            }
        }
    }

    public static Student read(String fileName) {
        ObjectInputStream stream = null;
        Student student = null;

        try {
            stream = new ObjectInputStream(new BufferedInputStream(
                    new FileInputStream(fileName)));

            student = (Student) stream.readObject();

        } catch (IOException | ClassNotFoundException exception) {
            System.out.println(exception);
        } finally {
            if (stream != null) {
                try {
                    stream.close();
                } catch (IOException exception) {
                    System.out.println(exception);
                }
            }
        }

        return student;
    }


}
