package Part2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		String test = "This is a test";

		writeToFile("output.txt");
		appendToFile("output.txt");

		writeWithoutBuffer("custom.txt", "This is a custom message without using buffers.");
		readFromFile("output.txt");

		try {
			// Creates a FileWriter
			FileWriter file = new FileWriter("input.txt");

			// Creates a BufferedWriter
			BufferedWriter output = new BufferedWriter(file);

			// Writes data to the file
			output.write(test);

			// Prints the file content

			output.close();
		}

		catch (Exception e) {
			e.getStackTrace();

		}
		readFromFile("input.txt");
	}

	private static void readFromFile(String fileName) {
		try (FileReader fileReader = new FileReader(fileName);
				BufferedReader bufferedReader = new BufferedReader(fileReader)) {

			String line;
			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
				int characterCount = countCharacters(line);
				System.out.println("Character Count: " + characterCount);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static int countCharacters(String str) {
		return str.replaceAll("\\s", "").length();
	}

	private static void writeToFile(String fileName) {
		try (FileWriter fileWriter = new FileWriter(fileName);
				BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {

			bufferedWriter.write("Hello, this is line 1.");
			bufferedWriter.newLine();
			bufferedWriter.write("Java File I/O is interesting!");
			bufferedWriter.newLine();
			bufferedWriter.write("End of the assignment.");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void appendToFile(String fileName) {
		try (FileWriter fileWriter = new FileWriter(fileName, true);
				BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {

			bufferedWriter.newLine();
			bufferedWriter.write("Appending new line.");
			bufferedWriter.newLine();
			bufferedWriter.write("File I/O without buffers.");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void writeWithoutBuffer(String fileName, String content) {
		try (FileWriter fileWriter = new FileWriter(fileName)) {
			fileWriter.write(content);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
