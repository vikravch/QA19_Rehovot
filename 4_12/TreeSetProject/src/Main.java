import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		TreeSet<Task> schedule = new TreeSet<>(new TaskComporator());
        schedule.add(new Task("Go to shopping", 12, -2));
        schedule.add(new Task("Sleep",-7,10));
        schedule.add(new Task("Eat burger",72,12));
        schedule.add(new Task("Call to boss",12,10));
        schedule.add(new Task("Watch TV",-34,-12));
        schedule.add(new Task("Make selfie with elephant", -10, -5));

        for (Task task: schedule) {
            System.out.println(task);
        }

	}

}
