package model;
import java.util.ArrayList;
public class pastCourses {
    private String courseID;
    private String grade;
    private String semester;
    private long year;

    

    public pastCourses(String courseID, String grade, String semester,long year) {
        this.courseID = courseID;
        this.grade = grade;
        this.semester = semester;
        this.year = year;
        
    }

    public String getPastCourseID(){
    return this.courseID;
    }

    public String getPastCourseGrade(){
    return this.grade;
   }

   public String getPastCourseSemester(){
    return this.semester;
   }

   public long getPastCourseYear(){
    return this.year;
   }
   public Course getPastCourse(String courseID){
       return CourseList.getInstance().getCourse(courseID);
}

}