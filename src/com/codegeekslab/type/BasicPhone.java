package com.codegeekslab.type;

import com.geekslab.device.CellPhone;

public class BasicPhone implements CellPhone {

	@Override
	public void makeCall(int number) {
		System.out.println("calling via simcard... " + number);
	}

}
