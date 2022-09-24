public class Main {
    public static void main(String[] args) {
        double[] massiveA = {-1.4,2.5,-3.5,4.5,-5,6.5,-7,8.5,-9,10.5,1.1,12.5,1.3,-14.5,1.5,};
        double number = 0;
        int quantity = 0;
        boolean t = false;
        
        for (double x : massiveA) {
            if (x <= 0) {
                t = true;
            }else if (t == true) {
                quantity++;
                number += x;
            }
        }
        System.out.println(number / quantity);
    }
}