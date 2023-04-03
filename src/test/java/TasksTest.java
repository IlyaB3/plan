import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TasksTest {

    @Test
    public void theMatchesMethodTestForSimpleTask() {
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

        boolean expected = true;
        boolean actual = simpleTask.matches("Позвонить родителям");
        Assertions.assertArrayEquals(new boolean[]{expected}, new boolean[]{actual});
    }

    @Test
    public void theMatchesMethodTestForSimpleTaskWithAnInvalidQuery() {
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

        boolean expected = false;
        boolean actual = simpleTask.matches("Приложение НетоБанка");
        Assertions.assertArrayEquals(new boolean[]{expected}, new boolean[]{actual});
    }

}
