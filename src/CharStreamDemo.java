import java.io.*;

public class CharStreamDemo {

    public static void main(String[] args) throws IOException {

        //declare files
        FileReader inFile = null;
        FileWriter outFile = null;

        try {
            inFile = new FileReader("src/inputFile.txt");
            outFile = new FileWriter("src/outPutFile.txt");

            // read file
            int c;
            while ((c = inFile.read()) != -1) {
                // write in file
                outFile.write(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("File nt found");
        } finally {
            //close files
            if (inFile != null)
                inFile.close();

            if (outFile != null)
                outFile.close();
        }
    }

}
