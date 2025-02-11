package DAY0020;

import java.io.*;

class Day0020 {
    public static void main(String[] args){
        throws IOException tagblock {
            byte data [] = new byte[10];
            System.out.println("Enter some Characters");
            System.in.read(data);
            System.out.println("You entered : ");
            for (int i = 0; i < data.length; i++){
                System.out.println((char) data[i]);
            }
        }
    }
}