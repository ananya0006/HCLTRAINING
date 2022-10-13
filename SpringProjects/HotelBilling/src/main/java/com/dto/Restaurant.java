package com.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Restaurant {

		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int id;
		private String FoodName;
		private double FoodPrice;
		private int FoodQuantity;
		private double FinalPrice;
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getFoodName() {
			return FoodName;
		}
		public void setFoodName(String foodName) {
			FoodName = foodName;
		}
		public double getFoodPrice() {
			return FoodPrice;
		}
		public void setFoodPrice(double foodPrice) {
			FoodPrice = foodPrice;
		}
		public int getFoodQuantity() {
			return FoodQuantity;
		}
		public void setFoodQuantity(int foodQuantity) {
			FoodQuantity = foodQuantity;
		}
		public double getFinalPrice() {
			return FinalPrice;
		}
		public void setFinalPrice(double finalPrice) {
			FinalPrice = finalPrice;
		}
		
	
		
		
		
}
		
	
		
		
		
		

