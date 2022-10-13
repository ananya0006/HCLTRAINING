package com.tutorial;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Sim {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String servicepro;
	private String type;
	
	@ManyToOne
	Mobile mob;
	
	public Mobile getMob() {
		return mob;
	}
	public void setMob(Mobile mob) {
		this.mob = mob;
	}
	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id = id;
	}
	public String getservicepro() {
		return servicepro;
	}
	public void setservicepro(String servicepro) {
		this.servicepro = servicepro;
	}
	public String gettype() {
		return type;
	}
	public void settype(String type) {
		this.type = type;
	}
}
