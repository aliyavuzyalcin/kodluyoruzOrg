package OOP.WorkStudentPortal;

/**
 * @author Ali Yavuz YALCIN
 * 
 * This class defines the Student object. It has several attributes and few behaviors.
 */
public class Student {
    String name;
    String stdNo;
    String classes;
    Course course1;
    Course course2;
    Course course3;
    double average;
    boolean isPass;
    double resultCourse1, resultCourse2, resultCourse3;

    Student(String name, String stdNo, String classes, Course course1, Course course2, Course course3) {
        this.name = name;
        this.stdNo = stdNo;
        this.classes = classes;
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
        average = 0;
        isPass = false;
    }

    /**
     * This method helps us to assign the grades of exams which are given by the user to the attributes of the course objects.
     * It controls the value of the parameters so that can avoid possible unwanted results.
     * 
     * @param gradeVerbalC1 - It is the variable of the grade for Verbal Exam of Course1.
     * @param gradeExamC1 - It is the variable of the grade for Written Exam of Course1.
     * @param gradeVerbalC2 - It is the variable of the grade for Verbal Exam of Course2.
     * @param gradeExamC2 - It is the variable of the grade for Written Exam of Course2.
     * @param gradeVerbalC3 - It is the variable of the grade for Verbal Exam of Course3.
     * @param gradeExamC3 - It is the variable of the grade for Written Exam of Course3.
     */
    void addBulkExamGrade(int gradeVerbalC1, int gradeExamC1, int gradeVerbalC2, int gradeExamC2, int gradeVerbalC3,
            int gradeExamC3) {
        if ((gradeVerbalC1 >= 0 && gradeVerbalC1 <= 100) && (gradeExamC1 >= 0 && gradeExamC1 <= 100)) {
            this.course1.gradeVerbal = gradeVerbalC1;
            this.course1.gradeExam = gradeExamC1;
        }
        if ((gradeVerbalC2 >= 0 && gradeVerbalC2 <= 100) && (gradeExamC2 >= 0 && gradeExamC2 <= 100)) {
            this.course2.gradeVerbal = gradeVerbalC2;
            this.course2.gradeExam = gradeExamC2;
        }
        if ((gradeVerbalC3 >= 0 && gradeVerbalC3 <= 100) && (gradeExamC3 >= 0 && gradeExamC3 <= 100)) {
            this.course3.gradeVerbal = gradeVerbalC3;
            this.course3.gradeExam = gradeExamC3;
        }
    }

    /**
     * This method uses the calcAverage() method. Then prints the result.
     */
    void isPass() {
        calcAverage();
        System.out.println("============================================");
        if (this.average >= 55) {
            System.out.println(this.name + " passed!");
            System.out.println("The average: " + this.average);
        } else {
            System.out.println(this.name + " failed!");
            System.out.println("The average: " + this.average);
        }
        System.out.println("============================================");
    }
    /**
     * This method calculates if the student pass the course or failed it.
     * Formula;
     * CourseGrade1 = (Verbal Exam Grade * Weight of Verbal Exam) + (Written Exam Grade * Weight of Written Exam)
     * Do this calculation for each course.
     * Then calculate the average;
     * average = (courseGrade1 + courseGrade2 + courseGrade3) / 3
     * 
     */
    void calcAverage() {
        resultCourse1 = (this.course1.gradeVerbal * this.course1.rateVerbal)
                + (this.course1.gradeExam * this.course1.rateExam);
        resultCourse2 = (this.course2.gradeVerbal * this.course2.rateVerbal)
                + (this.course2.gradeExam * this.course2.rateExam);
        resultCourse3 = (this.course3.gradeVerbal * this.course3.rateVerbal)
                + (this.course3.gradeExam * this.course3.rateExam);
        this.average = (resultCourse1 + resultCourse2 + resultCourse3) / 3;
    }

    void printGrades() {
        System.out.println("============================================");
        System.out.println("Class Name: " + this.course1.name
                + "\nClass Code: "
                + course1.code
                + " || Class prefix: "
                + course1.prefix
                + " || Exam Rate: "
                + course1.rateExam
                + " || Verbal exam rate: "
                + course1.rateVerbal
                + " || Exam Grade: "
                + course1.gradeExam
                + " || Verbal Exam Grade: "
                + course1.gradeVerbal);
        System.out.println("============================================");
        System.out.println("Class Name: " + this.course2.name
                + "\nClass Code: "
                + course2.code
                + " || Class prefix: "
                + course2.prefix
                + " || Exam Rate: "
                + course2.rateExam
                + " || Verbal exam rate: "
                + course2.rateVerbal
                + " || Exam Grade: "
                + course2.gradeExam
                + " || Verbal Exam Grade: "
                + course2.gradeVerbal);
        System.out.println("============================================");
        System.out.println("Class Name: " + this.course3.name
                + "\nClass Code: "
                + course3.code
                + " || Class prefix: "
                + course3.prefix
                + " || Exam Rate: "
                + course3.rateExam
                + " || Verbal exam rate: "
                + course3.rateVerbal
                + " || Exam Grade: "
                + course3.gradeExam
                + " || Verbal Exam Grade: "
                + course3.gradeVerbal);
        System.out.println("============================================");
    }

}
