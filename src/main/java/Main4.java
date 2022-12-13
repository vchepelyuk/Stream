import java.io.*;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        File directory = new File("FolderFolder");
        directory.mkdir();
        File file = new File("FolderFolder/name.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

//        try(OutputStream outputStream = new BufferedOutputStream(new FileOutputStream(file, true))) {
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Enter name or stop to exit");
//            String next = scanner.nextLine();
//            while (!next.equals("stop")) {
//                outputStream.write(next.getBytes());
//                outputStream.write("\n".getBytes());
//                next = scanner.nextLine();
//            }
//        }catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        try(InputStream inputStream = new BufferedInputStream(new FileInputStream(file))) {
//            byte[] array = new byte[128];
//            int count = inputStream.read(array);
//            StringBuilder result = new StringBuilder();
//            while (count > 0) {
//                result.append(new String(array, 0, count));
//                count = inputStream.read(array);
//            }
//            System.out.println(result.toString());
//        }catch (Exception e) {
//            e.printStackTrace();
//        }

        try(RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r")) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter next page or stop to exit");
            byte[] array = new byte[3000];
            String input = scanner.nextLine();
            while (!input.equals("stop")){
                int page = Integer.parseInt(input);
                randomAccessFile.seek((page -1) * array.length);
                int count = randomAccessFile.read(array);
                System.out.println(new String(array, 0, count));
                System.out.println("Enter next page or stop to exit");
                input = scanner.nextLine();
            }

        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
