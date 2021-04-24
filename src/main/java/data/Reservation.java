package data;


import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.ManyToAny;
@Entity
public class Reservation implements Serializable{
@Id @GeneratedValue
	private Long id;
	private Long iduser;
	private Long idbillet;
	private Long idevenement;
	private int isconfirmed;
	//@ManyToOne (cascade=CascadeType.PERSIST)
	//@JoinColumn(name="ID_CAT")
	public Reservation() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getIduser() {
		return iduser;
	}
	public void setIduser(Long iduser) {
		this.iduser = iduser;
	}
	public Long getIdbillet() {
		return idbillet;
	}
	public void setIdbillet(Long idbillet) {
		this.idbillet = idbillet;
	}
	public Long getIdevenement() {
		return idevenement;
	}
	public void setIdevenement(Long idevenement) {
		this.idevenement = idevenement;
	}
	public int getIsconfirmed() {
		return isconfirmed;
	}
	public void setIsconfirmed(int isconfirmed) {
		this.isconfirmed = isconfirmed;
	}
	
	
}
