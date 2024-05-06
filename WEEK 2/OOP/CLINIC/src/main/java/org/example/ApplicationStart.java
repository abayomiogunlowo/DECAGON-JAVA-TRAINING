package org.example;

import org.example.enums.Department;
import org.example.enums.Gender;

public class ApplicationStart {


    public static void main(String[] args) {
        Doctor doctor = new Doctor();
        doctor.setAge(18);
        doctor.setName("Harold");
        doctor.setPersonGender(Gender.MALE);
        doctor.setOccupation("Doctor");
        doctor.setDepartment(Department.MATERNITY);
        doctor.setGradeLevel(5);
        doctor.setOnDuty(true);

        Doctor doctor2 = new Doctor();
        doctor2.setAge(28);
        doctor2.setName("Olalolo");
        doctor2.setPersonGender(Gender.FEMALE);
        doctor2.setOccupation("Doctor");
        doctor2.setDepartment(Department.MATERNITY);
        doctor2.setGradeLevel(11);
        doctor2.setOnDuty(false);

        MaternityWard orchidMaternityWard = new MaternityWard();
        orchidMaternityWard.setNoOfPatients(19);
        orchidMaternityWard.setNoOfMedicalPersonnel(20);
        orchidMaternityWard.setDoctorInCharge(doctor2);
        MaternityWard epeMaternityWard = new MaternityWard(5, 8, doctor);
        System.out.println(epeMaternityWard);
    }
}