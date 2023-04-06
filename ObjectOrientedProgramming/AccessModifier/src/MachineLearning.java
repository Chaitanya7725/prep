package ObjectOrientedProgramming.AccessModifier.src;

public class MachineLearning extends Course{

    public void displayDetails(){
        System.out.println("ml courseName "+courseName);
        System.out.println("ml authorName "+authorName);
        //System.out.println("number of reviews "+numberofReviews); not accessible
        System.out.println("ml no of students "+numberofStudents);
    }

}
