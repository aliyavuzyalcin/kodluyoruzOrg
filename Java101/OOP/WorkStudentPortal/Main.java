package OOP.WorkStudentPortal;

public class Main {
    public static void main(String[] args) {
        
        Course math = new Course("Mathematics", "101", "MATH", 0.20, 0.80);
        Course pyhsics = new Course("Pyhsics", "101", "PYH", 0.20, 0.80);
        Course chemistry = new Course("Chemistry", "101", "CHEM", 0.20, 0.80);

        Teacher t1 = new Teacher("Max Well", "6456465", "MATH");
        Teacher t2 = new Teacher("Matt Damon", "4587975", "PYH");
        Teacher t3 = new Teacher("Amy Winehouse", "6682134", "CHEM");
        math.addTeacher(t1);
        pyhsics.addTeacher(t2);
        chemistry.addTeacher(t3);

        Student s1 = new Student("Jason Bourne", "312153414", "4", math, pyhsics, chemistry);
        s1.addBulkExamGrade(100, 50, 100, 50, 100, 40);
        s1.isPass();
        //s1.printGrades();

        Student s2 = new Student("Mark Wahlberg", "123215123", "4", math, pyhsics, chemistry);
        s2.addBulkExamGrade(100, 100, 100, 50, 100, 40);
        s2.isPass();
        //s2.printGrades();

        Student s3 = new Student("Ben Affleck", "2352364332", "4", math, pyhsics, chemistry);
        s3.addBulkExamGrade(100, 50, 100, 20, 100, 40);
        s3.isPass();
        //s3.printGrades();

    }
}
