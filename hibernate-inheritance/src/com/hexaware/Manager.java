package com.hexaware;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

//@DiscriminatorValue(value = "manager")
@Entity
public class Manager extends Employee {

		private int employeecount;

		public int getEmployeecount() {
			return employeecount;
		}

		public void setEmployeecount(int employeecount) {
			this.employeecount = employeecount;
		}

		@Override
		public String toString() {
			return "Manager [employeecount=" + employeecount + ", toString()=" + super.toString() + "]";
		}
}
