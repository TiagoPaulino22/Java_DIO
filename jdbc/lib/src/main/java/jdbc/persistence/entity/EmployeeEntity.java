package jdbc.persistence.entity;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

import lombok.Data;

@Data
public class EmployeeEntity {

	private long id; 
	private String name; 
	private BigDecimal salary;  
	private OffsetDateTime birthday;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getSalary() {
		return salary;
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	public OffsetDateTime getBirthday() {
		return birthday;
	}
	public void setBirthday(OffsetDateTime birthday) {
		this.birthday = birthday;
	}
	
	
	
	@Override
	public String toString() {
		return "EmployeeEntity [id=" + id + ", name=" + name + ", salary=" + salary + ", birthday=" + birthday + "]";
	} 
	
	
	
	
}
