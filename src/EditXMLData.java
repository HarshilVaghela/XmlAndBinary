import java.beans.XMLDecoder;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;
import java.beans.XMLEncoder;
import java.io.FileOutputStream;

/**
 * Write a description of class EditXMLData here.
 *
 * @author (Harshilkumar Vaghela,3116318)
 * @date (March 14,2020, ACS-1904, Lab-9)
 */ 

public class EditXMLData {
    public static void main(String[] args) 
    throws IOException{
        XMLDecoder decoder = new XMLDecoder(new FileInputStream("lab9.xml"));
        int[] data = new int[10];
        for (int i=0; i<data.length; i++){
            data[i] = (int) decoder.readObject();
        }
        for (int i: data){
            System.out.println(i);
        }
        decoder.close();
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter an integer from 1-10");
        int input=kb.nextInt();
        for(int e=0;e<data.length;e++){// multiplying every number from xml with input
            data[e]=data[e]*input;
        }
        XMLEncoder encoder = new XMLEncoder(new FileOutputStream("lab9.xml"));
        for (int i=0; i<data.length; i++) 
            encoder.writeObject(data[i]);
        encoder.close();
        System.out.println("New values added to lab9.xml");
    }
}