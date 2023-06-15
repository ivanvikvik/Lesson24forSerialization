import java.io.Serializable;

public class Human implements Serializable {
    public String name;

    public Human() {
    }

    public Human(String name) {
        this.name = name;
    }
}
