package com.cg.HotelManage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.cg.HotelManage.dao.HotelManageDaoImpl;
import com.cg.HotelManage.dto.CustomerDetails;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;;


class HotelManageDaoImplTest {

		static HotelManageDaoImpl hotelManageDao;
		
		@BeforeAll
		public static void init() {
			 hotelManageDao = new HotelManageDaoImpl();
		}
		@Test
		void testBookCustomer() {
			CustomerDetails customerDetails = new CustomerDetails();
			customerDetails.setCustomerName("Jaya");
			customerDetails.setCustomerEmail("ajaya@");
			customerDetails.setAddress("vkb");
			customerDetails.setMobileNo(1230456789);
			customerDetails.setRoomNo(101);
			customerDetails.setRoomType("AC_SINGLE");
			assertEquals(1001,  hotelManageDao.insertCustomerDetails(customerDetails));
		}

		@Test
		void testGetCustomerDetails() {
			assertEquals(null,  hotelManageDao.getStatus(1002));
		}

	}
