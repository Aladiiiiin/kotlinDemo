import com.sun.xml.internal.ws.util.StringUtils;

import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;

public class CheckCaseValidator {
    public static void getInfo(Class<?> clazz) {
        String name = "";
        String gender = "";
        String profile = "";
        Field fields[] = clazz.getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(Name.class)) {
                Name arg0 = field.getAnnotation(Name.class);
                name = name + arg0.value();
                System.out.println(name);
            }
        }
    }
}
