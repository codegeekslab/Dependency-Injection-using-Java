package com.codegeekslab.test;

import com.codegeekslab.app.CallingApp;
import com.codegeekslab.type.BasicPhone;

public class Test {

	public static void main(String[] args) {

		CallingApp app = new CallingApp(new BasicPhone());
		//app.setPhone(new BasicPhone());
		app.dialNumber(1419494494);

	}
}
