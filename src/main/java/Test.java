import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
//        Scanner scanner = new Scanner(System.in);
//        Class classObj1 = Class.forName(scanner.next());
//        Class classObj2 = Class.forName(scanner.next());
//        String methodName = scanner.next();
//
//        Method m = classObj1.getMethod(methodName, classObj2);
//        Object o1 = classObj1.newInstance();
//        Object o2 = classObj2.getConstructor(String.class).newInstance("String value");
//
//        m.invoke(o1, o2);
//
//        System.out.println(o1);

        SomePerson somePerson = new SomePerson();

        Method[] methods = somePerson.getClass().getDeclaredMethods();
        for (Method method : methods) {
            if (method.getName().equals("privateMethod")) {
                method.setAccessible(true);
                method.invoke(somePerson);
            }
        }








//        SomePerson somePerson = new SomePerson();
//        Class personClass = SomePerson.class;
//
//       Method[] method = personClass.getDeclaredMethods();
//       for (Method method1 : method) {
//           System.out.println(method1.getName() + " "
//                   + method1.getReturnType() + " "
//                   + Arrays.toString(method1.getParameterTypes()));
//       }
//
//       Field[] fields = personClass.getDeclaredFields();
//       for (Field field : fields) {
//           System.out.println(field.getName() + " " + field.getType());
//       }
    }
}

