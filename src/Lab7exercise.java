import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * descriptionOfProject
 * 
 * @see java.lang.Object
 * @author Jenna Price
 * @version 0.1, October 30th, 2017
 *
 */

public class Lab7exercise {

	public static void main(String[] args) throws IOException {
		FileInputStream fileByteStream;
		Scanner inFS = null;
		int userInput;
		String studentName, infoPreference;
		// String[][] studentRecords = new String[20][3];

		// Try to open file
		try {
			fileByteStream = new FileInputStream("studentdatabase.txt");
			inFS = new Scanner(fileByteStream);
		} catch (IOException e) {

			System.out.println("There was a problem with your file please check and try again.");
			e.printStackTrace();
			return;
		}

		StudentRecordDatabase javaOct = new StudentRecordDatabase(inFS);
		Scanner scnr = new Scanner(System.in);
		userInput = Validator.getInt(scnr, "Please enter a student number to learn more about the student(1-10):", 1,
				10);

		studentName = javaOct.getStudentInfo("name", userInput);
		System.out.println("You have chosen " + studentName + ". What would would you like to know about " + studentName
				+ " hometown or favorite food (type home or food)?");
		infoPreference = scnr.nextLine();
		System.out.println(studentName + "'s information is " + javaOct.getStudentInfo(infoPreference, userInput));

		scnr.close();
		inFS.close();

	}

}
