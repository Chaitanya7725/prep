package ObjectOrientedProgramming.AccessModifier.model;

import ObjectOrientedProgramming.AccessModifier.src.Course;

public class Hadoop extends Course {

    public Hadoop() {
        super();
    }

    @Override
    public void displayDetails() {
        System.out.println("courseName "+courseName);
        System.out.println("authorName "+authorName);
//        System.out.println("number of reviews "+numberofReviews); // private
//        System.out.println("no of students "+numberofStudents); //no modifer
    }
}
