package com.cg.HotelManage.ui;

import java.util.Scanner;

import com.cg.HotelManage.dto.CustomerDetails;
import com.cg.HotelManage.service.HotelManageService;
import com.cg.HotelManage.service.HotelManageServiceImpl;

public class HotelCustomer {
      public static void main(String[] args) {
    	  HotelManageService hotelManageService=new HotelManageServiceImpl();
    	  CustomerDetails customerDetails=new CustomerDetails();
    	  
    	  while(true) {
    	  System.out.println("===Hotel Room Booking===");
    	  System.out.println("1.Book Room\n 2.View Booking Status\n 3.Exit");
    	  Scanner scanner=new Scanner(System.in);
    	  int choice=scanner.nextInt();
    	  
    	  switch(choice) {
    	  case 1:   
    		     System.out.println("Enter Customer Name:");
    		     String customerName=scanner.next();
    		     customerDetails.setCustomerName(customerName);
    		     
    		     System.out.println("Enter Email   :");
    		     String customerEmail=scanner.next();
    		     customerDetails.setCustomerEmail(customerEmail);
    		     
    		     System.out.println("Enter Customer Address:");
    		     String customerAddress=scanner.next();
    		     customerDetails.setAddress(customerAddress);
    		     
    		     System.out.println("Enter Mobile No:");
    		     long mobileNo=scanner.nextLong();
    		     customerDetails.setMobileNo(mobileNo);
    		     
    		     System.out.println("Room No:");
    		     int roomNo=scanner.nextInt();
    		     customerDetails.setRoomNo(roomNo);
    		     
    		     System.out.println("Room Type");
    		     String roomType=scanner.next();
    		     customerDetails.setRoomType(roomType);
    		     
    		     int newCustomerId = hotelManageService.insertCustomerDetails(customerDetails);
 				if (newCustomerId != 0)
 					System.out.println("Your room has been successfully booked. Your CustomerId is: " + newCustomerId);
 				break;
    		    
    	  case 2:
    		  System.out.println("enter customer id:");
    			int customerid=scanner.nextInt();
    		    customerDetails=hotelManageService.getStatus(customerid);
    		    if(customerDetails!=null) {
    		    	System.out.println("Name of the customer:"+customerDetails.getCustomerName());
    		    	System.out.println("Booking Status:Booked");
    		    	System.out.println("Room No:"+customerDetails.getRoomNo());
    		    	System.out.println("Room Type:"+customerDetails.getRoomType());
    		    }
    	  case 3:
    		     System.exit(0);
    	  }
    	}
    }
}
