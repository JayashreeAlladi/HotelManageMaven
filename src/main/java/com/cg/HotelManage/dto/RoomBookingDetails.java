package com.cg.HotelManage.dto;

public class RoomBookingDetails {
   private String RoomType;
   private String Status;
   /*
   public Account(String accountType, String customerName, double accountBalance) {
		// TODO Auto-generated constructor stub
		this.accountType = accountType;
		this.customerName = customerName;
		this.accountBalance = accountBalance;
	}
  */
   public RoomBookingDetails(String RoomType, String Status) {
	   this.RoomType=RoomType;
	   this.Status=Status;
   }
public String getRoomType() {
	return RoomType;
}
public void setRoomType(String roomType) {
	RoomType = roomType;
}
public String getStatus() {
	return Status;
}
public void setStatus(String status) {
	Status = status;
}
}
