import java.io.*;
import java.util.*;
import java.security.MessageDigest;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try{
            MessageDigest md = MessageDigest.getInstance("MD5");
            String input = in.next();
            byte[] d = md.digest(input.getBytes());
            
            for(byte b : d)
                System.out.printf("%02x", b);
            
        } catch(Exception e) {
            e.getMessage();
        }
    }
}
