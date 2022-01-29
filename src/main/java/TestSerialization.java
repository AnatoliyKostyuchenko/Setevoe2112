import java.io.*;
import java.io.File;

public class TestSerialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        TransferObject object = new TransferObject("tag", "Message");
        System.out.println(object);
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("data.txt"));
        os.writeObject(object);
        PrintWriter out = new PrintWriter("data.txt");
        try {
            out.print("data.txt");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            out.close();
        }

        ObjectInputStream is = new ObjectInputStream(new FileInputStream("data.txt"));
        TransferObject object1 = (TransferObject) is.readObject();
        System.out.println(object);
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader br = new BufferedReader(new FileReader(String.valueOf(out)));
            try {
                String s;
                while ((s = br.readLine())!=null);
            }catch(Exception e){
                e.printStackTrace();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
