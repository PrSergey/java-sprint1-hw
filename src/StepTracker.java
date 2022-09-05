public class StepTracker {
    int month, day, numberOfStep;
    int[][] stepsInDay = new int[12][31];
    Converter Convert = new Converter();
    int goalStep=10000;
    StepTracker() {
        int month;
        int day;
        int numberOfStep;
        int[][] stepsInDay;
    }

    int saveStep(int month, int day, int numberOfStep) {
        stepsInDay[month][day] = numberOfStep;
        System.out.println("Вы ввели " + numberOfStep + " шагов в " + day + " день " + month + " меясца ");
        return stepsInDay[month][day];
    }

    void statisticsMonth(int month) {
        int sumStep = 0;
        int maxStep = 0;
        int maxDay = 0;
        int averageStep;
        for (int i = 1; i < stepsInDay[month].length; i++) {
            System.out.print(i + " день: " + stepsInDay[month][i] + ", ");
        }
        System.out.println(" ");

        for (int j = 0; j < stepsInDay[month].length; j++) {
            sumStep = sumStep + stepsInDay[month][j];
        }
        System.out.println("Сумма шагов за месяц: " + sumStep);

        for (int k = 1; k < stepsInDay[month].length; k++) {
            if (maxStep < stepsInDay[month][k]) {
                maxStep = stepsInDay[month][k];
                maxDay = k;
            }
        }
        System.out.println("Максимальное количество шагов " + maxStep + " пройдено в " + maxDay + " день.");
        averageStep = sumStep / 30;
        System.out.println("Среднее кол-во шагов за месяц №" + month + " составило: " + averageStep);
        Convert.calculationKm(sumStep);
        Convert.calculationCalorie(sumStep);
    }
        void bestSeries (int month){
            int series = 0;
            int bestSer = 0;
            for (int i = 0; i < stepsInDay[month].length; i++) {
                if (stepsInDay[month][i] >= goalStep) {
                    series++;
                    if (series > bestSer) {
                        bestSer = series;
                    }
                } else {
                    series = 0;
                }
            }
            System.out.println("Ваша лучшая серия составила: " + bestSer);
        }
        void newGoalStep ( int goalStep){
        goalStep=goalStep;
        }
    }

