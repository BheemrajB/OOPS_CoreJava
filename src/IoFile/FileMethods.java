package IoFile;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileMethods {
    public static void main(String[] args) throws IOException {
//        String filePath = "/Users/bheemrajbenne/Desktop/canada/what";
//        String dirPath="/Users/bheemrajbenne/Desktop/canada/directory";
//        try {
        //NORMAL FILE

//            File file1 = new File(filePath);
//            System.out.println(file1.exists());
//            System.out.println(file1.getPath());
//            System.out.println(file1.isDirectory());
//            System.out.println(file1.isFile());
//            System.out.println(file1.createNewFile());
//            System.out.println(file1.exists());


        //DIRECTORY FILE

//            File dir =new File(dirPath);
//            System.out.println(dir.getPath());
//            System.out.println(dir.isDirectory());
//            System.out.println(dir.isFile());
//            System.out.println(dir.exists());
//            dir.mkdir();
//            System.out.println("dir.exists() = " + dir.exists());


        //No of files in a specified path
//            File file2 = new File("/Users/bheemrajbenne/Documents/OOPS_JAVA/src");
//            String str[]=file2.list();
//            int count=0;
//            for (String name:str){
//                count++;
//                System.out.println(name);
//            }
//            System.out.println("Number of files on the path specified :"+ count);
//
//
//        }
//        catch (Exception e){
//            System.out.println("issue happend");
//        }



                    /// Reads characters in the array



        String filePath = "/Users/bheemrajbenne/Desktop/canada/what";
        FileReader reader = null;

        try {
            File file2 = new File(filePath);
            reader = new FileReader(file2);
            char ch[]= new char[(int)file2.length()];
            reader.read(ch);

            for (char c: ch){
                System.out.print(c);
            }




//
//
//
//
//            int i = reader.read();
////        System.out.println((char) i);
//            while (i != -1) {
//                System.out.print(i +"=>"+(char) i);
//                System.out.print("\t");
//                i = reader.read();}

        }
        catch (Exception e)
        {
            System.out.println("something went wrong");
        } finally {
            reader.close();
        }
    }
}
