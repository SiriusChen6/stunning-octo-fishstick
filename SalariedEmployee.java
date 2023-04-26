
public class SalariedEmployee extends Employee {

	 	private int monthSalary;
	   public SalariedEmployee(String name,int month,int monthSalary){
	       super(name,month);
	       this.monthSalary=monthSalary;
	   }
	   public int getMonthSalary(){
	       return monthSalary;
	   }
	   public void setMonthSalary(int monthSalary){
	       this.monthSalary = monthSalary;
	   }
	   public double getSalary(int month){
		   return monthSalary+super.getSalary(month);
	   }

}
