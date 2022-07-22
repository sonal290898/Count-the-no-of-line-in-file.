 import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int i=1; //  It counts the number of line.
        Scanner sc=new Scanner(System.in); /// Scanner obj
        while(sc.hasNext()==true) // hasNext() returns true if there is any word/line remain in the input 
        {
            String s=sc.nextLine();
            System.out.println(i+" " + s);
            i++;
        }
    }
}
