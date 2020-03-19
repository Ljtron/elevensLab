public class Main{
    public static void main(String[] args){
        String[] ranks = {"jack", "queen", "king"};
        String[] suits = {"blue", "red"};
        int[] values = {11, 12, 13};
        Deck d = new Deck(ranks, suits, values);

        d.deal();
        d.deal();

        System.out.println(d.toString());
    }
}