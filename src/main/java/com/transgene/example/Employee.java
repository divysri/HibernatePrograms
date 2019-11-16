package com.transgene.example;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name="emp_table")
public class Employee {
	
	@Id
	  @GeneratedValue(strategy=GenerationType.AUTO) 
	 @Column(name="empId")
	   private Integer empId;
	
	/*
	 * GenerationType.AUTO
	 * 
	 * @Id
	 * @GeneratedValue(strategy=GenerationType.AUTO) or @GeneratedValue
	 * @Column(name="empId")
	   private Integer empId;
	 
	 // customize the hibernate_sequence table
	 * @Id
	@GeneratedValue(strategy=GenerationType.AUTO,generator="emp_generator")
	@SequenceGenerator(name="emp_generator",initialValue=1,allocationSize=1,sequenceName="mysequnce")
	@Column(name="empId")
	private Integer empId;*/
	
	
	/* GenerationType.IDENTITY
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="empId")
	private Integer empId;*/
	
	/*GenerationType.SEQUENCE
	 * 
	 *@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="empId")
	private Integer empId;
	 
	  
	  // customize the hibernate_sequence table
	 @Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="emp_generator")
	@SequenceGenerator(name="emp_generator",initialValue=1,allocationSize=1,sequenceName="my_sequenceName")
	@Column(name="empId")
	private Integer empId;
	*/
	
	/*GenerationType.TABLE
	 * @Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="empId")
	private Integer empId;
	 * 
	 * // customize the hibernate_sequence table
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE,generator="emp_generator")
	@TableGenerator(name="emp_generator",initialValue=1,allocationSize=1,table="mytable_sequence")
	@Column(name="empId")
	private Integer empId;*/
	
	@Column(name="empName")
	private String empName;
	@Column(name="email")
	private String email;
	@Column(name="dob")
	private Date dob;
	@Column(name="salary")
	private Double salary;
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	

}
