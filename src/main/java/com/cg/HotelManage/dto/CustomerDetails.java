package com.cg.HotelManage.dto;

public class CustomerDetails {
    private String CustomerName;
    private String CustomerEmail;
    private String Address;
    private long MobileNo;
    private int RoomNo;
    private String RoomType;
    /*
      public Account(String accountType, String customerName, double accountBalance) {
		// TODO Auto-generated constructor stub
		this.accountType = accountType;
		this.customerName = customerName;
		this.accountBalance = accountBalance;
	}
     */
    public CustomerDetails(String CustomerName, String CustomerEmail, String Address, long MobileNo,int RoomNo, String RoomType)
    {
    	this.CustomerName=CustomerName;
    	this.CustomerEmail=CustomerEmail;
    	this.Address=Address;
    	this.MobileNo=MobileNo;
    	this.RoomNo=RoomNo;
    	this.RoomType=RoomType;
    }
	
	public CustomerDetails() {
		// TODO Auto-generated constructor stub
	}

	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public String getCustomerEmail() {
		return CustomerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		CustomerEmail = customerEmail;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public long getMobileNo() {
		return MobileNo;
	}
	public void setMobileNo(long mobileNo) {
		MobileNo = mobileNo;
	}
	public int getRoomNo() {
		return RoomNo;
	}
	public void setRoomNo(int roomNo) {
		RoomNo = roomNo;
	}
	public String getRoomType() {
		return RoomType;
	}
	public void setRoomType(String roomType) {
		RoomType = roomType;
	}
}
