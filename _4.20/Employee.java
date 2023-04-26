
public class Employee {
	    private int month;
	    private String name;
	    public String getName(){
			return name;
	    }
	    public void setName(String name) {
	        this.name = name;
	    }
	 
	    public int getMonth() {
	        return month;
	    }
	 
	    public void setMonth(int month) {
			this.month = month;
	    }
	    public double  getSalary(int month){
	        int salary = 0;
	        if(month==this.month)
	            salary=salary+100;
	        return salary;
	    }
	    public Employee(){
	 
	    }
	    public Employee(String name,int month){
	        this.month=month;
	        this.name=name;
	    }

}