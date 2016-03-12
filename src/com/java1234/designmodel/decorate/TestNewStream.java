package com.java1234.designmodel.decorate;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import com.java1234.designmodel.decorate.impl.LowerCaseInputStream;

public class TestNewStream {

	public static void main(String[] args) throws IOException {
		int c ;
		InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("d://test.txt")));
		while ((c=in.read()) >= 0) {
			System.err.println((char)c);
		}
		in.close();
	}
}
