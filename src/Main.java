public class Main {
    public static void main(String[] args) {
        float balance = 500.5F;
        int bonus = 1;
        int every = 100;
        float plus= 1001.5f;
        float total;
        float var1 = balance + (int) (plus / every * bonus);
        float var2 = balance + plus;
        if (plus>1000) {
            total = var1;
        } else {
            total = var2;
        }
        System.out.println(total);

    }
}
