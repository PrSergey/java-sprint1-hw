import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput = 1;
        int month, day, numberOfStep;
        int goalStep=10000;
        StepTracker StepTracker = new StepTracker();

        while (userInput != 0) {
            printMenu();
            userInput = scanner.nextInt();

            if (userInput == 1) {
                System.out.println("За какой месяц вы хотите внести шаги");
                month = scanner.nextInt();
                System.out.println("За какой день " + month + " месяца вы хотите внести шаги");
                day = scanner.nextInt();
                System.out.println("Какое количество шагов вы хотите внести");
                numberOfStep = scanner.nextInt();

                if ((month > -1) && (month < 12) && (day > 0) && (day < 31) && (numberOfStep > -1)) {
                    StepTracker.saveStep(month, day, numberOfStep);
                } else {
                    System.out.println("Данные введены некорректно");
                }

            } else if (userInput == 2) {
                System.out.println("За какой меяц вывести статистику?");
                month = scanner.nextInt();
                if ((month > -1) && (month < 12)) {
                    StepTracker.statisticsMonth(month);
                    StepTracker.bestSeries(month, goalStep);
                } else {
                    System.out.println("Введен некорректный месяц");
                }
            } else if (userInput == 3) {
                System.out.println("Введите новую цель по количеству шагов");
                goalStep = scanner.nextInt();
                if(goalStep>0) {
                    StepTracker.newGoalStep(goalStep);
                }else{
                    System.out.println("Введены некорректные данные");
                }
            } else if (userInput == 4) {
                System.out.println("Выход");
                break;

            } else {
                System.out.println("Такой команды нет");
            }
        }
        System.out.println("Программа завершена");
    }
    private static void printMenu() {
        System.out.println("Что вы хотите сделать? ");
        System.out.println("1 - Ввести количество шагов");
        System.out.println("2 - Получить статистику за месяц");
        System.out.println("3 - Изменить цель по количеству шагов");
        System.out.println("4 - Выйти из приложения");

    }
}