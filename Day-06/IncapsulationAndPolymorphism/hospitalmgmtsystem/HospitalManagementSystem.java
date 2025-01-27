package IncapsulationAndPolymorphism.hospitalmgmtsystem;

// Abstract class Patient
abstract class Patient {
    String patientId;
    String name;
    int age;
    // Constructor
    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }
    // Abstract method to calculate the bill
    abstract double calculateBill();
    // Concrete method to get patient details
    public String getPatientDetails() {
        return "Patient ID: " + patientId + ", Name: " + name + ", Age: " + age;
    }
}

// Interface MedicalRecord
interface MedicalRecord {
    void addRecord(String record);
    String viewRecords();
}

// Class InPatient extends Patient and implements MedicalRecord
class InPatient extends Patient implements MedicalRecord {
    double roomCharge;
    double treatmentCost;
    String records;

    // Constructor
    public InPatient(String patientId, String name, int age, double roomCharge, double treatmentCost) {
        super(patientId, name, age);
        this.roomCharge = roomCharge;
        this.treatmentCost = treatmentCost;
        this.records = ""; // Initialize empty records
    }

    // Implement abstract method from Patient
    public double calculateBill() {
        return roomCharge + treatmentCost;
    }

    // Implement methods from MedicalRecord interface
    public void addRecord(String record) {
        this.records += record + "\n";
    }

    public String viewRecords() {
        return this.records;
    }
}

// Class OutPatient extends Patient and implements MedicalRecord
class OutPatient extends Patient implements MedicalRecord {
    double consultationFee;
    String records;

    // Constructor
    public OutPatient(String patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
        this.records = ""; // Initialize empty records
    }

    // Implement abstract method from Patient
    public double calculateBill() {
        return consultationFee; // Outpatients only pay consultation fee
    }

    // Implement methods from MedicalRecord interface
    public void addRecord(String record) {
        this.records += record + "\n";
    }

    public String viewRecords() {
        return this.records;
    }
}

// Class Hospital to manage the patients and handle polymorphism
class Hospital {
    Patient[] patients;
    int count;

    // Constructor
    public Hospital(int size) {
        patients = new Patient[size];
        count = 0;
    }

    // Add patient to the hospital
    public void addPatient(Patient patient) {
        if(count < patients.length) {
            patients[count] = patient;
            count++;
        }
    }

    // Process patients and display their billing details
    public void processPatients() {
        for(int i = 0; i < count; i++) {
            Patient patient = patients[i];
            System.out.println(patient.getPatientDetails());
            System.out.println("Total Bill: " + patient.calculateBill());
            if(patient instanceof MedicalRecord) {
                MedicalRecord record = (MedicalRecord) patient;
                System.out.println("Patient Records: \n" + record.viewRecords());
            }
            System.out.println();
        }
    }
}
public class HospitalManagementSystem {
    public static void main(String[] args) {
        // Create InPatient and OutPatient objects
        InPatient inPatient = new InPatient("P001", "Furqan", 21, 1500.0, 3000.0);
        OutPatient outPatient = new OutPatient("P002", "Anubhav", 21, 200.0);

        // Add medical records
        inPatient.addRecord("Diagnosis: Heart Disease, Treatment: Surgery");
        outPatient.addRecord("Diagnosis: Cold, Treatment: Consultation");

        // Create a hospital and add patients
        Hospital hospital = new Hospital(5);
        hospital.addPatient(inPatient);
        hospital.addPatient(outPatient);

        // Process and display patients' details and bills
        hospital.processPatients();
    }
}
