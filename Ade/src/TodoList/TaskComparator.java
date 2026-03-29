package TodoList;
import java.util.Comparator;

//this will sort the tasks
public class TaskComparator implements Comparator<Task>{
	@Override
	
	public int compare(Task t1, Task t2) {
		//compares the task by date
		int dateCompare = t1.date().compareTo(t2.date());
		
		//if due dates are different
		if(dateCompare != 0) 
			return dateCompare;
		
		//if they are the same
		return t1.getPriority().compareTo(t2.getPriority());
	}

}
