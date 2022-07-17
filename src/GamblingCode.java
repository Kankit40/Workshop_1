public class GamblingCode {
    public static void main(String[] args) {
        final int totalamount = 100;

        int outcome = (int) (Math.random() * 2);
        int temp = 0;
        int total = 0;
        int min_value = 50;
        int max_value = 150;
        int bet = 0;

        for (int i = 0; i < 31; i++) {

            while (bet < max_value && bet > min_value) {
                bet++;
                if (outcome == 1) {
                    System.out.println("You won the bet");
                    temp = totalamount + 1;
                    System.out.println("Total amount is " + temp);
                } else {
                    System.out.println("You have lost the game");
                    temp = totalamount - 1;
                    System.out.println("Total amount is " + temp);
                }
                total = temp + total;
                System.out.println("Total amount will be" + total);
            }
        } int monthlyoutcome = total;
        System.out.println(" The monthly amount is " + monthlyoutcome);

    }
}