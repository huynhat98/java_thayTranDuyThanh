package huy.com.model;

public abstract class StaffMember {
	// ing nghieng la abstract class, abstract method ,dau # trong mo hinh la protected, dau + la public, dau - la private
	protected String name;
	protected String address;
	protected String phone;
	
	public StaffMember(String name, String address, String phone) {
		super();
		this.name = name;
		this.address = address;
		this.phone = phone;
	}

	public StaffMember() {
		super();
	}

	public abstract double pay();

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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name + " - " + this.address + " - " + this.phone;
	}
	
}
