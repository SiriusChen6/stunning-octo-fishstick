public class text {
    public static void main(String[] args) {
        try {
            Object obj = new String("hello");
            int i = (int) obj;
        } catch (ClassCastException e) {
            System.out.println("ClassCastException: " + e.getMessage());
        }
    }
}
