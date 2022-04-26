/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdminTask;

/**
 *
 * @author Udani Dias
 */
public class AdminTask {
    //member variables
    private String task_id;
    //private String userID;
    private String task_date;
    private String task_information;

    //constructors

    public AdminTask() {
        task_id = "T000";
        task_date = "";
        task_information = "Nothing Happened";
    }

    public AdminTask(String task_id, String task_date, String task_information) {
        this.task_id = task_id;
        this.task_date = task_date;
        this.task_information = task_information;
    }
    //setters

    public void setTaskID(String task_id) {
        this.task_id = task_id;
    }

    public void setTaskDate(String task_date) {
        this.task_date = task_date;
    }

    public void setTaskInformation(String task_information) {
        this.task_information = task_information;
    }

    //getters


    public String getTaskID() {
        return task_id;
    }

    public String getTaskDate() {
        return task_date;
    }

    public String getTaskInformation() {
        return task_information;
    }
}

