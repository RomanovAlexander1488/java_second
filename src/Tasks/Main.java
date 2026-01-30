package Tasks;

public class Main {

    public static void main(String[] args) {

        Task myTask = new Task("Реализовать программу");
        SubTask s1 = new SubTask("Посадить дерево");
        SubTask s2 = new SubTask("Протестировать выполнение");

        myTask.addSubTask(s1);
        myTask.addSubTask(s2);

        System.out.println(myTask);

        s1.setCompleted(true);
        s2.setCompleted(true);

        if (myTask.checkAndComplete()) {
            System.out.println("Успешно " + myTask);
        }


    }
}