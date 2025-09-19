package Unit3;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesFileExample {
    public static void main(String[] args) {
      try{
        Properties props = new Properties();

        // Set properties
        props.setProperty("db.user", "Laxmi");
        props.setProperty("db.password", "secret");
    

        // Save to a file
        FileOutputStream fos = new FileOutputStream("config.properties");
        props.store(fos, "Database Configuration");
        System.out.println("Info has been stored in file");
        fos.close();

        // Now load file
         Properties loadProps = new Properties();
        FileInputStream fis = new FileInputStream("config.properties");
        loadProps.load(fis);
        System.out.println("File has been loaded");
        fis.close();

          
        // Print loaded values
        System.out.println("User: " + loadProps.getProperty("db.user"));
        System.out.println("Password: " + loadProps.getProperty("db.password"));
            

        //printing via output stream
        props.list(System.out);
      }     
      catch(IOException e){
        System.out.println(e);
      }
    }
    }



