import java.math.BigDecimal;
import java.util.*;
class Solution{

    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
      	sc.close();
        
        Comparator<String> valueComp = new Comparator<String>(){
            public int compare(String one, String two){
                if(one == null || two == null)
                    return 0;
                
                BigDecimal oneBD = new BigDecimal(one);
                BigDecimal twoBD = new BigDecimal(two);
                
                return oneBD.compareTo(twoBD);
            }
        };

        Arrays.sort(s, Collections.reverseOrder(valueComp));
                //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}
