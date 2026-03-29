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
ToDo list = new ToDo();
while(true)
{
	//gives the user the choice
	System.out.println("\n1.Add Task\n2.ShowTasks\n3.Toggle Complete\n3.Exit");
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
	
	list.addTask(new Task(title, priority, date));
}
else if(choice == 2) {
	list.showTasks();
}

else if(choice ==3) {
	list.showTasks();
	
	System.out.println("Enter task index:");
	int num = scanner.nextInt();
	num = num-1;
	list.marked(num);
}
else {
	
	break;
}
}

}
	}
