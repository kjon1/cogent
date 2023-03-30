package com.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IoStream {
	public static void main(String[] args) {
		FileInputStream f = null;
		try{
			f= new FileInputStream(new File("c://streams//employee.txt"));
			System.out.println("File opened successfully.");
			int i;
			while((i= f.read()) != -1)
			{
				System.out.print((char)i);
			}
		}catch(FileNotFoundException fnf)
		{
			System.out.println(fnf);
		} catch (IOException e) 
		{
			System.out.println(e);
			// TODO Auto-generated catch block
			//e.printStackTrace();//
		}finally {
			try{
				f.close();
			}catch(IOException io){
				System.out.println(io);
			}
		}
	}

}
