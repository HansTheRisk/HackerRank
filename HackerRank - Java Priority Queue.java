
import java.util.PriorityQueue;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;
/*
 * Create the Student and Priorities classes here.
 */

class Student implements Comparable<Student> {
    private int id;
    private String name;
    private double cgpa;
    public Student(int id, String name, double cgpa) {
        super();
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getCGPA() {
        return cgpa;
    }
    
    public int compareTo(Student other) {
        int result = Double.compare(other.getCGPA(), cgpa);
        if(result == 0)
            result = name.compareTo(other.getName());
            if(result == 0)
                return Integer.compare(id, other.getId());
        return result;
    }
}

class Priorities {
    public List<Student> getStudents(List<String> events) {
        PriorityQueue<Student> queue = new PriorityQueue();
        
        events.forEach(event -> {
            
            final Scanner scanner = new Scanner(event).useLocale(Locale.US);
            final String command = scanner.next();
            
            switch(command) {
                case "ENTER":
                    final String name = scanner.next();
                    final double cgpa = scanner.nextDouble();
                    final int id = scanner.nextInt();
                    
                    queue.add(new Student(id, name, cgpa));
                    break;
                case "SERVED":
                    queue.poll();
                    break;
                default:
                    scanner.close();
                    break;
            }
        });
        return Stream.generate(queue::poll).limit(queue.size())
                                           .collect(Collectors.toList());
    }
}

