public class Registration extends UndergraduateCourse {
    private Course course;
    private int numStudents;
    private int maxStudents;
    private boolean isClosed;
    public void setCourse(Course course){
        this.course = course;
    }

    public void set_Course(Course course,UndergraduateCourse ugrad){
        this.setDepartmentName(ugrad.getDepartmentName());
        this.setLevel(ugrad.getLevel());
        this.course = course;
        this.setCourseCode(course.getCourseCode());
        this.setCourseCredits(course.getCourseCredits());
        this.setCourseName(course.getCourseName());
    }

    public void setNumStudents(int numStudents){
        this.numStudents = numStudents;
    }
    public void setMaxStudents(int maxStudents){
        this.maxStudents = maxStudents;
    }
    public void setIsClosed(boolean isClosed){
        this.isClosed = isClosed;
    }
    public void registerStudent(){
        if (this.numStudents<this.maxStudents) {
            this.numStudents++;
        }else{
            System.out.println("Cannot register more students to this course: "+this.course.getCourseName());
            this.isClosed = true;
        }
    }

    public void printRegistrationDetails(){
        // this.course.printCourseDetails();
        this.printUgradDetails();
        System.out.println("Registration Details: \nNumber of Students in the course: "+this.numStudents+"\nMaximum Students allowed: "+this.maxStudents+"\nRegistrations closed? "+this.isClosed+"\n");
    }

}
