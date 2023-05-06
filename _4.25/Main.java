public class Main {
    public static void main(String[] args){
        int result = 1;
        try{
            result = divide(4,0);
            System.out.println(result);
        }
        catch (Exception e){
            System.out.println("exception:"+e.getMessage());
            e.printStackTrace();
        }finally {
            System.out.println(result);
            System.out.println("result="+result);
            System.out.println("今天天气很好");
        }
    }
    public static int divide(int x,int y)throws ArithmeticException {
        return x / y;
    }

}