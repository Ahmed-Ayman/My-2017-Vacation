/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java.utils.service.Task;

import Java.utils.DBHandler.DBManager;

import java.sql.Timestamp;
import java.util.List;

/**
 *
 * @author m.abdo
 */
public abstract class Task extends Thread {

    protected Timestamp startTime, endTime;
    protected int dataSet;
    protected String status;
    protected String tableName;
    
    public Task(int dataSet , String viewName) {
        this.dataSet = dataSet;
        this.tableName = viewName;
    }

    /**
     * run an instance of the task then write the instances to the DB..
     *
     */
    @Override
    public void run() {
        this.startTime = new Timestamp(System.currentTimeMillis());
        this.status = "In progress";
        DBManager.updateMainTable(this.dataSet,this.startTime,this.status);
        execute();
    }

    /**
     *
     */
    private void execute() {
        List<Object> objects = runAlgorithm();
        writeResult(objects);
        this.endTime = new Timestamp(System.currentTimeMillis());
        this.status = "processed";
        DBManager.updateMainTable(this.dataSet,this.endTime,this.status);
    }

    protected abstract List<Object> runAlgorithm();

    protected abstract void writeResult(List<Object> objects);
    
}
