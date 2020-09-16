package com.ms.calc;

import java.beans.XMLDecoder;
import java.io.InputStream;

public class StaticCodeExample {

	// Unused field
	public int abc;

	private String ip = "127.0.0.1";

	@Override
	public void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	public void test() {
		InputStream in = null;
		XMLDecoder xmlDecoder = new XMLDecoder(in);

		String[] field = { "a", "b", "c", "s", "e" };

		// concatenates strings using + in a loop
		String s = "";
		for (int i = 0; i < field.length; ++i) {
			s = s + field[i];
		}

		System.out.println(ip);

	}
}
