import java.util.stream.StreamSupport;

public class Main {
        public static void main(String[] args) {
            String s1 = "北京;上海；深圳；成都";
            String strs[] = s1.split(";");
            for (int i = 0; i < strs.length; i++) {
                System.out.println(strs[i]);
            }
            s1 = "0123456789";
            String s2 = s1.substring(1, s1.length());
            System.out.println(s2);

            String str = "今天早上，我们上{Java程序设计课程}，还有很多练习";
            int leftBound = str.indexOf("{");
            int rightBound = str.indexOf("}");
            String result = str.substring(leftBound + 1, rightBound);
            System.out.println(result);
        }


}


