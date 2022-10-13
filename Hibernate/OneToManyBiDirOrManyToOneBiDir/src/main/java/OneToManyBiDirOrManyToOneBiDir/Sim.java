package OneToManyBiDirOrManyToOneBiDir;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Sim {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String sP;
	private String type;
	@ManyToOne
	@JoinColumn
	Mobile m;
	
	public Mobile getM() {
		return m;
	}
	public void setM(Mobile m) {
		this.m = m;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getsP() {
		return sP;
	}
	public void setsP(String sP) {
		this.sP = sP;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	

}
