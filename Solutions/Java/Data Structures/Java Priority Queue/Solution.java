import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.PriorityQueue;

class Student implements Comparable<Student> {
    private int id;
    private String name;
    private double CGPA;
    
    public Student(int id, String name, double CGPA){
        this.id = id;
        this.name = name;
        this.CGPA = CGPA;
    }
    
    public int getID(){ return id; }
    
    public String getName(){ return name; }
    
    public double getCGPA(){ return CGPA; }
    
    public int compareTo(Student other){
        double CGPAdif = CGPA - other.getCGPA();
        
        if(CGPAdif < 0)
            return 1;
        else if(CGPAdif > 0)
            return -1;
        
        int nameDif = name.compareTo(other.getName());
        if(nameDif != 0)
            return nameDif;
        
        return id - other.getID();
    }
}

class Priorities{
    
    public List<Student> getStudents(List<String> events){
        PriorityQueue<Student> queue = new PriorityQueue<Student>();
        for(String s : events){
            if("SERVED".equals(s))
                queue.poll();
            else{
                String[] vals = s.split("\\s+");
                queue.add(new Student(Integer.parseInt(vals[3]), vals[1], Double.parseDouble(vals[2])));
            }    
        }
        

        List<Student> students = new ArrayList<Student>();
        while(queue.size() > 0)
            students.add(queue.poll());
        
        return students;
    }
    
}

public class Solution {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();
    
    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());    
        List<String> events = new ArrayList<>();
        
        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }
        
        List<Student> students = priorities.getStudents(events);
        
        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}
