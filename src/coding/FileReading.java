package coding;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileReading {

	public static void main(String[] args) throws IOException {
		File f = new File("./TestData/Masum.txt");
		FileWriter fw = new FileWriter(f, true);
		BufferedWriter writer = new BufferedWriter(fw);
		writer.write("Masum Raza");
		writer.newLine();
		writer.write("Lakshmi Raza");
		writer.newLine();
		writer.write("Sonu Raza");
		writer.newLine();
		writer.close();
		System.out.println("File Created!!!");
	}
}
