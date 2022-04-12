package com.training.services;

import java.util.Map;
import java.util.Set;

import com.training.model.*;

public class Appointment {
	private Map<Doctor,Set<Patient>> map;

	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Map<Doctor, Set<Patient>> getMap() {
		return map;
	}

	public void setMap(Map<Doctor, Set<Patient>> map) {
		this.map = map;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((map == null) ? 0 : map.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appointment other = (Appointment) obj;
		if (map == null) {
			if (other.map != null)
				return false;
		} else if (!map.equals(other.map))
			return false;
		return true;
	}

	public Appointment(Map<Doctor, Set<Patient>> map) {
		super();
		this.map = map;
	}	
	
	public Set<Patient> getPatients(Doctor key){
		return this.map.get(key);
	}
	
}
