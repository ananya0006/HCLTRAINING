package com.tutorial;
	//one to many
	import java.util.List;

	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.OneToMany;

	@Entity
	public class Mobile {
		
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int id;
		private String name;
		private String brand;
		
		@OneToMany
		List<Sim> sim;
		
		
		public List<Sim> getSim() {
			return sim;
		}
		public void setSim(List<Sim> sim) {
			this.sim = sim;
		}
		public int getid() {
			return id;
		}
		public void setid(int id) {
			this.id = id;
		}
		public String getname() {
			return name;
		}
		public void setname(String name) {
			this.name = name;
		}
		public String getbrand() {
			return brand;
		}
		public void setbrand(String brand) {
			this.brand = brand;
		}
		
		

	}


