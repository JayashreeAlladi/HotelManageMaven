package com.cg.HotelManage.service;

import com.cg.HotelManage.dto.CustomerDetails;

public interface HotelManageService {
	 int insertCustomerDetails(CustomerDetails customerDetails);
	 CustomerDetails getStatus(int customerid);
}
