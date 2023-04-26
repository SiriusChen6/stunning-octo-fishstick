
public class BasePlusSalesEployee extends SalesEmployee{
	 public double getBaseSalary() {
	        return baseSalary;
	    }
	 
	    public void setBaseSalary(double baseSalary) {
	        this.baseSalary = baseSalary;
	    }
	 
	    private double baseSalary;
	    public BasePlusSalesEployee(){
	 
	    }
	    public BasePlusSalesEployee(String name,int month,double sales,double rete,double baseSalary){
	        super(name,month,sales,rete);
	        this.baseSalary=baseSalary;
	    }
	    public double getSalary(int month){
	        return baseSalary+super.getSalary(month);
	    }
}
