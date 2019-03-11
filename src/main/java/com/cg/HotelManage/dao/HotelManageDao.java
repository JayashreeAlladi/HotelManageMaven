package com.cg.HotelManage.dao;

import com.cg.HotelManage.dto.CustomerDetails;

public interface HotelManageDao {
	 int insertCustomerDetails(CustomerDetails customerDetails);
	 CustomerDetails getStatus(int customerid);
}
