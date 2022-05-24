import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
/**
 * Write a description of class ReadBinaryInfo here.
 *
 * @author (Harshilkumar Vaghela,3116318)
 * @date (March 14,2020, ACS-1904, Lab-9)
 */ 
public class ReadBinaryInfo {
    public static void main(String[] args) 
    throws IOException {
        char[] firstInitial=new char[4];
        String[] lastName=new String[4];
        int[] age = new int[4];
        DataInputStream  is 
        = new DataInputStream(
                new FileInputStream("Lab9.ser"));
       
        for (int i=0; i<firstInitial.length; i++) 
            firstInitial[i] = is.readChar();
        for (int j=0; j<lastName.length; j++) 
            lastName[j] = is.readUTF();
        for (int k=0; k<age.length; k++) 
            age[k] = is.readInt();
        
        for(int i=0; i<4; i++){
            System.out.println(firstInitial[i]+". "+lastName[i]+", "+age[i]);
        }
        is.close();
    }
}
