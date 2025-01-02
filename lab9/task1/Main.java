public class Main {
    public static void main(String[] args) {
        try {
            NullPointerExceptionThrower.throwNullPointerException();
        } catch (NullPointerException e) {
            System.out.println("Program crashed: a fatal exception occurred: " + e.getMessage());
            e.printStackTrace();
            System.out.println(e.toString());
        }
    }
}
