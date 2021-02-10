package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;


public class TaskManager {
    public static void main(String[] args) {
        List<LocalDate> tasks =
                TaskRepository.getTask()
                .stream()
                .map(u-> u.deadline)
                .filter(date-> date.isAfter(LocalDate.now()))
                        .collect(Collectors.toList());
        System.out.println(tasks);
    }
}