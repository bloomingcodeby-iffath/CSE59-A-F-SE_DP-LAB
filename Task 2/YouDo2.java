class NumberChecker{
    void check(int num){
        boolean result=(num % 2 ==0) && (num > 10);
        System.out.println(result);
    }
}
public class Main2 {
    public static void main(String[] args) {
        NumberChecker nc = new NumberChecker();
        nc.check(14);
    }
}

