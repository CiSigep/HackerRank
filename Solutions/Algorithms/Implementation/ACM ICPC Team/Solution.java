import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        String[] knowledge = new String[n];
        
        for(int i = 0;i < n; i++)
            knowledge[i] = in.next();
        
        int maxKnowledge = 0;
        int maxKnowledgeTeams = 0;
        for(int i = 0; i < n; i++){
            BigInteger bi = new BigInteger(knowledge[i], 2);
            BitSet bsi = BitSet.valueOf(bi.toByteArray());
            
            for(int j = i; j < n; j++){
                BigInteger bj = new BigInteger(knowledge[j], 2);
                BitSet bsj = BitSet.valueOf(bj.toByteArray());
                
                
                bsj.or(bsi);
                int knowledgePair = bsj.cardinality();
                    
                if(knowledgePair > maxKnowledge){
                    maxKnowledge = knowledgePair;
                    maxKnowledgeTeams = 1;
                }
                else if(knowledgePair == maxKnowledge)
                    maxKnowledgeTeams++;
                
                
            }
        }
            
        System.out.println(maxKnowledge);
        System.out.println(maxKnowledgeTeams);
    }
}
