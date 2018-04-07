package com.userfront.domain;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "userId", nullable = false, updatable = false)
    private Long userId;        
    private String firstName;	//isim
    private String lastName;	//soyisim
    private String TC;			//TC
    private String address;		//adres
    private String email;		//email
    private String phone;		//telefon		
    private Date date;			//doğum tarihi
    private String note;		//eklemek istedikleriniz
    private String location;	//yer seçimi
    private String reason;		//sebep
    private int amount;			//miktar
    
    private String question;    //PERAKENDE TİCARETİ İLE UĞRAŞTINIZ MI? evet/hayır
	
    //GETTER-SETTER METOTLARI  VE tostring METOTLARI 
    public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getTC() {
		return TC;
	}
	public void setTC(String tC) {
		TC = tC;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", TC=" + TC
				+ ", address=" + address + ", email=" + email + ", phone=" + phone + ", date=" + date + ", note=" + note
				+ ", location=" + location + ", reason=" + reason + ", amount=" + amount + ", question=" + question
				+ "]";
	}
	
	

  
	



   

   


}
