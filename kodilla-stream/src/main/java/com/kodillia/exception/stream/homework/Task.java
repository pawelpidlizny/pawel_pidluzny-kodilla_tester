package com.kodillia.exception.stream.homework;

import java.time.LocalDate;

public class Task {

    String name;
    LocalDate opened;
    LocalDate deadline;

    public Task(String name, LocalDate opened, LocalDate deadline) {
        this.name = name;
        this.opened = opened;
        this.deadline = deadline;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Task task = (Task) o;

        if (name != null ? !name.equals(task.name) : task.name != null) return false;
        if (opened != null ? !opened.equals(task.opened) : task.opened != null) return false;
        return deadline != null ? deadline.equals(task.deadline) : task.deadline == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (opened != null ? opened.hashCode() : 0);
        result = 31 * result + (deadline != null ? deadline.hashCode() : 0);
        return result;
    }
}
