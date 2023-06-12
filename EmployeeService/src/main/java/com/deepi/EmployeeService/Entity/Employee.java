package com.deepi.EmployeeService.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Builder
@Entity
@Table(name = "employeetab2")
@AllArgsConstructor
@NoArgsConstructor
//@IdClass(EmployeePKId.class)
public class Employee {
  @EmbeddedId
    private EmployeePKId employeePKId;
    public EmployeePKId getEmployeePKId() {
		return employeePKId;
	}
	public void setEmployeePKId(EmployeePKId employeePKId) {
		this.employeePKId = employeePKId;
	}
	@Column(name="employee_id")
    private int employeeId;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Column(name="name")
    private String name;
   
	@Column(name="address")
    private String address;
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", address=" + address + "]";
	}
	
   
}
