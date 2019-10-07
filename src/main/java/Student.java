import java.util.ArrayList;

public class Student {

    private String name;
    private long id;
    ArrayList<Integer> grades;

    public Student (long id, String name) {
        this.name = name;
        this.id = id;
        grades = new ArrayList<>();
    }

    public void setName (String name){
        this.name = name;
    }

    public void setId (long id){
        this.id = id;
    }

    // returns the student's id
    public long getId(){
        return this.id;
    }
    // returns the student's name
    public String getName(){
        return this.name;
    }
    // adds the given grade to the grades list
    public void addGrade(int grade){
        this.grades.add(grade);
    }
    // returns the average of the students grades
    public double getGradeAverage(){
        int temp = 0;
        for (Integer grade : this.grades) {
            temp += grade;
        }
        //========used explicit casting to get a double type ===========//
        return (double) (temp / this.grades.size());
    }

}
