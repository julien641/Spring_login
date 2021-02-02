package com.example.demo.keys.Person;

import java.io.Serializable;
import java.util.Date;

public class Person_Login_Keys implements Serializable{
	private Date EmplId;
	private int effdate;
	
	public Person_Login_Keys() {
	}
	public Person_Login_Keys(Date emplId, int effdate) {
		EmplId = emplId;
		this.effdate = effdate;
	}

	public Date getEmplId() {
		return EmplId;
	}
	public void setEmplId(Date emplId) {
		EmplId = emplId;
	}
	public int getEffdate() {
		return effdate;
	}
	public void setEffdate(int effdate) {
		this.effdate = effdate;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((EmplId == null) ? 0 : EmplId.hashCode());
		result = prime * result + effdate;
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
		Person_Login_Keys other = (Person_Login_Keys) obj;
		if (EmplId == null) {
			if (other.EmplId != null)
				return false;
		} else if (!EmplId.equals(other.EmplId))
			return false;
		if (effdate != other.effdate)
			return false;
		return true;
	}
	
	
	
}
