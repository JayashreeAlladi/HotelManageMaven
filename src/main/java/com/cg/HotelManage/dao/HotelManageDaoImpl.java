package com.cg.HotelManage.dao;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.cg.HotelManage.dto.CustomerDetails;
import com.cg.HotelManage.dto.RoomBookingDetails;

public class HotelManageDaoImpl implements HotelManageDao{
	//Scanner sc=new Scanner(System.in);
	CustomerDetails customerDetails=new CustomerDetails();
	RoomBookingDetails roomBookingDetails=new RoomBookingDetails(null, null);
	 Map<Integer,CustomerDetails> cusAccountEntry=new HashMap<Integer,CustomerDetails>();
	 Map<Integer,RoomBookingDetails>raccountEntry;
	 int custid=1000;
  public HotelManageDaoImpl(){
	  
		 raccountEntry=new HashMap<Integer,RoomBookingDetails>();
		 raccountEntry.put(101, new RoomBookingDetails("AC_SINGLE","Not Booked" ));
		 raccountEntry.put(102, new RoomBookingDetails("AC_SINGLE","Not Booked" ));
		 raccountEntry.put(103, new RoomBookingDetails("AC_DOUBLE","Not Booked" ));
		 raccountEntry.put(201, new RoomBookingDetails("NONAC_SINGLE","Not Booked" ));
		 raccountEntry.put(202, new RoomBookingDetails("NONAC_SINGLE","Not Booked" ));
		 raccountEntry.put(203, new RoomBookingDetails("NONAC_DOUBLE","Not Booked" ));
		
  }
	public int insertCustomerDetails(CustomerDetails customerDetails) {
		// TODO Auto-generated method stub
	    if(raccountEntry.containsKey(customerDetails.getRoomNo()))
        {
	    	roomBookingDetails=raccountEntry.get(customerDetails.getRoomNo());
	     if(roomBookingDetails.getStatus().equalsIgnoreCase("Not Booked"))
	     {
	         if(roomBookingDetails.getRoomType().equals(customerDetails.getRoomType()))
	         {
	    	  cusAccountEntry.put(custid, new CustomerDetails(customerDetails.getCustomerName(),customerDetails.getCustomerEmail(),customerDetails.getAddress(),customerDetails.getMobileNo(),customerDetails.getRoomNo(),customerDetails.getRoomType()));
	    	  custid++;
	    	  raccountEntry.replace(customerDetails.getRoomNo(), new RoomBookingDetails(customerDetails.getRoomType(), "Booked"));
	          }
	         else {
	    	  return 1;
	         }
	     }
	     else {
	    	 return 0;
	     }
       }else {
    	   return -1;
       }
		return custid-1;
		
	}

	public CustomerDetails getStatus(int customerid) {
		// TODO Auto-generated method stub
	// Map<Integer,CustomerDetails> cusAccountEntry=new HashMap<Integer,CustomerDetails>();
	//	int custtemp=cusAccountEntry.
		
			if(cusAccountEntry.containsKey(customerid)) {
				return cusAccountEntry.get(customerid);
			}
		
		
		return null;
	}

}
