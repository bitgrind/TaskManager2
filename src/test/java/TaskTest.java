import java.time.LocalDateTime;
import org.junit.*;
import static org.junit.Assert.*;

public class TaskTest {

  @Test
  public void Method_TypeofResrouce_Expected() {
    Task myTask = new Task();
    String expected = "Added Tast Test";
    assertEquals(expected, myTask.Task("Added Test Task"));
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

}
