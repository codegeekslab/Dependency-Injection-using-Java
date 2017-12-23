package com.codegeekslab.type;

import com.geekslab.device.CellPhone;

public class SmartPhone implements CellPhone {

	@Override
	public void makeCall(int number) {
		System.out.println("calling via whatsapp..." + number);
	}

}
