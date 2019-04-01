package grades;
import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private List<Integer> grades;

    public Student(String name){
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public void addGrade(int grade){
        this.grades.add(grade);
    }

    public double getGradeAverage(){
        int total = 0;

        for(int i = 0; i < this.grades.size(); i++){
            total += this.grades.get(i);
        }

        return (double)total / (double)this.grades.size();
    }


    public static void main(String[] args) {
        Student Marcus = new Student("Marcus");
        Marcus.addGrade(90);
        Marcus.addGrade(80);


        System.out.println(Marcus.getGradeAverage());
    }


}


