public class Converter {
    void calculationKm (int sumStep) {
        double sumKm = 0.00075 * sumStep;
        String resultKm = String.format("%.3f", sumKm);
        System.out.println("За месяц вы прошли " + resultKm + " километров");
    }
    void calculationCalorie (int sumStep) {
        double sumKcal =sumStep*50/1000;
        String resultKcal = String.format("%.3f", sumKcal);
        System.out.println("За месяц вы сожгли " + sumKcal + " килокалорий");
    }
}
