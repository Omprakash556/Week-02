public class Students {
    private static String universityName;
    static int totalStudent = 0;
    public static int printTotalStudents(int totalStudent){
        return totalStudent;
    }

    private String name;
    private final int rollNumber;
    private char grade;

    Students(String name, int rollNumber, char grade){
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudent++;
    }

    public void resultsDisplay(){
        if(this instanceof Students){
            System.out.println("Students Name: "+name);
            System.out.println("Students Roll Number: "+rollNumber);
            System.out.println("Student Grade: "+grade);
        }
    }
    public static void main(String[] args) {
        Students students = new Students("Om Prakash", 97, 'A');
        Students students1 = new Students("Anubhav Singh", 26, 'B');

        students.resultsDisplay();
        System.out.println();
        students1.resultsDisplay();

        System.out.println("Total Students "+printTotalStudents(totalStudent));


    }
}
