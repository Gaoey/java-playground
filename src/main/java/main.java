import lombok.SneakyThrows;
import lombok.val;
import model.Person;

import java.util.Arrays;

public class main {

    @SneakyThrows
    public static void main(String[] args) {
        val x = new Person("xxx", 12, null, null);
        val y = JsonUtils.unmarshal(x);
        val z = JsonUtils.marshal(y, Person.class);
        val r1 = DataUtils.getNullableProperty(y);
        System.out.println(Arrays.toString(r1));
        val r2 = DataUtils.getNullableProperty(z);
        System.out.println(Arrays.toString(r2));
    }


}
