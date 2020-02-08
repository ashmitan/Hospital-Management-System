/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author user
 */
public class WorkQueueDirectory {
    private ArrayList<WorkQueue> workQueueList = new ArrayList<WorkQueue>();

    public WorkQueue createWorkQueue(String task)
    {
       WorkQueue workQueue = new WorkQueue();
       workQueue.setDate(new Date());
       workQueue.setTask(task);
       workQueue.setStatus("Pending");
       workQueueList.add(workQueue);
       return workQueue;
    }
    public ArrayList<WorkQueue> getWorkQueueList() {
        return workQueueList;
    }

    public void setWorkQueueList(ArrayList<WorkQueue> workQueueList) {
        this.workQueueList = workQueueList;
    }
    
    
}
