package com.amoueed.pakistanvaccineschedule.model;

public class Vaccine {
    private String name;
    private String dueDate;
    private String givenDate;
    private String status;
    private String reminderStatus;

    public Vaccine(String name, String dueDate, String givenDate, String status, String reminderStatus) {
        this.name = name;
        this.dueDate = dueDate;
        this.givenDate = givenDate;
        this.status = status;
        this.reminderStatus = reminderStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getGivenDate() {
        return givenDate;
    }

    public void setGivenDate(String givenDate) {
        this.givenDate = givenDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getReminderStatus() {
        return reminderStatus;
    }

    public void setReminderStatus(String reminderStatus) {
        this.reminderStatus = reminderStatus;
    }
}
