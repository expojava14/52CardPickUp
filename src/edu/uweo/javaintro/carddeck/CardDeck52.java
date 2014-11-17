package edu.uweo.javaintro.carddeck;

import java.lang.Math;
public class CardDeck52
{
    int cardValue;
               
    public static void main(String[] args)
    {
        //Create card deck.
        boolean[] cardsInDeck = new boolean[52];
        //Create a hand to hold 5 cards.
        int[] hand1 = new int[5];
        int[] hand2 = new int[5];
        int[] hand3 = new int[5];
        int[] hand4 = new int[5];
        
        System.out.println("Your hand is:");
        System.out.println();
        
        for (int i=0; i<5; ) //populate hand array
        {
            //Generate a "random" number between 0-51
            int randomNum = 0 + (int)(Math.random() * ((51-0) + 1));
            //if statement checks if card has already been dealt
            if(cardsInDeck[randomNum] == false)
            {
            hand1[i] = randomNum;        
            cardsInDeck[randomNum] = true; 
            System.out.println("card " + (i+1) + ": " + Converter.convert(hand[i]));
            i++;
            }
        }
      
    }

}
