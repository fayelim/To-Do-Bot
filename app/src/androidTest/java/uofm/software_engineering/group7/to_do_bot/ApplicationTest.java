package uofm.software_engineering.group7.to_do_bot;

import junit.framework.TestCase;
import uofm.software_engineering.group7.to_do_bot.models.TaskListManager;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends TestCase {
    private TaskListManager taskManager = new TaskListManager(null, "List");

    protected void setUp() {

    }

    protected void tearDown() {

    }

    public void addItemTest() {
        taskManager.addTask(null, "Test");
    }

    public void removeItemTest() {

    }
}