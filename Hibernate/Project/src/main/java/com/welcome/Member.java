package com.welcome;

public class Member {
	
		private String FirstName,LastName,PhoneNo,Email,Language;

		public String getFirstName() {
			return FirstName;
		}

		public void setFirstName(String firstName) {
			FirstName = firstName;
		}

		public String getLastName() {
			return LastName;
		}

		public void setLastName(String lastName) {
			LastName = lastName;
		}

		public String getPhoneNo() {
			return PhoneNo;
		}

		public void setPhoneNo(String phoneNo) {
			PhoneNo = phoneNo;
		}

		public String getEmail() {
			return Email;
		}

		public void setEmail(String email) {
			Email = email;
		}

		public String getLanguage() {
			return Language;
		}

		public void setLanguage(String language) {
			Language = language;
		}

		public Member(String firstName, String lastName, String phoneNo, String email, String language) {
			super();
			FirstName = firstName;
			LastName = lastName;
			PhoneNo = phoneNo;
			Email = email;
			Language = language;
		}	
	}

