package inheritance;

public class Student extends Person{
    private String study_level;
    private String specialization;
    private double gpa;

public Student(String study_level,String specialization,double gpa,String name,String address, double age, String nationality  ){
    super(name,nationality,age,address);
    this.study_level=study_level;
         this.gpa=gpa;
         this.specialization=specialization;

}

    public Student(String name, String nationality, double age, String address, String study_level, String specialization, double gpa) {
        super(name, nationality, age, address);
        this.study_level = study_level;
        this.specialization = specialization;
        this.gpa = gpa;
    }

            public Student(String study_level,String specialization,double gpa){
            this.gpa=gpa;
            this.specialization=specialization;
            this.study_level=study_level;
            }
}