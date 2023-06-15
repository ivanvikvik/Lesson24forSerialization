import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Student extends Human { //implements Serializable {
    public static int count = 0;
//    public String name;
    private static final long serialVersionUID = 1L;
    public int age;
    public MarkNote note;
    transient public double mark;
    public  boolean alive;

    {
        note = new MarkNote();
    }

    public Student() {
        super(null);
    }

    public Student(String name, int age, double mark, boolean alive) {
        super(name);
        this.age = age;
        this.mark = mark;
        this.alive = alive;
    }

    @Override
    public String toString() {
        return "Student {" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", mark=" + mark +
                ", alive=" + alive +
                " }";
    }

    private void writeObject(ObjectOutputStream out)
            throws IOException {
        out.defaultWriteObject();
        out.writeUTF(name);
        out.writeDouble(mark);
    }
    private void readObject(ObjectInputStream in)
            throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        name = in.readUTF();
    }
}
