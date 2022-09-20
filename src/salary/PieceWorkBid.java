package salary;

import salary.employer.Employer;

public class PieceWorkBid extends Salary{

    private  float [] piecework;

    public PieceWorkBid(Employer employer, float[] pieceWorkBid) {
        super(employer);
        this.piecework = pieceWorkBid;
        this.getSalary();
    }

    @Override
    public float getSalary() {
        float res = 0;
        for (float f: piecework) {
            res+=f;
        }
        this.salary = res;
        return res;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(this.employer.toString());
        builder.append(" ");
        builder.append(this.getClass().getName());
        builder.append(" ");
        builder.append(salary);
        return builder.toString();
    }
}
