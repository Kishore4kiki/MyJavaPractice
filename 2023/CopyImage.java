import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyImage {
    public static void main(String[] args) {
        
        
        try {
            InputStream input = new FileInputStream("C:\\Users\\Admin\\Desktop\\batman.jpg");
            OutputStream output = new FileOutputStream("C:\\Users\\Admin\\Desktop\\kishore.jpg");

            int content = input.read();
            while (content!=-1){
                output.write(content);
                content = input.read();
            }
            output.flush();

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
}
