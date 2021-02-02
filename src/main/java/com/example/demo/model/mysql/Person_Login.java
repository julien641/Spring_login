package com.example.demo.model.mysql;


import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.example.demo.keys.Person.Person_Login_Keys;
@Entity(name = "Person_Login")
@Table(name = "Person_Login")
@IdClass(Person_Login_Keys.class)
public class Person_Login  implements Serializable{

//	private static final long serialVersionUID = 3070824149802651591L;
	

	@Id
	@Column(name = "EmplId")
	private int EmplId;
	@Id @GeneratedValue
	@Column(name = "effdate")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date effdate;
	@Column(name = "DOB")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date DOB;
	@Column(name = "username")
	private String username;
	@Column(name = "password")
	private String password;
	
	@ManyToOne
	@JoinColumn(name = "EmplId",insertable=false, updatable=false)
	private Person person;

	
	
	
	public Person_Login() {

	}

	public Person_Login(int emplId, Date effdate, Date dOB, String username, String password, Person person) {

		EmplId = emplId;
		this.effdate = effdate;
		DOB = dOB;
		this.username = username;
		this.password = password;
		this.person = person;
	}

	public int getEmplId() {
		return EmplId;
	}

	public void setEmplId(int emplId) {
		EmplId = emplId;
	}

	public Date getEffdate() {
		return effdate;
	}

	public void setEffdate(Date effdate) {
		this.effdate = effdate;
	}

	public Date getDOB() {
		return DOB;
	}

	public void setDOB(Date dOB) {
		DOB = dOB;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((DOB == null) ? 0 : DOB.hashCode());
		result = prime * result + EmplId;
		result = prime * result + ((effdate == null) ? 0 : effdate.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((person == null) ? 0 : person.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
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
		Person_Login other = (Person_Login) obj;
		if (DOB == null) {
			if (other.DOB != null)
				return false;
		} else if (!DOB.equals(other.DOB))
			return false;
		if (EmplId != other.EmplId)
			return false;
		if (effdate == null) {
			if (other.effdate != null)
				return false;
		} else if (!effdate.equals(other.effdate))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (person == null) {
			if (other.person != null)
				return false;
		} else if (!person.equals(other.person))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Person_Login [EmplId=" + EmplId + ", effdate=" + effdate + ", DOB=" + DOB + ", username=" + username
				+ ", password=" + password + ", person=" + person + "]";
	}

	
	
	
}
