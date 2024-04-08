import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] spending = new int[5];
        System.out.println("Введите все траты за месяц");
        Scanner spend = new Scanner(System.in);
        spending [0] = spend.nextInt();
        spending [1] = spend.nextInt();
        spending [2] = spend.nextInt();
        spending [3] = spend.nextInt();
        spending [4] = spend.nextInt();
        int  monthlyExpenses = 0;
        for (int s = 0; s <= 4; s++) {
            monthlyExpenses += spending[s];
        }
        System.out.println("Сумма трат за месяц составляет - " + monthlyExpenses + " рублей.");

        System.out.println(" ");
        System.out.println("2 задача");
        int [] spentInWeek = {1234, 452, 6987, 556, 87};
        int min = spentInWeek[0];
        int max = spentInWeek[0];
        for (int i = 1; i < spentInWeek.length; i++) {
            if (spentInWeek[i] > spentInWeek[0] && spentInWeek[i] > max) {
                max = spentInWeek[i];
            } else if (spentInWeek[i] < spentInWeek[0] && spentInWeek[i] < min) {
                min = spentInWeek[i];
            }
        }
        System.out.println("Минимальная сумма затрат за неделю составила " + min + " рублей. Максимальная сумма затрат за неделю составила " + max + " рублей.");
        System.out.println(" ");
        System.out.println("3 задача");
        int[] spentInMonth = new int[5];
        spentInMonth[0] = 584;
        spentInMonth[1] = 9543;
        spentInMonth[2] = 21356;
        spentInMonth[3] = 1454;
        spentInMonth[4] = 5410;
        int summ = 0;
        for (int i = 0; i < spentInMonth.length; i++) {
            summ += spentInMonth[i];
        }
        float middleSpend = (float) summ / spentInMonth.length;
        System.out.println("Средняя сумма трат за месяц составила - " + middleSpend + " рублей.");

        System.out.println(" ");
        System.out.println("4 задача");
        char [] reversFullName = {'n','a','v','I',' ','v','o','n','a','v','I'};
        for (int i = 10; i >= 0; i--) {
            System.out.print(reversFullName[i]);
        }
    }
}

