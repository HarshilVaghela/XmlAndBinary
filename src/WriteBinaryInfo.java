import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 * Write a description of class WriteBinaryInfo here.
 *
 * @author (Harshilkumar Vaghela,3116318)
 * @date (March 14,2020, ACS-1904, Lab-9)
 */ 
public class WriteBinaryInfo {
    public static void main(String[] args) 
    throws IOException {
        char[] firstInitial={'H','R','R','A'};
        String[] lastName={"Potter","Weasley","Lupin","Dumbledore"};
        int[] age = {12, 12, 35, 150};
        DataOutputStream  os 
        = new DataOutputStream(
                new FileOutputStream("Lab9.ser"));
        for (int i=0; i<firstInitial.length; i++) os.writeChar(firstInitial[i]);
        for (int j=0; j<lastName.length; j++) os.writeUTF(lastName[j]);  
        for (int k=0; k<age.length; k++) os.writeInt(age[k]);
        os.close();
        System.out.println("Added values to lab9.ser");
    }
}
