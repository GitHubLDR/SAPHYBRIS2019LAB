package co.technocraft;

//Bean or model or POJO(Plain old java project)
public class Employee {
    //Attributes
	int eid;
	String ename;
	Address address;
	
	public Employee()
	{
		
	}
	//Constructor Injection
	public Employee(Address address) {
		this.address = address;
		}

	

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Address getAddress() {
		return address;
	}
	//Setter Injection
	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", address=" + address + "]";
	}

	
	
}
