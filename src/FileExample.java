import java.io.*;
import java.util.Scanner;
public class FileExample {
    public static void main(String[] args) throws IOException {
        File file = new File("Resources/file.txt");
        Scanner input=new Scanner(System.in);
        //File is a class that take care of file, folders and shows if those exist or not.
        //It may also create if a file does not exist
        //Shows metadata of specified file
        if(file.exists()) {
            System.out.println("File exist in this directory: " + file.getAbsolutePath());
        }
        else{
            System.out.println("File dosen't exist");
            System.out.println("Do you want to create this file(yes/no): ");
            String ans=input.next().toLowerCase();
            if (ans.equals("yes")) {
                try {
                    if (file.createNewFile()) {
                        System.out.println("File created sucsefully");
                    } else {
                        System.out.println("File not created sucsefully");
                    }
                } catch (IOException e) {
                    System.out.println("File not created succesfully");
                }
            }
        }
        try {
            FileReader reader=new FileReader(file);
            int i;
            while((i= reader.read())!=-1){
                System.out.print((char)i);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Duke punuar me writer");
        FileWriter write;
        {
            try {
                write = new FileWriter("C://Users//afrim//IdeaProjects//JavaFondamentals24//Resources//file1.txt");
                String name="Afrim\n";
                write.write(name);
                write.flush();
                write.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Duke perdorur writer");
        String filePath="Resource/file1.txt";
        FileInputStream inputStream;
        {
            try {
                inputStream = new FileInputStream(filePath);
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
