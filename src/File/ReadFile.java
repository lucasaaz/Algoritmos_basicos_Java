package File;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) throws FileNotFoundException {

//		File file = new File("C:\\Users\\Riva Investimentos\\Documents\\"
//				   + "Eclipse-trabalhos-main\\Algoritimo\\src\\File\\txt");
//		C:\Users\Riva Investimentos\Documents\Facul2022\puc\Facul2022_2\aci\2022-2_arq1
		File file = new File("C:\\Users\\Riva Investimentos\\Documents\\Facul2022\\puc\\Facul2022_2\\aci\\2022-2_arq1\\txt");

		try (Scanner scan = new Scanner(file)) {
			
			while(scan.hasNextLine()) {
				System.out.println(scan.nextLine());
			
			}
		}
		
	}

}
