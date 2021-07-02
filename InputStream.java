import  java.io.*;
public class InputStream {
    public static void main(String args[]) throws IOException {

        File src = new File("test.txt");
        File co = new File("coppy2.txt");
        try {
            FileInputStream fis = new FileInputStream(src);
            FileOutputStream fos = new FileOutputStream(co);

            byte bytes[] = new byte[1024];
            int length;
            while ((length = fis.read(bytes)) != -1) {
                fos.write(bytes, 0, length);
            }
            fis.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

