import java.util.Scanner;

public class StudentRecordDatabase {

	private String[][] studentRecords;

	public StudentRecordDatabase() {
		studentRecords = new String[20][3];
	}

	public StudentRecordDatabase(Scanner inFS) {
		studentRecords = new String[20][3];
		String tempArray[] = new String[3];
		// building the array
		for (int j = 0; j < 10; j++) {
			// I may not have 15 records
			for (int i = 0; i < 3; i++) {
				studentRecords[j][i] = inFS.nextLine();
			}
		}
	}

	public String getStudentInfo(String type, int studentNumber) {
		String information = "nope";
		if (type.equals("name")) {
			information = studentRecords[studentNumber][0];
		} else if (type.equalsIgnoreCase("hometown")) {
			information = studentRecords[studentNumber][1];
		} else if (type.equalsIgnoreCase("food")) {
			information = studentRecords[studentNumber][2];
		} else {
			information = " I am sorry we do not have that information on file.";
		}
		/// I need to update this to give back the entire sentence
		return information;
	}
}
