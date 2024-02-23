package DataProvider.Resouces;

public class DataProviderExcel {
	
	private String firstname;
	private String lastname;
	private String schoolname;
	private String collegename;
	private String addressname;
	
	
	public DataProviderExcel(String firstname, String lastname, String schoolname, String collegename,String addressname) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.schoolname = schoolname;
		this.collegename = collegename;
		this.addressname = addressname;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public String getSchoolname() {
		return schoolname;
	}


	public void setSchoolname(String schoolname) {
		this.schoolname = schoolname;
	}


	public String getCollegename() {
		return collegename;
	}


	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}


	public String getAddressname() {
		return addressname;
	}


	public void setAddressname(String addressname) {
		this.addressname = addressname;
	}
	
}
