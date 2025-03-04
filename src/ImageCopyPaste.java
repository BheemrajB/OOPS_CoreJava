import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ImageCopyPaste {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("/Users/bheemrajbenne/Desktop/copyFrom/KCR.jpeg");
        FileOutputStream fos = new FileOutputStream("/Users/bheemrajbenne/Desktop/copyTo/MODI.jpeg");

        int ch;
        while ((ch = fis.read()) != -1) {
            fos.write(ch);
        }

        fos.close();
        fis.close();
        System.out.println("Image has been copied successfully.");
    }
}


