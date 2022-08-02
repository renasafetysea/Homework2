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
        System.out.println(club);
        //Задача 2
        double firstBoxer = 78.2;
        double secondBoxer = 82.7;
        double weightOfAllBoxers = firstBoxer+secondBoxer;
        double weightDifference = secondBoxer-firstBoxer;
        System.out.println("Общий вес " + weightOfAllBoxers);
        System.out.println("Разница в весе " + weightDifference);
        // Задача 3
       int bananasItems = 5 ;
       int oneBananasWeight = 80;
       int allBananasWeight = bananasItems * oneBananasWeight;
       int milkItems = 2;
       int oneMilkWeight = 105;
       int allMilkWeight = milkItems * oneMilkWeight;
       int icecreamItems = 2;
       int oneIcecreamWeight = 100;
       int allIcecreamWeight = icecreamItems * oneIcecreamWeight;
       int eggItems = 4;
       int oneEggWeight = 70;
       int allEggWeight = eggItems * oneEggWeight;
       int grammInBlender = allBananasWeight + allMilkWeight + allIcecreamWeight + allEggWeight;
       float kilogrammInBlender = grammInBlender / 1000f;
       System.out.println("В блендере грамм " + grammInBlender);
       System.out.println("В блендере килорамм " + kilogrammInBlender);
     // Задача 4
        int firstLoseWeightPlan = 250;
        int secondLoseWeightPlan = 500;
        int allWeightLose = 7*1000;
        int daysFirstlwp = allWeightLose / firstLoseWeightPlan;
        int daysSecondlwp = allWeightLose / secondLoseWeightPlan;
        int middleNumberDays = (daysFirstlwp+daysSecondlwp) / 2;

        System.out.println("Если худеть на 250 гр в день нужно " + daysFirstlwp + " дней");
        System.out.println("Если худеть на 500 гр в день нужно " + daysSecondlwp + " дней");
        System.out.println("Среднее количество дней " + middleNumberDays);
        // Задача 5
        int cashMonthMasha = 67760;
        int cashMonthDenis = 83690;
        int cashMonthKristina = 76230;
        int cashUpMasha = ((67760 / 100) * 10) + 67760;
        int cashUpDenis = ((83690 / 100) * 10) + 83690;
        int cashUpKristina = ((76230 / 100) * 10) + 76230;
        int yearCashMashaWas = 67760 * 12;
        int yearCashDenisWas = 83690 * 12;
        int yearCashKristinaWas = 76230 * 12;
        int yearCashMashaNow = cashUpMasha * 12;
        int yearCashDenisNow = cashUpDenis * 12;
        int yearCashKristinaNow = cashUpKristina * 12;
        int payRaiseMasha = yearCashMashaNow - yearCashMashaWas;
        int payRaiseDenis = yearCashDenisNow - yearCashDenisWas;
        int payRaiseKristina = yearCashKristinaNow - yearCashKristinaWas;
        System.out.println ("Маша теперь получает " + cashUpMasha + " рублей");
        System.out.println("Годовой доход Маши вырос на " + payRaiseMasha + " рублей");
        System.out.println ("Денис теперь получает " + cashUpDenis + " рублей");
        System.out.println("Годовой доход Дениса вырос на " + payRaiseDenis + " рублей");
        System.out.println ("Кристина теперь получает " + cashUpKristina + " рублей");
        System.out.println("Годовой доход Кристины вырос на " + payRaiseKristina  + " рублей");


    }
}