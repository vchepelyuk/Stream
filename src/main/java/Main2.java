import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        String path = "folder1/folder2/folder3";

        File directory = new File(path);
        directory.mkdirs();

        List<File> files = new ArrayList<>();
        files.add(new File(path + "/A1.txt"));
        files.add(new File(path + "/A2.txt"));
        files.add(new File(path + "/A3.txt"));
        files.add(new File(path + "/B1.txt"));
        files.add(new File(path + "/C1.txt"));
        for (File file : files) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        File[] filter = directory.listFiles((dir, name) -> name.startsWith("A"));
        for (File file : filter) {
            System.out.println(file.getAbsolutePath() );
        }
    }
}
