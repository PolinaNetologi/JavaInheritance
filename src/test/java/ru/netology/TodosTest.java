package ru.netology;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class TodosTest {
    @Test
    public void shouldAddThreeTasksOfDifferentType() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        Todos todos = new Todos();

        todos.add(simpleTask);
        todos.add(epic);
        todos.add(meeting);

        Task[] expected = {simpleTask, epic, meeting};
        Task[] actual = todos.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldTask() {
        Todos todos = new Todos();
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        todos.add(simpleTask);
        todos.add(epic);
        todos.add(meeting);
        Task[] actual = todos.search("Позвонить");
        Task[] expected = {simpleTask};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldTask1() {
        Todos todos = new Todos();//здесь кладем объект
        SimpleTask simpleTask = new SimpleTask(5, "Купить Яйца");
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        todos.add(simpleTask);
        todos.add(epic);
        todos.add(meeting);
        Task[] actual = todos.search("Яйца");
        Task[] expected = {simpleTask, epic};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldTask2() {
        Todos todos = new Todos();
        SimpleTask simpleTask = new SimpleTask(5, "Доделать приложения");
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        todos.add(simpleTask);
        todos.add(epic);
        todos.add(meeting);
        Task[] actual = todos.search("приложения");
        Task[] expected = {simpleTask, meeting};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldTask3() {
        Todos todos = new Todos();
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");
        String[] subtasks = {"Банка сгущенки", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        todos.add(simpleTask);
        todos.add(epic);
        todos.add(meeting);
        Task[] actual = todos.search("Банка");
        Task[] expected = {epic, meeting};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldTask4() {
        Todos todos = new Todos();
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");
        String[] subtasks = {"Банка сгущенки", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        todos.add(simpleTask);
        todos.add(epic);
        todos.add(meeting);
        Task[] actual = todos.search("Баранки");
        Task[] expected = {};
        Assertions.assertArrayEquals(expected, actual);
    }
}


