package com.spring;

//Java program to illustrate JavaBeans

class Bean {
	// private field property
	private Integer property = 0;

	Bean() {
		// No-arg constructor
	}

	// setter method for property
	public void setProperty(Integer property) {
		if (property == 0) {
			// if property is 0 return
			return;
		}
		this.property = property;
	}

	// getter method for property
	public Integer getProperty() {
		if (property == 0) {
			// if property is 0 return null
			return null;
		}
		return property;
	}

	public static void main(String[] args) {
		Bean bean = new Bean();

		bean.setProperty(0);
		System.out.println("After setting to 0: " + bean.getProperty());

		bean.setProperty(5);
		System.out.println("After setting to valid" + " value: " + bean.getProperty());
	}
}
