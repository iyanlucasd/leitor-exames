import java.io.*;

public class app {

    public static void getMetodo() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("converted.txt")));
        RandomAccessFile RAF = new RandomAccessFile("converted.txt", "r");

        String s = "";
        for (int i = 0; i < 37; i++) {
            s = RAF.readLine();
        }
        System.out.println(s);
    }
    public static void main(String[] args) throws Exception  {
        getMetodo();
    }

}