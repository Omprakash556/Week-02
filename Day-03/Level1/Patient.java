public class Patient {
    private static String hospitalName = "Paras Hospital";
    private static int totalPatient = 0;
    public static int getTotalPatients(int totalPatient){
        return totalPatient;
    }

    private final String patientID;
    private String name;
    private int age;
    private String ailment;

    Patient(String patientID, String name, int age, String ailment){
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatient++;
    }

    public void resultDisplay(){
        if (this instanceof Patient){
            System.out.println("Patient ID: "+patientID);
            System.out.println("Patient Name: "+name);
            System.out.println("Patient Age: "+age);
            System.out.println("Patient Ailment: "+ailment);
        }
    }
    public static void main(String[] args) {

        Patient patient = new Patient("01", "Furquan", 24, "Dengu");
        patient.resultDisplay();
        System.out.println();

        Patient patient1 = new Patient("02", "Deepansh", 23, "HIV");
        patient1.resultDisplay();
        System.out.println();


        System.out.println("Total Patient "+Patient.getTotalPatients(totalPatient));



    }
}
