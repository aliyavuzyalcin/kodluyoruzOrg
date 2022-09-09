package OOP.WorkStudentPortal;

/**
 * @author Ali Yavuz YALCIN
 * 
 * This class defines the Teacher object. It has a few attributes and behaviors.
 */
public class Teacher {
    String name;
    String phoneNumber;
    String branch;

    Teacher(String name, String phoneNumber, String branch){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.branch = branch;
    }
    void print(){
        System.out.println("Name: " + this.name + "\nPhone Number: " + this.phoneNumber + "\nBranch: " + this.branch);
    }
}
