import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int chapters = in.nextInt(), problems = in.nextInt();
        
        // Minimum problem number for page is k * (page of chapter - 1) + 1
        // Max is k * (page of chapter) or (last problem of chapter)
        
        int page = 1, pageOfChapter = 1;
        int special = 0;
        for(int i = 0; i < chapters; i++){
            int chapterProb = in.nextInt();
            int probLeft = chapterProb;
            while(probLeft > 0){
                int minProb = problems * (pageOfChapter - 1) + 1;
                int maxProb = pageOfChapter * problems > chapterProb ? chapterProb : pageOfChapter * problems;
                if(minProb <= page && maxProb >= page)
                    special++;
                probLeft -= problems;
                page++;
                pageOfChapter++;
            }
            pageOfChapter = 1;
        }
        System.out.println(special);
        
        
        
    }
}
