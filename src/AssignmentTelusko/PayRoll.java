package AssignmentTelusko;


class Employer{
    private String employeeName;
    private double hourlyRate;
    private double hoursWorked;

    public Employer(String employeeName, double hoursWorked, double hourlyRate) {
        this.employeeName = employeeName;
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }
    void pay() {
        double regularPay = 0,totalPay=0,overtimePay=0;
        if (hoursWorked > 40) {
            double overtimeHours = hoursWorked - 40;
            overtimePay = (overtimeHours * 1.5 * hourlyRate);//lets take overtime pay as 1.5 times
            regularPay = 40 * hourlyRate;
            totalPay = regularPay+overtimePay;
            System.out.println(totalPay);
        }
        else{
            totalPay=hoursWorked*hourlyRate;
            System.out.println(totalPay);
        }
    }
}

public class PayRoll {
    public static void main(String[] args) {
        Employer emp= new Employer("bheem",41,40);
        emp.pay();
    }
}
