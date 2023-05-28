package ru.netology;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class TaskTest {
    @Test
    public void MatchSimple() {

        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");
        boolean actual = simpleTask.matches("Позвонить");
        boolean expected = true;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MatchSimple1() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);
        boolean expected = true;
        boolean actual = epic.matches("Хлеб");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MatchSimple2() {

        Meeting meeting = new Meeting(

                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        boolean expected = true;
        boolean actual = meeting.matches("версии");
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void MatchSimple3() {

        Meeting meeting = new Meeting(

                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        boolean expected = true;
        boolean actual = meeting.matches("НетоБанка");
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void MatchSimple4() {

        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");
        boolean actual = simpleTask.matches("учителю");
        boolean expected = false;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MatchSimple5() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);
        boolean expected = false;
        boolean actual = epic.matches("Сосиски");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MatchSimple6() {

        Meeting meeting = new Meeting(

                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        boolean expected = false;
        boolean actual = meeting.matches("вкладки");
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void MatchSimple7() {

        Meeting meeting = new Meeting(

                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        boolean expected = false;
        boolean actual = meeting.matches("вторник");
        Assertions.assertEquals(expected, actual);

    }


}

