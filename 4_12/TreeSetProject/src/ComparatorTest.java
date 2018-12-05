
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ComparatorTest {

	@Test
	void test1() {
		TaskComporator comparator = new TaskComporator();
		Task task1 = new Task("Watch TV",-34,-12);
		Task task2 = new Task("Sleep",-7,10);
		
		int res = comparator.compare(task1, task2);
		
		assertTrue(res>0);
		
	}
	
	@Test
	void test2() {
		TaskComporator comparator = new TaskComporator();
		Task task1 = new Task("Watch TV",-34,-12);
		Task task2 = new Task("Sleep",-34,-12);
		
		int res = comparator.compare(task1, task2);
		
		assertTrue(res==0);
		
	}

}
