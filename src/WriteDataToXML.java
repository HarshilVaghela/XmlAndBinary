import java.beans.XMLEncoder;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;
/**
 * Write a description of class WriteDataToXML here.
 *
 * @author (Harshilkumar Vaghela,3116318)
 * @date (March 14,2020, ACS-1904, Lab-9)
 */ 
public class WriteDataToXML {
    public static void main(String[] args) 
    throws IOException{
        Random rand=new Random();
        XMLEncoder encoder = new XMLEncoder(new FileOutputStream("lab9.xml"));
        int[] myData = new int[10];
        int num=0;
        for(int e=0;e<myData.length;e++){// adding random data to xml
            num=rand.nextInt(100)+1;
            myData[e]=num;
        }
        for (int i=0; i<myData.length; i++){
            encoder.writeObject(myData[i]);
        }
        encoder.close();
        System.out.println("Values have been added to lab9.xml");
    }
}