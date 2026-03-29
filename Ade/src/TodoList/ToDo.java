package TodoList;

import java.util.*;

public class ToDo {
	//made an array list of the tasks
private List<Task>tasks = new ArrayList<>();


//to add a task which sorts it
public void addTask(Task task) {
	tasks.add(task);
	sortTasks();
	
}
//display
public void showTasks() {
	
	if(tasks.isEmpty()){
		System.out.println("No tasks yet.");
		return;
	}
	
	for(int i = 0; i<tasks.size(); i++) {
	Task t = tasks.get(i);
	System.out.println(i+1 + ": " + (t.isFinished() ?"[/]":"[ ]" )+ t.getTitle() + "  | " + t.getPriority() + " | "  + t.date());
	}
}
//sorts
private void sortTasks() {
	tasks.sort(new TaskComparator());
}
public void marked(int num)
{
	if(num >=0 && num < tasks.size()) {
		Task task = tasks.get(num);
		task.mark();
		
		if(task.isFinished()) {
					System.out.println("Completed");
	}
		else {
			System.out.println("Not completed");
		}
	}
	else {
		System.out.println("Invalid");
	}
}
}
