package fci.assignment1;

/**
 * Created by Mohamed Nabil Mohamed (Nobel) on 11/25/2017.
 * byte code SA
 * m.nabil.fci2015@gmail.com
 */

public class TaskItemData {

    String taskname;
    int ImageId;

    public TaskItemData(String taskname, int imageId) {
        this.taskname = taskname;
        ImageId = imageId;
    }

    public String getTaskname() {
        return taskname;
    }

    public void setTaskname(String taskname) {
        this.taskname = taskname;
    }

    public int getImageId() {
        return ImageId;
    }

    public void setImageId(int imageId) {
        ImageId = imageId;
    }
}
