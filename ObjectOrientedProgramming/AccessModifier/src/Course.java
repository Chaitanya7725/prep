package ObjectOrientedProgramming.AccessModifier.src;

public class Course {

    public String courseName;
    protected String authorName;
    private Integer numberofReviews;
    Integer numberofStudents;

    public Course() {
        this.courseName = "CAO";
        this.authorName = "Kanad ghose";
        this.numberofReviews = 10;
        this.numberofStudents = 9;
    }
    public void displayDetails(){
        System.out.println("courseName "+courseName);
        System.out.println("authorName "+authorName);
        System.out.println("number of reviews "+numberofReviews);
        System.out.println("no of students "+numberofStudents);
    }

}
