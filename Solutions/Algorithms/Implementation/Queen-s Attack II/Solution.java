import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int rQueen = in.nextInt();
        int cQueen = in.nextInt();
        int nDist = Math.abs(n - rQueen);
        int eDist = Math.abs(n - cQueen);
        int sDist = rQueen - 1;
        int wDist = cQueen - 1;
        int neDist = Math.min(Math.abs(n - rQueen), Math.abs(n - cQueen));
        int nwDist = Math.min(Math.abs(n - rQueen), cQueen - 1);
        int swDist = Math.min(rQueen - 1, cQueen - 1);
        int seDist = Math.min(rQueen - 1, Math.abs(n - cQueen));

        for(int a0 = 0; a0 < k; a0++){
            int rObstacle = in.nextInt();
            int cObstacle = in.nextInt();
            int nsDist = Math.abs(rQueen - rObstacle);
            int ewDist = Math.abs(cQueen - cObstacle);
            
            if(ewDist == 0){ // Same column
                if(rQueen > rObstacle && nsDist < sDist)
                    sDist = nsDist - 1;
                else if(rQueen < rObstacle && nsDist < nDist)
                    nDist = nsDist - 1;
            }
            else if(nsDist == 0){ // Same row
                if(cQueen > cObstacle && ewDist < wDist)
                    wDist = ewDist - 1;
                else if(cQueen < cObstacle && ewDist < eDist)
                    eDist = ewDist - 1;
            }
            else if(nsDist == ewDist){ // Diagonal
                if(rQueen > rObstacle){
                    if(cQueen < cObstacle && nsDist < seDist)
                        seDist = nsDist - 1;
                    else if(cQueen > cObstacle && nsDist < swDist)
                        swDist = nsDist - 1;
                }
                else{
                    if(cQueen < cObstacle && nsDist < neDist)
                        neDist = nsDist - 1;
                    else if(cQueen > cObstacle && nsDist < nwDist)
                        nwDist = nsDist - 1;
                }
            }
        }
        System.out.println(nDist + sDist + eDist + wDist + neDist + nwDist + swDist + seDist);
    }
}
