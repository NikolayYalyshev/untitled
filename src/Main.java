import salary.HourlyBid;
import salary.PieceWorkBid;
import salary.Salary;
import salary.SalaryBid;
import salary.employer.Employer;

public class Main {
    public static void main(String[] args) {
        HourlyBid hourlyBidUser1 = new HourlyBid(new Employer("Петр", "Петров"),5,100);
        PieceWorkBid pieceWorkBid = new PieceWorkBid(new Employer(), new float[]{1200, 2000, 8000});
        SalaryBid salaryBid = new SalaryBid(new Employer("Олег", "Олегов"), 22, 2500);

        Salary [] salaries = new Salary[]{hourlyBidUser1, salaryBid, pieceWorkBid};

        for (Salary salary: salaries) {
            System.out.println(salary.toString());
        }
    }
}
