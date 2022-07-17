public class GamblingCode {
    public static void main(String[] args) {
        final int totalamount = 100;

        int outcome = (int) (Math.random() * 2);
        int temp = 0;

        if (outcome == 1){
            System.out.println("You won the bet");
           temp = totalamount + 1;
            System.out.println("Total amount is " + temp);
        }else {
            System.out.println("You have lost the game");
            temp = totalamount - 1;
            System.out.println("Total amount is " + temp);
        }
    }
}
