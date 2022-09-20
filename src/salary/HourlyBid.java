package salary;

import salary.employer.Employer;

public class HourlyBid extends Salary {

    private int hour;
    private float bidHour;

    public HourlyBid(Employer employer, int hour, float bidHour) {
        super(employer);
        this.hour = hour;
        this.bidHour = bidHour;
        getSalary();
    }

    @Override
    public float getSalary() {
        salary=hour+bidHour;
        return salary;
    }

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
