import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("cats.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Tedi", "Scotland", 6));
        cats.add(new Cat("Tom", "Scotland", 8));
        cats.add(new Cat("Mark", "British", 4));
        cats.add(new Cat("Kuzya", "non", 10));

        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file))) {
            objectOutputStream.writeObject(cats);
        }catch (Exception e) {
            e.printStackTrace();
        }

        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))) {
            List<Cat> adCats =(List<Cat>) objectInputStream.readObject();
            for (Cat cat : adCats) {
                System.out.println(cat);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }

    }
}
