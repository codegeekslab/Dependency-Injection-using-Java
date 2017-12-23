package com.codegeekslab.app;

import com.geekslab.device.CellPhone;

public class CallingApp {

	private CellPhone phone;

	public CallingApp(CellPhone phone) {
		this.phone = phone;
	}

	public void dialNumber(int number) {
		phone.makeCall(number);
	}

	/*
	 * public CellPhone getPhone() { return phone; }
	 * 
	 * public void setPhone(CellPhone phone) { this.phone = phone; }
	 */

}
