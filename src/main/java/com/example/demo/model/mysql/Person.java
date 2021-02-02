package com.example.demo.model.mysql;


import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;
@Entity(name = "Person")
@Table(name = "Person")
public class Person implements Serializable {

	@Id @GeneratedValue
	@Column(name = "EmplId")
	private int EmplId;
	
	@Column(name = "Creation_Date")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date Creation_Date;
	
	
	@GeneratedValue
	@Column(name = "Deleted_Date")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date Deleted_Date;
	
	
	
	/**
	 * 
	 */

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Creation_Date == null) ? 0 : Creation_Date.hashCode());
		result = prime * result + ((Deleted_Date == null) ? 0 : Deleted_Date.hashCode());
		result = prime * result + EmplId;
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
		Person other = (Person) obj;
		if (Creation_Date == null) {
			if (other.Creation_Date != null)
				return false;
		} else if (!Creation_Date.equals(other.Creation_Date))
			return false;
		if (Deleted_Date == null) {
			if (other.Deleted_Date != null)
				return false;
		} else if (!Deleted_Date.equals(other.Deleted_Date))
			return false;
		if (EmplId != other.EmplId)
			return false;
		return true;
	}
	
	/*
	 * person table    <p>Message: <input type="text" th:field="*{content}" /></p>
	 */
	
	public Person() {
	}
	

	
	public Person(int emplid, Date creation_date, Date deleted_date) {
		this.EmplId = emplid;
		this.Creation_Date = creation_date;
		this.Deleted_Date = deleted_date;
	}
	public int getEmplId() {
		return this.EmplId;
	}
	public void setEmplId(int emplid) {
		this.EmplId = emplid;
	}
	public Date getDeleted_date() {
		return this.Deleted_Date;
	}
	public void setDeleted_date(Date deleted_date) {
		this.Deleted_Date = deleted_date;
	}
	
	
	public Date getCreation_Date() {
		return this.Creation_Date;
	}
	public void setCreation_date(Date creation_date) {
		this.Creation_Date = creation_date;
	}

	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		
		return this.Creation_Date.toString();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
	
}/*


class person_email{
	private int emplid;
	private
	
	
}
class person_address{
	private String 
	private String City;
	private String zip;
	private String country;
	
}
*/