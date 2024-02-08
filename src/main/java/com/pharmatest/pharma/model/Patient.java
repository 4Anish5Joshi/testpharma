package com.pharmatest.pharma.model;

import java.util.Base64;
import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Transient;

@Entity
@Table(name="patient")
public class Patient {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id; 

	@Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    private Date datetime;

	private String fname;
	private String phone;

	@Lob
	private byte[] img;

	@Transient
    private String imgBase64;

	
	private String selectedLabTest;
	private String selectedDoctor;

	public String getImgBase64() {
		String imgBase64 = Base64.getEncoder().encodeToString(img);
		return imgBase64;
	}



	public void setImgBase64(String imgBase64) {
		this.imgBase64 = imgBase64;
	}

	
	public Patient() {
		
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Date getDatetime() {
		return datetime;
	}


	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}


	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public byte[] getImg() {
		return img;
	}


	public void setImg(byte[] img) {
		this.img = img;
	}


	public String getSelectedLabTest() {
		return selectedLabTest;
	}


	public void setSelectedLabTest(String selectedLabTest) {
		this.selectedLabTest = selectedLabTest;
	}


	public String getSelectedDoctor() {
		return selectedDoctor;
	}


	public void setSelectedDoctor(String selectedDoctor) {
		this.selectedDoctor = selectedDoctor;
	}

   

	




}
