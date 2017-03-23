import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Task {
  private String mDesc;
  private Boolean mCompleted;
  private LocalDateTime mCreatedAt;
  private static List<Task> instances = new ArrayList<Task>();

  public Task(String desc){
    mDesc = desc;
    mCompleted = false;
    mCreatedAt = LocalDateTime.now();
    instances.add(this);
  }

  public String getDesc(){
    return mDesc;
  }

  public boolean isCompleted() {
    return mCompleted;
  }

  public LocalDateTime getCreatedAt(){
    return mCreatedAt;
  }

  public static List<Task> all() {
    return instances;
  }
}
