package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    public static List<Task> getTask(){
        List<Task>tasks = new ArrayList<>();

        tasks.add(new Task("Dawid",LocalDate.of(2021,2,9), LocalDate.of(2021,3,8)));
        tasks.add(new Task("Amelia",LocalDate.of(2022,3,6),LocalDate.of(2022,4,9)));
        tasks.add(new Task("Konrad",LocalDate.of(2023,3,7),LocalDate.of(2024,4,6)));
        tasks.add(new Task("Pawel",LocalDate.of(2020,5,9),LocalDate.of(2026,6,9)));
        tasks.add(new Task("Zelmer",LocalDate.of(2019,5,6),LocalDate.of(2018,3,8)));
        return tasks;

    }

}
