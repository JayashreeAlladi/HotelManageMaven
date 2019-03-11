package com.cg.HotelManage.ExceptionHandling;

public class CustomerNotExistException extends Exception {
   public void CustomerNotExistException() {
	   System.out.println("no customer is existing with this id");
   }
}
