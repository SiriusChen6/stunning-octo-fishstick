public class main {
    public static void main(String[] args) {
        // TODO 自动生成的构造函数存根
        Employee[] employees = {
                new SalariedEmployee("小敏",1,1600),
                new HourlyEmployee("李思",2,50,180),
                new SalesEmployee("王五",3,6500,0.15),
                new BasePlusSalesEployee("赵六",4,5000,0.15,2000)
        };

        for(int i=0;i<employees.length;i++){
            System.out.println(employees[i].getName()+"工作："+employees[i].getMonth()+"月，工资:"+Math.round(employees[i].getSalary(5)));
        }
    }



}
