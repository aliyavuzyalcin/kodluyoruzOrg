package OOP.WorkStudentPortal;


/**
 * @auther Ali Yavuz YALCIN
 * 
 * This class defines the course object. It has several attributes and behaviors.
 *  
 * Name is for class name. 
 * Code is for class code (i.e. 101 of MATH101).
 * Prefix is abbreviation for class name (i.e MATH101).
 * GradeVerbal is the grade variable to contain the value of Verbal Exam.
 * RateVerbal is the weight of the class. 
 * GradeExam is the grade variable to contain the value of Grade Exam.
 * RateExam is the weight of the class.
 * Teacher is the object from the Teacher class. 
 */
public class Course {
    String name;
    String code;
    String prefix;
    int gradeVerbal;
    double rateVerbal;
    int gradeExam;
    double rateExam;
    Teacher teacher;

    Course(String name, String code, String prefix, double rateVerbal, double rateExam){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this. rateVerbal = rateVerbal;
        this.rateExam = rateExam;
        this.gradeExam = 0;
        this.gradeVerbal = 0;
    }


    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix)){
            this.teacher = teacher;
        }else{
            System.out.println("Teacher and prefix of the course doesn't match. Try again!");
        }
    }

    void printTeacherInfo(){
        this.teacher.print();
    }


}
