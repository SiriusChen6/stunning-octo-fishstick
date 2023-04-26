
public class SalesEmployee extends Employee{
	private double sales;
    private double rete;
    public double getSales() {
        return sales;
    }
 
    public void setSales(double sales) {
        this.sales = sales;
    }
 
    public double getRete() {
        return rete;
    }
 
    public void setRete(double rete) {
        this.rete = rete;
    }
 
    public SalesEmployee(){
 
    }
    public SalesEmployee(String name,int month,double sales,double rete){
        super(name,month);
        this.sales=sales;
        this.rete=rete;
    }
 
    @Override
    public double getSalary(int month) {
        return this.getSales()*(this.getRete())+super.getSalary(month);
    }
}
