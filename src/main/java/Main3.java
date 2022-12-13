import java.io.*;
import java.util.Arrays;

public class Main3 {
    public static void main(String[] args) {
        File directory = new File("FolderWithNames");
        directory.mkdir();
        File file = new File("FolderWithNames/names.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

//        try(InputStream inputStream = new FileInputStream(file)) {
//            int a = inputStream.read();
//            while (a != -1) {
//                System.out.print((char) a);
//                a = inputStream.read();
//            }
//
//        }catch (Exception e) {
//            e.printStackTrace();
//        }

        try(Reader reader = new InputStreamReader(new FileInputStream(file))){
            char[] array = new char[128];
            int a = reader.read(array);
            StringBuilder result = new StringBuilder();
            while (a > 0) {
                result.append(new String(array, 0, a));
                a = reader.read(array);
            }
            String[] names = result.toString().split(" ");
            Arrays.stream(names)
                    .filter(name -> name.startsWith("A"))
                    .forEach(System.out::println);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
