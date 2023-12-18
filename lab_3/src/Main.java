import java.util.Scanner;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numTask ;
        do {
            System.out.println("Введіть номер завдання для виконанання (1,2,3)");
            numTask = in.nextInt();
            switch (numTask){
                case 1:
                    task1.tasks();
                    break;
                case 2:
                    task2.tasks();
                    break;
                case 3:
                    task3.tasks();
                    break;

            }
        }while(numTask < 1 || numTask>4);

    }
}

class task1 {
    public static void tasks() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введіть t");
        int t = in.nextInt();
        System.out.println("Vvedit S");
        int S = in.nextInt();
        System.out.println("Введіть K від 2 до 25 включно");
        int k = in.nextInt();
        if (k<2||k>=25) {
            System.out.println("K має бути від 2 до 25");
        }
        if (t > 0) {
            System.out.println("Введіть число t менше 0");
        }
        if (S < 0) {
            System.out.println("Введіть S більше за нуль");
        } else {
            int sum = 0;
            for (int i = 0; i < k; i++) {
                sum += Func(t, S ,k);
            }
            System.out.println("Результат: " + sum);
        }
    }

    public static double Func(int t, int S,int i) {
        return log(-t * i) * cos(sqrt(S / pow(i, 2)));
    }
}

class task2 {
    public static void tasks() {

        task2 secondTaskObj = new task2();

        secondTaskObj.printtaskSolution(12, 9, 1);
        secondTaskObj.printtaskSolution(0, 8, -3);
        secondTaskObj.printtaskSolution(-7, 11, 7);
        secondTaskObj.printtaskSolution(5, 7, 2);
        secondTaskObj.printtaskSolution(0, 13, 0);
        secondTaskObj.printtaskSolution(-16, 5, 8);
    }

    private double solvetask(double t, int n, int l) {
        boolean isItEven = l % 2 == 0;

        if(t == 0 || isItEven && t < 0) {
            throw new IllegalArgumentException("param t = " + t);
        }

        double sum = 0;
        for(int i = 1; i <= n; i++) {
            sum += isItEven ? l / Math.sqrt(t) : l / t;
        }

        return sum;
    }

    private void printtaskSolution(double t, int n, int l) {
        String output = "t=" + t + "; n=" + n + "; l=" + l + ";\nresult: ";

        try {
            output += solvetask(t, n, l);

        } catch(IllegalArgumentException e) {
            output += "EXCEPTION! " + e.getMessage();
        }

        System.out.println(output);
    }
}




 class task3 {
    public task3() {
    }

    public static void tasks() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть значення для ε (ε > 0): ");
        double epsilon = scanner.nextDouble();
        if (epsilon <= 0.0) {
            throw new IllegalArgumentException("ε повинно бути більше за 0");
        } else {
            double sum = calculateInfiniteSum(epsilon);
            System.out.println("Результат: " + sum);
        }
    }

    public static double calculateInfiniteSum(double epsilon) {
        double sum = 0.0;
        int i = 1;

        double term;
        do {
            term = 1.0 / Math.pow(i, 2.0);
            sum += term;
            ++i;
        } while(Math.abs(term) >= epsilon);

        return sum;
    }
}