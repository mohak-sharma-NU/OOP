public class MainClass {
        public static void main(String[] args){
        
        Course c1 = new Course();
        Course c2 = new Course();
        Course c3 = new Course();

        UndergraduateCourse u1 = new UndergraduateCourse();
        UndergraduateCourse u2 = new UndergraduateCourse();
        UndergraduateCourse u3 = new UndergraduateCourse();

        Registration r1 = new Registration();
        Registration r2 = new Registration();
        Registration r3 = new Registration();

        c1.setCourseCode("CS1004");
        c1.setCourseCredits(3);
        c1.setCourseName("Object Oriented Programming");

        c2.setCourseCode("EE1005");
        c2.setCourseCredits(3);
        c2.setCourseName("Digital Logic Design");

        c3.setCourseCode("MT1008");
        c3.setCourseCredits(3);
        c3.setCourseName("Multivariate Calculus");

        u1.setCourseCode("CS1004");
        u1.setCourseCredits(3);
        u1.setCourseName("Object Oriented Programming");
        u1.setDepartmentName("Computer Science");
        u1.setLevel(1);

        u2.setCourseCode("EE1005");
        u2.setCourseCredits(3);
        u2.setCourseName("Digital Logic Design");
        u2.setDepartmentName("Computer Science");
        u2.setLevel(1);

        u3.setCourseCode("MT1008");
        u3.setCourseCredits(3);
        u3.setCourseName("Multivariate Calculus");
        u3.setDepartmentName("Computer Science");
        u3.setLevel(1);

        // r1.setCourse(c1);
        // r2.setCourse(c2);
        // r3.setCourse(c3);

        r1.set_Course(c1,u1);
        r2.set_Course(c2,u2);
        r3.set_Course(c3,u3);

        r1.setMaxStudents(3);
        r2.setMaxStudents(3);
        r3.setMaxStudents(3);

        r1.registerStudent();
        r1.registerStudent();
        r1.registerStudent();
        r1.registerStudent();

        r2.registerStudent();
        r2.registerStudent();

        r3.registerStudent();


        r1.printRegistrationDetails();
        r2.printRegistrationDetails();
        r3.printRegistrationDetails();

    }
}
