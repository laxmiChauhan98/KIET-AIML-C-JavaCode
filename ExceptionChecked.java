import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionChecked {
    public static void main(String[] args) {
        try {
            FileInputStream fs = new FileInputStream("C:/Users/HP/Desktop/txt_files/abc.txt");
            System.out.println("File opened successfully!");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}


// import java.io.FileInputStream;

// public class ExceptionChecked {
//     public static void main(String[] args) {
//         try{
//         FileInputStream fs=new FileInputStream("C:/Users/HP/Desktop/txt_files/abc.txt");
//     }
// }
    
// }























