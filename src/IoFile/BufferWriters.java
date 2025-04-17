package IoFile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriters {
    public static void main(String[] args) throws IOException {
        String filePath = "/Users/bheemrajbenne/Desktop/canada/what";
        FileWriter writer = null;
        BufferedWriter bWriter= null;

        try {
            File file10 = new File(filePath);
            writer = new FileWriter(file10, true);
            bWriter = new BufferedWriter(writer);

            bWriter.write("Alien");
            bWriter.newLine();
            bWriter.write(67);
            bWriter.newLine();
            bWriter.write(33);
            bWriter.newLine();

            char ch[]={'j', 'a', 'v', 'a'};
            bWriter.write(ch);
            bWriter.newLine();
            System.out.println("Open the file in hardDisk");

        }
        catch (Exception e){
            System.out.println("MessedUp"+ e.getMessage());
        }
        finally{
//            bWriter.flush();
            bWriter.close();
        }
    }
}
