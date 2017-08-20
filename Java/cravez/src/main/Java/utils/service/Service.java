package Java.utils.service;

import Java.utils.service.Task.Task;

import java.util.ArrayList;

/**
 * Created by ahmed-ayman on 8/18/17.
 */
public  class Service {
    private int persiodToStartup;
    private int maxNumberOfTasks;
    private ArrayList<Task> tasks ; //each service has n number of tasks.
    private String status;
    private int dataSet;
    private int algoType;
    /**
     *
     * @param maxNumberOfTasks: when instansiatiing the service it would need the max number of tasks.
     *                        it will check out the main table and assign the view name to each task.
     */
    public Service(int maxNumberOfTasks,int algoType,int persiodToStartupInMinutes ) {
        this.maxNumberOfTasks = maxNumberOfTasks;
        this.algoType = algoType;
        this.persiodToStartup =persiodToStartupInMinutes;
        this.tasks = new ArrayList<Task>();
    }
    public int numberOfRunningTasks(){
        return this.tasks.size();
    }
    public int getPersiodToStartup() {
        return persiodToStartup;
    }

    public int getAlgoType() {
        return algoType;
    }

    public int getMaxNumberOfTasks() {
        return maxNumberOfTasks;
    }

}
