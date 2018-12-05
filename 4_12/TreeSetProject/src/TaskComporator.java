import java.util.Comparator;

public class TaskComporator implements Comparator<Task> {

    @Override
    public int compare(Task task1, Task task2) {

        if (task1.getQuarter()!=task2.getQuarter()){
            return -Integer.compare(task1.getQuarter(),task2.getQuarter());
        } else {
            int importantDiff = task1.getImportant()-task2.getImportant();
            int quckDiff = task1.getQuickly() - task2.getQuickly();

            return -(importantDiff!=0?importantDiff:quckDiff);
        }
        /*int quickly = task2.getQuickly() - task1.getQuickly();
        if (quickly!=0) return -quickly;

        int important = task2.getImportant() - task1.getImportant();
        return -important;*/
    }
}
