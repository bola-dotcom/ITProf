package TodoList;
import java.time.LocalDate;

public class Task {
	private String title;
	private String priority;
	private LocalDate date;
	private boolean finished;
	
	//constructor
	public Task(String title, String priority, LocalDate date) {
		this.title = title;
		this.priority = priority;
		this.date = date;
		this.finished = false;
	}
	
	public String getTitle() {
		return title;
	}
	public String getPriority() {
		return priority;
	}
	public LocalDate date() {
		return date;
	}
	public boolean isFinished() {
		return finished;
	}
	
	public void mark() {
		this.finished = !this.finished;
	}
	}
