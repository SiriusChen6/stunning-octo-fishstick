public class E7 {
    public static void main(String[] args){
        String s1 = "";
        long start = System.currentTimeMillis();
        for(int i = 0;i<10000;i++){
            s1 = s1 + " " + i ;
        }
        long end = System.currentTimeMillis();
        System.out.println(s1.length());
        System.out.println("直接字符串连接耗用"+(end-start)+"毫秒");

        StringBuffer strBuffer = new StringBuffer(1024);
        start = System.currentTimeMillis();
        for(int i = 0 ; i < 10000 ; i++){
            strBuffer.append(" ");
            strBuffer.append(i);

        }
        String s2 = strBuffer.toString();
        end = System.currentTimeMillis();
        System.out.println("s1==s2?"+s1.equals(s2));
        System.out.println("StringBuffer耗用"+(end-start)+"毫秒");
    }
}
