public class TaskManager {
    private static TaskManager taskManager = null;
    private TaskManager(){
        System.out.println("单例模式");
    }
    public void displayProcess(){

    }
    public void displayService(){

    }
    public static TaskManager getInstance(){
        if (taskManager == null){
            taskManager = new TaskManager();
        }

        return taskManager;
    }
}
