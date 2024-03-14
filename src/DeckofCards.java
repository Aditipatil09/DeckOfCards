import java.util.ArrayList;
import java.util.Collections;
public class DeckofCards {
    public static void main(String args[]){
        String[] Suits = {"Club" , "Dimonds" , "Hearts" , "Spades"};
        String[] Ranks = {"2","3","4","5","6","7","8","9","10", "King", "Queen" , "ACE", "Jack",};
        ArrayList<String> deck = new ArrayList<>();
        for (String Suit :Suits){
            for(String Rank :Ranks){
                deck.add (Rank+ "of" +Suit);
            }
        }
        Collections.shuffle(deck);

        String[][] playersCards = new String [4][9];
        int cardIndex =0;
        for(int i=0; i<4;i++){
            for(int j=0;j<9;j++){
                playersCards[i][j] = deck.get(cardIndex++);
            }
        }

        for(int i=0 ; i<4; i++){
            System.out.println("Payer" +(i+1)+ "Cards");
            for (int j=0;j<9;j++){
                System.out.println( playersCards[i][j]);
            }
        }
    }
}
