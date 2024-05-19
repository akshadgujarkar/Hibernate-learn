package akshad.e_commerce;
import java.util.*;
import javax.persistence.*;


@Entity
@Table(name="student_addrss")
public class Address {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="address_id")
   private int addressid;
	@Column(length=50,name="STREET")
   private String street;
	@Column(length=50,name="CITY")
   private String city;
   private boolean isOpen;
   @Transient
   private double x;
   @Column(name="added_date")
   @Temporal(TemporalType.DATE)
   private Date addedDate;
   @Lob //large object
   private byte[] image;
   
   
   //embeddable object 
   private Certificate cert;
   
public Certificate getCert() {
	return cert;
}
public void setCert(Certificate cert) {
	this.cert = cert;
}
public Address(int addressid, String street, String city, boolean isOpen, double x, Date addedDate, byte[] image) {
	super();
	this.addressid = addressid;
	this.street = street;
	this.city = city;
	this.isOpen = isOpen;
	this.x = x;
	this.addedDate = addedDate;
	this.image = image;
}
public Address() {
	super();
	// TODO Auto-generated constructor stub
}
public int getAddressid() {
	return addressid;
}
public void setAddressid(int addressid) {
	this.addressid = addressid;
}
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public boolean isOpen() {
	return isOpen;
}
public void setOpen(boolean isOpen) {
	this.isOpen = isOpen;
}
public double getX() {
	return x;
}
public void setX(double x) {
	this.x = x;
}
public Date getAddedDate() {
	return addedDate;
}
public void setAddedDate(Date addedDate) {
	this.addedDate = addedDate;
}
public byte[] getImage() {
	return image;
}
public void setImage(byte[] image) {
	this.image = image;
}
   
}
