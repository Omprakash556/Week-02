import java.util.ArrayList;
import java.util.List;


class Patient {
    private String name;

    public Patient(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Doctor {
    private String name;
    private List<Patient> patients;

    public Doctor(String name) {
        this.name = name;
        this.patients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void consult(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
        }
        System.out.println(name + " is consulting with " + patient.getName());
    }

    public List<Patient> getPatients() {
        return patients;
    }
}

class Hospital {
    private String name;
    private List<Doctor> doctors;

    public Hospital(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public String getName() {
        return name;
    }
}

public class HospitalManagement {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("City Hospital");

        Doctor doctor1 = new Doctor("Doctor1");
        Doctor doctor2 = new Doctor("Doctor2");


        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);


        Patient patient1 = new Patient("Prahlad");
        Patient patient2 = new Patient("Kuldeep");
        Patient patient3 = new Patient("Manish");


        doctor1.consult(patient1);
        doctor1.consult(patient2);
        doctor2.consult(patient2);
        doctor2.consult(patient3);

        // Display hospital, doctors, and their patients
        System.out.println("\nHospital: " + hospital.getName());
        for (Doctor doctor : hospital.getDoctors()) {
            System.out.println(doctor.getName() + " has consulted:");
            for (Patient patient : doctor.getPatients()) {
                System.out.println(patient.getName());
            }
        }
    }
}
