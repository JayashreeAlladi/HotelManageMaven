package com.cg.HotelManage.service;

import com.cg.HotelManage.ExceptionHandling.CustomerNotExistException;
import com.cg.HotelManage.ExceptionHandling.RoomNoException;
import com.cg.HotelManage.ExceptionHandling.RoomStatusException;
import com.cg.HotelManage.ExceptionHandling.RoomTypeException;
import com.cg.HotelManage.dao.HotelManageDao;
import com.cg.HotelManage.dao.HotelManageDaoImpl;
import com.cg.HotelManage.dto.CustomerDetails;

public class HotelManageServiceImpl implements HotelManageService{
     HotelManageDao hotelManageDao=new HotelManageDaoImpl();
     CustomerDetails customerDetails=new CustomerDetails();

	public CustomerDetails getStatus(int customerid) {
		customerDetails=hotelManageDao.getStatus(customerid);
		if(customerDetails!=null) {
		return customerDetails;
		}
		else {
			try {
				throw new CustomerNotExistException();
			} catch (CustomerNotExistException e) {
				return null;
			}
			
		}
		
	}

	public int insertCustomerDetails(CustomerDetails customerDetails) {
		// TODO Auto-generated method stub
		int i=hotelManageDao.insertCustomerDetails(customerDetails);
		if(i==1) {
			try {
				throw new RoomTypeException();
			} catch (RoomTypeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if(i==0) {
			try {
				throw new RoomStatusException();
			} catch (RoomStatusException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if(i==-1) {
			try {
				throw new RoomNoException();
			} catch (RoomNoException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return i;
		
	}

}
