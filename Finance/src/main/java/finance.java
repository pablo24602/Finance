import java.util.*;
public class finance {
    public static void main(String[] args) {
        Scanner j = new Scanner(System.in);
        System.out.print("Starting at what age? ");
        int start= j.nextInt();
        Scanner o = new Scanner(System.in);
        System.out.print("How long should we model this for? ");
        int end = o.nextInt() + start;
        int count = 1;
        int model[] = new int[end-start];
        int tot = 0;

        while (tot<(end-start))
        {
            System.out.print("How many years for the income #" + count + "? (" + (end-(tot+start)) + " years left) ");
            Scanner ma = new Scanner(System.in);
            int years = ma.nextInt();
            System.out.print("How much will you make during this time per year (in k)? ");
            Scanner mo = new Scanner(System.in);
            int income = mo.nextInt();
            int x = tot;
            while (x<tot+years)
            {
                model[x]=income;
                x++;
            }
            tot+=years;
            count++;
        }
        System.out.print("At what interest rate will your investments perform on average? ");
        Scanner mo = new Scanner(System.in);
        Double interest = mo.nextDouble();

        outputData(interest, model, start);
    }

    public static void outputData(double interest, int[] salaries, int age)
    {
        if (salaries.length==0)
        {
            return;
        }

        double[] toOutput = new double[salaries.length];
        toOutput[0]=salaries[0];
        for (int x = 1; x<salaries.length; x++)
        {
            toOutput[x] = interest * toOutput[x-1] + salaries[x];
        }
        int incr = 0;
        for (double a: toOutput)
        {
            System.out.println("At age " + (age+incr) + ", you will have a worth of " + a);
            incr++;
        }


    }

}
