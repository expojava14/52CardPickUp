package edu.uweo.javaintro.carddeck;

public class Converter 
{
       
    public static String convert(int arrayValue)
    {
        int value = arrayValue;
        String suit = null;
        String rank = null;
        
        if (value / 13 == 0)
            suit = "Hearts";
        if (value / 13 == 1)
            suit = "Clubs";
        if (value / 13 == 2)
            suit = "Diamonds";
        if (value / 13 == 3)
            suit = "Spades";
        
        if (value % 13 == 12)
            rank = "Ace";
        if (value % 13 == 11)
            rank = "King";            
        if (value % 13 == 10)
            rank = "Queen";
        if (value % 13 == 9)
            rank = "Jack";
        if (value % 13 < 9)
        {
            value = (value%13)+2;
            String value_ = Integer.toString(value);
            rank = value_;            
        }
        String convertedValue = (rank + " of " + suit);
        return convertedValue;
    }
}
    
    