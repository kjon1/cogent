package com.stream;

import java.io.FileReader;
import java.io.FileWriter;

public class ReaderWriterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fr = null;
		FileWriter fw = null;
		
		try{
			fr = new FileReader("c://streams//employee.txt");
			fw = new FileWriter("c://streams//employee-clone.txt");
			int i2;
			while((i2=fr.read())!= -1){
				fw.write(i2);
			}
			fr.close();
			fw.close();
		}catch (Exception e){
			e.printStackTrace();
		}

	}

}
