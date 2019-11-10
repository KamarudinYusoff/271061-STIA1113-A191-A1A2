import java.util.Scanner;
public class assigment {


    public static void main(String[] din) {

        double CarPrice=0;
        double DownPayment=0;
        double LoanPeriod=0;
        int InterestRate=0;


        Scanner input = new Scanner(System.in);

        while (CarPrice < 30000)
        { System.out.println("Enter car price (RM) : ");
        CarPrice = input.nextDouble();
        }

        while ( DownPayment <=0)
        {System.out.println("Enter down payment(RM) : ");
        DownPayment = input.nextDouble();
        }

        while (LoanPeriod < 5 || LoanPeriod > 9 )
        {System.out.println("Enter loan period (Years) : ");
        LoanPeriod = input.nextDouble();
        }

        while ( InterestRate < 3 || InterestRate > 7 )
        {System.out.println("Enter interest rate (%) : ");
        InterestRate = input.nextInt();
        }

        double TotalInterest;
        double Month;
        double MonthlyPayment;

        TotalInterest = (CarPrice - DownPayment) * InterestRate/100 * LoanPeriod;
        Month = LoanPeriod * 12;
        MonthlyPayment = (CarPrice - DownPayment + TotalInterest) / Month;

        System.out.printf("MonthlyRepayment is : RM%,.2f have to pay in every month", MonthlyPayment );

        double principal;
        double interest;
        double balance;
        int y=1;

        System.out.printf("\n%-5s%20s%20s%20s" , "Years" , "Principal(RM)" , "Interest(RM)" , "Balance(RM)");

        while(y <= LoanPeriod)
        {
            principal = MonthlyPayment * 12 * y;
            interest = TotalInterest / LoanPeriod * y;
            balance = MonthlyPayment * 12 * (LoanPeriod - y);

            System.out.printf("\n%sth %20.2f%20.2f%20.2f" , y, principal , interest , balance);
            y++;
        }

    }

}
