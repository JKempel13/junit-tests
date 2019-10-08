import java.util.ArrayList;

public class Student {

    private String name;
    private long id;
    private ArrayList<Integer> grades;

    public Student(long id, String name) {
        this.name = name;
        this.id = id;
        this.grades = new ArrayList<>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(long id) {
        this.id = id;
    }

    // returns the student's id
    public long getId() {
        return this.id;
    }

    // returns the student's name
    public String getName() {
        return this.name;
    }

    // adds the given grade to the grades list
    public ArrayList<Integer> getGrades() {
        return this.grades;
    }

    // returns the average of the students grades
    public double getGradeAverage() {
        double avg = 0;
        for (int grade : this.grades) {
            avg += grade;
        }
        //========used explicit casting to get a double type ===========//
        return avg / this.grades.size();
    }

    public void addGrade(int grade) {
        this.grades.add(grade);
    }
}

