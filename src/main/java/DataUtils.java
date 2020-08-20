import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings("unchecked")
public final class DataUtils {

    public static String[] getNullableProperty(String jsonString) throws IOException {
        HashMap jsonMap;
        jsonMap = JsonUtils.marshal(jsonString, HashMap.class);

        Set<String> nullSet = new HashSet<>();
        jsonMap.forEach((key, value) -> {
            if (value == null) {
                nullSet.add(key.toString());
            }
        });

        String[] result = new String[nullSet.size()];
        return nullSet.toArray(result);
    }

    public static String[] getNullableProperty(Object jsonObj){
        ObjectMapper mapper = new ObjectMapper();
        HashMap<String, Object> jsonMap = mapper.convertValue(jsonObj, new TypeReference<HashMap<String, Object>>() {});

        Set<String> nullSet = new HashSet<>();
        jsonMap.forEach((key, value) -> {
            if (value == null) {
                nullSet.add(key.toString());
            }
        });

        String[] result = new String[nullSet.size()];
        return nullSet.toArray(result);
    }

}
