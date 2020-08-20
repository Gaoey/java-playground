import lombok.SneakyThrows;
import lombok.val;
import model.Person;

public class main {

    @SneakyThrows
    public static void main(String[] args) {
        val x = new Person("xxx", 12);
        val y = JsonUtils.unmarshal(x);
        val z = JsonUtils.marshal(y, Person.class);
        System.out.println(y);
        System.out.println(z);
    }



}
