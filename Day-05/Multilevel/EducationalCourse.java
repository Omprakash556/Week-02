
class Course {
    String courseName;
    int duration;
    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }


    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " hours");
    }
}


class OnlineCourse extends Course {

    String platform;
    boolean isRecorded;
    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    // Override displayCourseDetails to include online course details
    @Override
    public void displayCourseDetails() {
        super.displayCourseDetails();  // Call the superclass method
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}


class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount;
    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);

        this.fee = fee;
        this.discount = discount;
    }

    @Override
    public void displayCourseDetails() {
        super.displayCourseDetails();
        System.out.println("Fee: $" + fee);
        System.out.println("Discount: " + discount + "%");
        double finalFee = fee-(fee*discount/100);
        System.out.println("Final Fee after Discount: $" + finalFee);
    }
}


public class EducationalCourse {
    public static void main(String[] args) {

        PaidOnlineCourse paidCourse = new PaidOnlineCourse("Java Programming", 30, "Udemy", true, 99.99, 20);

        paidCourse.displayCourseDetails();
    }
}
