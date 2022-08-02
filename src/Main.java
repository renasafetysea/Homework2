public class Main {
    public static void main(String[] args) {

        //Задача 1
        byte apples = 100;
        short seeds = 11500;
        int seconds = 2255111;
        long corn = 1211212133L;
       double catWeight = 2.33;
        float ratWeight = 0.2f;
        char club = 106;
        boolean applesIsAdult = apples > 120;
        System.out.println(applesIsAdult);

        //Задача 2
        double firstBoxer = 78.2;
        double secondBoxer = 82.7;

        double total = firstBoxer+secondBoxer;

        double difference = Math.abs(firstBoxer-secondBoxer);

        System.out.println("Общий вес " + total);

        System.out.println("Разница в весе " + difference);

        // Задача 3
       int banana = 5 ;
       int bananasWeight = 80;

       int milk = 200/100;
       int milkWeight = 105;

       int icecream = 2;
       int icecreamWeight = 100;

       int egg = 4;
       int eggWeight = 70;

       int totalB = (banana*bananasWeight) + (milk*milkWeight) + (icecream*icecreamWeight) + (egg*eggWeight);

       int gramsInKg = 1000;

       double totalKgs = totalB / (gramsInKg*1.0);

       System.out.println("В блендере килорамм " + totalKgs);

     // Задача 4
        int weightLose = 7;
        int gramsInKgLose = 1000;
        int weightInGrams = weightLose*gramsInKgLose;

        int firstWeightPlan = 250;
        int secondWeightPlan = 500;

        int daysFirstlwp = weightInGrams / firstWeightPlan;
        int daysSecondlwp = weightInGrams/ secondWeightPlan;
        int middleNumberDays = (daysFirstlwp+daysSecondlwp) / 2;

        System.out.println("Если худеть на 250 гр в день нужно " + daysFirstlwp + " дней");
        System.out.println("Если худеть на 500 гр в день нужно " + daysSecondlwp + " дней");
        System.out.println("Среднее количество дней " + middleNumberDays);

        // Задача 5
        int persent = 10;
        double multiplayer = persent / (100*1.0);

        int cashMonthMasha = 67_760;
        int cashMonthDenis = 83_690;
        int cashMonthKristina = 76_230;

        int cashUpMasha = (int) (cashMonthMasha + (cashMonthMasha* multiplayer));
        int cashUpDenis = (int) (cashMonthDenis + (cashMonthDenis* multiplayer));
        int cashUpKristina = (int) (cashMonthKristina + (cashMonthKristina*multiplayer));

        int mashaDifference = (cashUpMasha-cashMonthMasha)*12;
        int denisDifference = (cashUpDenis-cashMonthDenis)*12;
        int kristinaDifference = (cashUpKristina-cashMonthKristina)*12;


        System.out.println ("Маша теперь получает " + cashUpMasha + " рублей");
        System.out.println("Годовой доход Маши вырос на " + mashaDifference + " рублей");

        System.out.println ("Денис теперь получает " + cashUpDenis + " рублей");
        System.out.println("Годовой доход Дениса вырос на " + denisDifference + " рублей");

        System.out.println ("Кристина теперь получает " + cashUpKristina + " рублей");
        System.out.println("Годовой доход Кристины вырос на " + kristinaDifference  + " рублей");


    }
}