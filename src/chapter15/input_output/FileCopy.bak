package chapter15.input_output;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main( String[] args ) {
        int data;
        try {
            FileInputStream fis = new FileInputStream( args[0] );
            FileOutputStream fos = new FileOutputStream( args[1] );

            while (( data = fis.read() ) != -1) {
                fos.write( data );
            }

            fis.close();
            fos.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
