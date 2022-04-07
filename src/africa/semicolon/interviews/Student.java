package africa.semicolon.interviews;

import java.util.*;

public record Student(int id, String name, double cgpa) implements Comparable<Student> {


    @Override
    public int compareTo(Student student) {
        int compare = Double.compare(this.cgpa, student.cgpa);
        if (compare != 0) return compare;

        return student.name.compareTo(this.name);
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return id == student.id && Double.compare(student.cgpa, cgpa) == 0 && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, cgpa);
    }
}

class Priorities {
    public static List<Student> getStudents(List<String> events){
        PriorityQueue<Student> studentPriorityQueue = new PriorityQueue<>(Comparator.reverseOrder());
        events.forEach(event -> {
            if(event.trim().equalsIgnoreCase("SERVED")){
                studentPriorityQueue.poll();
            }
            else if(event.trim().substring(0, 5).equalsIgnoreCase("ENTER")){
                String[] studentDetails = event.substring(5).trim().split(" ");
                System.out.println(Arrays.toString(studentDetails));
                System.out.println(studentDetails[2] + " --> "+studentDetails[0] + "-->" + studentDetails[1]);
                Student student = new Student(Integer.parseInt(studentDetails[2]), studentDetails[0], Double.parseDouble(studentDetails[1]));
                studentPriorityQueue.add(student);
            }else {
                throw new IllegalArgumentException("The word can only be 'SERVED' or start with 'ENTER'");
            }
        });

        studentPriorityQueue.forEach(x -> System.out.println(x.name()));


        return studentPriorityQueue.stream().toList();
    }

    public static void main(String[] args) {
        List<String> events = List.of(
                "ENTER John 3.75 50",
                "ENTER Mark 3.8 24",
                "ENTER Shafaet 3.7 35",
                "SERVED",
                "SERVED",
                "ENTER Samiha 3.85 36",
                "SERVED",
                "ENTER Ashley 3.9 42",
                "ENTER Maria 3.6 46",
                "ENTER Anik 3.95 49",
                "ENTER Dan 3.95 50",
                "SERVED"
        );

        List<Student> students = Priorities.getStudents(events);
        System.out.println(students);
    }
}


