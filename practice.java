public class practice {
    public static void main(String[] args) {
        double a=20.00;
        double b=80.00;
        double total=(a+b)*100;
        System.out.println("Total is"+total);
        double remainder=total%40.00;
        System.out.println("Remainder is"+remainder);
        boolean ifremainder=(remainder ==0) ?true:false;
        System.out.println("The Remainder is "+ifremainder);
        if(ifremainder== false){
            System.out.println("got some remainder");
        }
    }
}
