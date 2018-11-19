package objects;

public class Restaurant {
	
	private String name;
	private String address;
	private String inspectionGrade;
	private String inspectionDate;
	private int aldermanicDistrict;
	private int restaurantNumber;
	
	public Restaurant() {
		
	}
	public Restaurant(String n) {
		name = n;
	}
	public Restaurant(String n, String a) {
		name = n;
		address = a;
	}
	
	public Restaurant(String name, String address, String inspectionGrade, String inspectionDate,
			int aldermanicDistrict, int restaurantNumber) {
		this.name = name;
		this.address = address;
		this.inspectionGrade = inspectionGrade;
		this.inspectionDate = inspectionDate;
		this.aldermanicDistrict = aldermanicDistrict;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public String getInspectionGrade() {
		return inspectionGrade;
	}
	public String getInspectionDate() {
		return inspectionDate;
	}
	public int getAldermanicDistrict() {
		return aldermanicDistrict;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setInspectionGrade(String inspectionGrade) {
		this.inspectionGrade = inspectionGrade;
	}
	public void setInspectionDate(String inspectionDate) {
		this.inspectionDate = inspectionDate;
	}
	public void setAldermanicDistrict(int aldermanicDistrict) {
		this.aldermanicDistrict = aldermanicDistrict;
	}
	

}
