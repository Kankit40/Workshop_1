public class GamblingCode {
    public static void main(String[] args) {
        final int totalamount = 100;

        int outcome = (int) (Math.random() * 2);
        int temp = 0;
        int total =0;

        while (int i = 0; i < 21; i++){
        if (outcome == 1){
            System.out.println("You won the bet");
           temp = outcome + 1;
            System.out.println("Total amount is " + temp);
        }else {
            System.out.println("You have lost the game");
            temp = outcome - 1;
            System.out.println("Total amount is " + temp);
        }
             total = temp + total;
            System.out.println("Total amount will be" + total);
    }
}
