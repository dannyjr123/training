package com.training;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.print.Doc;

import com.training.model.Doctor;
import com.training.model.Patient;
import com.training.services.Appointment;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Patient ramesh= new Patient(101, "ramesh", "anna nagar", 1233242422l);
		Patient gokul= new Patient(102, "gokul", "t.nagar", 53532532532l);
		Patient magesh = new Patient(103, "magesh", "ECR", 5362636262662l);
		Patient magesh1 = new Patient(103, "magesh", "ECR", 5362636262662l);
		Patient dhanush	= new Patient(104, "dhanush", "ayanavaram", 9791015987l);
		
		Set<Patient> patients = new HashSet<Patient>();
		
		patients.add(ramesh);
		patients.add(gokul);
		patients.add(magesh);
		
		
		Set<Patient> patients2 = new HashSet<>();
		
		patients2.add(magesh1);
		patients2.add(dhanush);
		
		Doctor doctor= new Doctor(900, "jithin", "Cardiologist", patients);
		Doctor doctor2= new Doctor(800, "sidharth", "Tumor Funtionalist", patients2);
		Set<Doctor> doctors = new HashSet<Doctor>();
		
		doctors.add(doctor);
		doctors.add(doctor2);
		
//		for(Doctor doc : doctors) {
//			System.out.println(doc.getPatients()+"\n");			
//		}		
		
		Map<Doctor,Set<Patient>> map = new HashMap<Doctor,Set<Patient>>();
		map.put(doctor2, patients2);
		map.put(doctor, patients);
		Appointment appointment= new Appointment(map);
		
		System.out.println(appointment.getPatients(doctor));		
	}
}
