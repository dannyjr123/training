package com.training;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import com.training.model.Doctor;
import com.training.model.Patient;
import com.training.services.Appointment;

public class Application {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Patient ramesh= new Patient(101, "ramesh", "anna nagar", 6433242422l);
		Patient gokul= new Patient(102, "gokul", "t.nagar", 9153253253l);
		Patient magesh = new Patient(103, "magesh", "ECR", 7936262662l);
		Patient magesh1 = new Patient(103, "magesh", "ECR", 9562636262l);
		Patient dhanush	= new Patient(104, "dhanush", "ayanavaram", 9791015987l);
		
		Set<Patient> patients = new HashSet<Patient>();
		
		patients.add(ramesh);
		patients.add(magesh1);
		patients.add(magesh);		
		
		Set<Patient> patients2 = new HashSet<>();
		
		patients2.add(gokul);
		patients2.add(dhanush);
		
		Doctor jithin= new Doctor(900, "jithin", "Cardiologist", patients);
		Doctor sidharth= new Doctor(800, "sidharth", "Tumor Funtionalist", patients2);
		
		Set<Doctor> doctors = new HashSet<Doctor>();
		
		doctors.add(jithin);
		doctors.add(sidharth);
		
		Map<Doctor,Set<Patient>> map = new HashMap<Doctor,Set<Patient>>();
		
		map.put(jithin, patients);
		map.put(sidharth, patients2);
		
		Appointment appointment= new Appointment(map);
		
		System.out.println(appointment.getPatients(jithin));
		
//		for(Map.Entry<Doctor, Set<Patient>> map1:appointment.getMap().entrySet()){
//			if(map1.getKey().equals(sidharth)) {
//				System.out.println(map1.getValue());
//			}
//		}
	}
}
