    import java.util.*;
    public class test {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            Deque<Integer> deque = new ArrayDeque<Integer>();
            Map<Integer, Integer> unique = new HashMap<Integer, Integer>();
            int n = in.nextInt();
            int m = in.nextInt();

            int max = 0;
            int frontVal = -1;
            for (int i = 0; i < n; i++) {
                int num = in.nextInt();
                deque.addLast(num);
                if(!unique.containsKey(num))
                        unique.put(num, 1);
                    else
                        unique.put(num, unique.get(num) + 1);
                if(deque.size() > m)
                    frontVal = deque.removeFirst();
                if(deque.size() == m){
                    if(frontVal != -1){
                        if(unique.get(frontVal) > 1)
                            unique.put(frontVal, unique.get(frontVal) - 1);
                        else
                            unique.remove(frontVal);
                    }
                    
                    if(unique.size() > max)
                        max = unique.size();
                    
                }
            }
            System.out.println(max);
        }
    }
