
import java.util.ArrayList;
import java.util.Iterator;
public class Example03 {

    public static void main(String[] args) {
        // 创建5个学生对象
        Student s1 = new Student(1, "张三");
        Student s2 = new Student(2, "李四");
        Student s3 = new Student(3, "王五");
        Student s4 = new Student(4, "赵六");
        Student s5 = new Student(5, "钱七");

        // 将学生对象放到ArrayList中
        ArrayList<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);

        // 通过迭代器打印学生信息
        Iterator<Student> iterator = list.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            System.out.println("学生ID：" + student.getId() + "，姓名：" + student.getName());
        }
    }
}