package TodoList;
import java.time.LocalDate;
import java.util.Scanner;

public class mainPage {

	public static void main(String[] args) {
		//declaring the variables
		String title;
		String priority;
		LocalDate date;
Scanner scanner = new Scanner(System.in);

while(true)
{
	//gives the user the choice
	System.out.println("\n1.Add Task\n2.ShowTasks\n3.Exit");
	int choice = scanner.nextInt();
	scanner.nextLine();
	

if(choice == 1) {
	
	//for the title
	System.out.println("Title: ");
	title = scanner.nextLine();
	
	
	//the priority of said task
	System.out.println("Priority (HIGH/MEDIUM/LOW):");
	priority = scanner.nextLine();
	
	//The due date
	System.out.println("Due date (YYYY-MM-DD:");
	 date = LocalDate.parse(scanner.nextLine());
	
	
}
else if(choice == 2) {
}

else {
	
	break;
}
}

}
	}
