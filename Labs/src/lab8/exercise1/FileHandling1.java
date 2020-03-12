package lab8.exercise1;

import java.io.FileReader;
import java.io.FileWriter;

public class FileHandling1 {
	public static void main(String[] args) throws Exception {

		FileReader fr = new FileReader("C:\\Users\\humpt\\Sidd\\sid.txt");
		StringBuffer sb = new StringBuffer();
		int i = fr.read();
		while (i != -1) {

			System.out.print((char) i);
			sb.append((char) i);
			i = fr.read();
		}
		StringBuffer rev = sb.reverse();
		System.out.println("\n"+rev);

		FileWriter bw = new FileWriter("C:\\Users\\humpt\\Sidd\\sid.txt",true);
		for(int j=0;j<rev.length();j++) {
			
			bw.write(rev.charAt(j));
		}
		System.out.println("Writing successful");
		bw.close();
	}
}