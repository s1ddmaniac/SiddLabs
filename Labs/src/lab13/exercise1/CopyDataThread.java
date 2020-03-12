package lab13.exercise1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDataThread implements Runnable {

	FileInputStream fis;
	FileOutputStream fos;

	public CopyDataThread(FileInputStream fis, FileOutputStream fos) {
		super();
		this.fis = fis;
		this.fos = fos;
	}

	@Override
	public void run() {

		try {
			int ch;
			while ((ch = fis.read()) != -1) {
				System.out.print((char) ch);
			}
		} catch (IOException e) {
			System.out.println("Unable to read.");
		}
	}
}
