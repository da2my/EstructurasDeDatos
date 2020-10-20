package entradaYsalida;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ListFiles {//Archivos secuenciales

	public static void main(String[] args) {
		if(args.length == 0){
			System.out.println("No files specified");
			
			for (String fileName : args) {
				listFile(fileName);		
			}
		}
	}

	public static void listFile(String fileName) {
		Scanner fileIn = null;
		System.out.println("FILE: " + fileName);
		try {
			fileIn = new Scanner (new FileReader(fileName));
			while(fileIn.hasNextLine()) {
				String oneLine= fileIn.nextLine();
				System.out.println(oneLine);
			}
		}catch(IOException e) {
			System.out.println(e);
		}
		finally {
//			Cerrar el flujo de datos
			if (fileIn!=null) {
				fileIn.close();
			}
		}
	}

}
