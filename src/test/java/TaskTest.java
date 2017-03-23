import java.time.LocalDateTime;
import org.junit.*;
import static org.junit.Assert.*;

public class TaskTest {

  @Test
  public void Method_TypeofResrouce_Expected() {
    Task myTask = new Task("my task");
    assertEquals(true, myTask instanceof Task);
  }

  @Test
  public void Task_instantiatesCorrectly_true() {
    Task myTask = new Task("Mow the lawn");
    assertEquals(true, myTask instanceof Task);
  }

  @Test
  public void getCreatedAt_instantiatesWithCurrentTime_today() {
    Task myTask = new Task("Mow the lawn");
    assertEquals(LocalDateTime.now().getDayOfWeek(), myTask.getCreatedAt().getDayOfWeek());
  }

  @Test
   public void all_returnsAllInstancesOfTask_true() {
     Task firstTask = new Task("Mow the lawn");
     Task secondTask = new Task("Buy groceries");
     assertEquals(true, Task.all().contains(firstTask));
     assertEquals(true, Task.all().contains(secondTask));
   }

   @Test
    public void clear_emptiesAllTasksFromArrayList_0() {
      Task myTask = new Task("Mow the lawn");
      Task.clear();
      assertEquals(0, Task.all().size());
    }

    @Test
      public void getId_tasksInstantiateWithAnID_1() {
      Task.clear();  // Remember, the test will fail without this line! We need to empty leftover Tasks from previous tests!
      Task myTask = new Task("Mow the lawn");
      assertEquals(0, myTask.getId());
    }

    @Test
      public void category_instantiatesCorrectly_true() {
      Category testCategory = new Category("Home");
      assertEquals(true, testCategory instanceof Category);
    }
}
