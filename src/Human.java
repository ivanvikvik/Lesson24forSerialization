import java.io.Externalizable;
import java.io.Serializable;

public class Human implements Externalizable {
    transient public String name;

    public Human() {
    }

    public Human(String name) {
        this.name = name;
    }
}
