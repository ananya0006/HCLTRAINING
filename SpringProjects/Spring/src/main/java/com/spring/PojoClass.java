package com.spring;

public class PojoClass {
	
		// default field
		String name;

		// public field
		public String id;

		// private salary
		private double salary;

		//arg-constructor to initialize fields
		public PojoClass(String name, String id,
								double salary)
		{
			this.name = name;
			this.id = id;
			this.salary = salary;
		}

		// getter method for name
		public String getName()
		{
			return name;
		}

		// getter method for id
		public String getId()
		{
			return id;
		}

		// getter method for salary
		public Double getSalary()
		{
			return salary;
		}
		public static void main(String[] args) {
			PojoClass p=new PojoClass("Ananya","4AL19IS006",75000);
			System.out.println(p.name);
			System.out.println(p.id);
			System.out.println(p.salary);
		}
	}


