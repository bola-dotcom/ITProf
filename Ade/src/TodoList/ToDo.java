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
	System.out.println(i + ": " + t.getTitle() + "  | " + t.getPriority() + " | "  + t.date());
	}
}
//sorts
private void sortTasks() {
	tasks.sort(new TaskComparator());
}
}
