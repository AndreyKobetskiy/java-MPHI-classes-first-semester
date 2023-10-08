package sem2.Solution47;

import java.io.*;

public class Solution47 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        InputStream fileInputStream = getInputStreamCorrrection(reader);
        String destinationFileName = reader.readLine();
        OutputStream fileOutputStream = getOutputStream(destinationFileName);

        int count = 0;
        while (fileInputStream.available() > 0) {

            int data = fileInputStream.read();
            fileOutputStream.write(data);
            count++;

        }
        System.out.println("Скопировано байт " + count);
        fileInputStream.close();
        fileOutputStream.close();
    }
    // FileNotFoundException
    // src/sem2/Solution47/input.txt
    // src/sem2/Solution47/output.txt
    public static InputStream getInputStreamCorrrection(BufferedReader reader) throws IOException{
        try {
            String sourceFileName = reader.readLine();
            return getInputStream(sourceFileName);
        } catch (FileNotFoundException e){
            System.out.println("Файл не существует. Попробуйте снова.");
            return getInputStreamCorrrection(reader);
        }
    }
    public static InputStream getInputStream(String fileName) throws IOException {
        return new FileInputStream(fileName);
    }

    public static OutputStream getOutputStream(String fileName) throws IOException {
        return new FileOutputStream(fileName);
    }
}
