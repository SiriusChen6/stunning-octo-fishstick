
public class HourlyEmployee extends Employee {
	public double getHourlySalary() {
        return hourlySalary;
    }
 
    public void setHourlySalary(double hourlySalary) {
        this.hourlySalary = hourlySalary;
    }
 
    public int getHours() {
        return hours;
    }
 
    public void setHours(int hours) {
        this.hours = hours;
    }
 
    private double hourlySalary;
    private int hours;
    public HourlyEmployee(){
 
    }
    public HourlyEmployee(String name,int month,double hourlySalary,int hours){
        super(name,month);
        this.hourlySalary=hourlySalary;
        this.hours=hours;
    }
    public double getSalary(int month){
        if(hours<0){
            System.out.println("数据错误!!!!!");
            return 0;
        }
        else if(hours<=160)
            return hourlySalary*hours+super.getSalary(month);
        else return hourlySalary*160+hourlySalary*1.5*(hours-160)+super.getSalary(month);
    }

}
