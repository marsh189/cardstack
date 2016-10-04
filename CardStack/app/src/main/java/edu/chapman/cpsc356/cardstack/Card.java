package edu.chapman.cpsc356.cardstack;


import android.graphics.Color;

/**
 * Created by Matt on 10/3/2016.
 */

public class Card
{
    private int cardNum;
    private int cardSuit;

    public Card(int num, int suit)
    {
        cardNum = num;
        cardSuit = suit;
    }

    public void setSuitImg() {
        switch (cardSuit)
        {
            case 1:
                MainActivity.topSuit.setImageResource(R.drawable.heart);
                MainActivity.bottomSuit.setImageResource(R.drawable.heart);
                setNumHearts();
                break;
            case 2:
                MainActivity.topSuit.setImageResource(R.drawable.diamond);
                MainActivity.bottomSuit.setImageResource(R.drawable.diamond);
                setNumDiamonds();
                break;
            case 3:
                MainActivity.topSuit.setImageResource(R.drawable.club);
                MainActivity.bottomSuit.setImageResource(R.drawable.club);
                setNumClub();
                break;
            case 4:
                MainActivity.topSuit.setImageResource(R.drawable.spades);
                MainActivity.bottomSuit.setImageResource(R.drawable.spades);
                setNumSpades();
                break;
            default:
                MainActivity.topSuit.setImageResource(R.drawable.heart);
                MainActivity.bottomSuit.setImageResource(R.drawable.heart);
                setNumHearts();
                break;
        }
    }

    private void setNumSpades() {
        MainActivity.topNum.setTextColor(Color.BLACK);
        MainActivity.bottomNum.setTextColor(Color.BLACK);
        switch (cardNum)
        {
            case 1:
                MainActivity.topNum.setText("A");
                MainActivity.bottomNum.setText("A");
                MainActivity.centerImg.setImageResource(R.drawable.ace_of_spades);
                break;
            case 2:
                MainActivity.topNum.setText("2");
                MainActivity.bottomNum.setText("2");
                MainActivity.centerImg.setImageResource(R.drawable.two_of_spades);
                break;
            case 3:
                MainActivity.topNum.setText("3");
                MainActivity.bottomNum.setText("3");
                MainActivity.centerImg.setImageResource(R.drawable.three_of_spades);
                break;
            case 4:
                MainActivity.topNum.setText("4");
                MainActivity.bottomNum.setText("4");
                MainActivity.centerImg.setImageResource(R.drawable.four_of_spades);
                break;
            case 5:
                MainActivity.topNum.setText("5");
                MainActivity.bottomNum.setText("5");
                MainActivity.centerImg.setImageResource(R.drawable.five_of_spades);
                break;
            case 6:
                MainActivity.topNum.setText("6");
                MainActivity.bottomNum.setText("6");
                MainActivity.centerImg.setImageResource(R.drawable.six_of_spades);
                break;
            case 7:
                MainActivity.topNum.setText("7");
                MainActivity.bottomNum.setText("7");
                MainActivity.centerImg.setImageResource(R.drawable.seven_of_spades);
                break;
            case 8:
                MainActivity.topNum.setText("8");
                MainActivity.bottomNum.setText("8");
                MainActivity.centerImg.setImageResource(R.drawable.eight_of_spades);
                break;
            case 9:
                MainActivity.topNum.setText("9");
                MainActivity.bottomNum.setText("9");
                MainActivity.centerImg.setImageResource(R.drawable.nine_of_spades);
                break;
            case 10:
                MainActivity.topNum.setText("10");
                MainActivity.bottomNum.setText("10");
                MainActivity.centerImg.setImageResource(R.drawable.ten_of_spades);
                break;
            case 11:
                MainActivity.topNum.setText("J");
                MainActivity.bottomNum.setText("J");
                MainActivity.centerImg.setImageResource(R.drawable.jack_of_spades);
                break;
            case 12:
                MainActivity.topNum.setText("Q");
                MainActivity.bottomNum.setText("Q");
                MainActivity.centerImg.setImageResource(R.drawable.queen_of_spades);
                break;
            case 13:
                MainActivity.topNum.setText("K");
                MainActivity.bottomNum.setText("K");
                MainActivity.centerImg.setImageResource(R.drawable.king_of_spades);
                break;
            default:
                MainActivity.topSuit.setImageResource(R.drawable.spades);
                MainActivity.bottomSuit.setImageResource(R.drawable.spades);
                break;
        }
    }

    private void setNumClub() {
        MainActivity.topNum.setTextColor(Color.BLACK);
        MainActivity.bottomNum.setTextColor(Color.BLACK);
        switch (cardNum)
        {
            case 1:
                MainActivity.topNum.setText("A");
                MainActivity.bottomNum.setText("A");
                MainActivity.centerImg.setImageResource(R.drawable.ace_of_clubs);
                break;
            case 2:
                MainActivity.topNum.setText("2");
                MainActivity.bottomNum.setText("2");
                MainActivity.centerImg.setImageResource(R.drawable.two_of_clubs);
                break;
            case 3:
                MainActivity.topNum.setText("3");
                MainActivity.bottomNum.setText("3");
                MainActivity.centerImg.setImageResource(R.drawable.three_of_clubs);
                break;
            case 4:
                MainActivity.topNum.setText("4");
                MainActivity.bottomNum.setText("4");
                MainActivity.centerImg.setImageResource(R.drawable.four_of_clubs);
                break;
            case 5:
                MainActivity.topNum.setText("5");
                MainActivity.bottomNum.setText("5");
                MainActivity.centerImg.setImageResource(R.drawable.five_of_clubs);
                break;
            case 6:
                MainActivity.topNum.setText("6");
                MainActivity.bottomNum.setText("6");
                MainActivity.centerImg.setImageResource(R.drawable.six_of_clubs);
                break;
            case 7:
                MainActivity.topNum.setText("7");
                MainActivity.bottomNum.setText("7");
                MainActivity.centerImg.setImageResource(R.drawable.seven_of_clubs);
                break;
            case 8:
                MainActivity.topNum.setText("8");
                MainActivity.bottomNum.setText("8");
                MainActivity.centerImg.setImageResource(R.drawable.eight_of_clubs);
                break;
            case 9:
                MainActivity.topNum.setText("9");
                MainActivity.bottomNum.setText("9");
                MainActivity.centerImg.setImageResource(R.drawable.nine_of_clubs);
                break;
            case 10:
                MainActivity.topNum.setText("10");
                MainActivity.bottomNum.setText("10");
                MainActivity.centerImg.setImageResource(R.drawable.ten_of_clubs);
                break;
            case 11:
                MainActivity.topNum.setText("J");
                MainActivity.bottomNum.setText("J");
                MainActivity.centerImg.setImageResource(R.drawable.jack_of_clubs);
                break;
            case 12:
                MainActivity.topNum.setText("Q");
                MainActivity.bottomNum.setText("Q");
                MainActivity.centerImg.setImageResource(R.drawable.queen_of_clubs);
                break;
            case 13:
                MainActivity.topNum.setText("K");
                MainActivity.bottomNum.setText("K");
                MainActivity.centerImg.setImageResource(R.drawable.king_of_clubs);
                break;
            default:
                MainActivity.topSuit.setImageResource(R.drawable.club);
                MainActivity.bottomSuit.setImageResource(R.drawable.club);
                break;
        }
    }

    private void setNumDiamonds() {
        MainActivity.topNum.setTextColor(Color.RED);
        MainActivity.bottomNum.setTextColor(Color.RED);
        switch (cardNum)
        {
            case 1:
                MainActivity.topNum.setText("A");
                MainActivity.bottomNum.setText("A");
                MainActivity.centerImg.setImageResource(R.drawable.ace_of_diamonds);
                break;
            case 2:
                MainActivity.topNum.setText("2");
                MainActivity.bottomNum.setText("2");
                MainActivity.centerImg.setImageResource(R.drawable.two_of_diamonds);
                break;
            case 3:
                MainActivity.topNum.setText("3");
                MainActivity.bottomNum.setText("3");
                MainActivity.centerImg.setImageResource(R.drawable.three_of_diamonds);
                break;
            case 4:
                MainActivity.topNum.setText("4");
                MainActivity.bottomNum.setText("4");
                MainActivity.centerImg.setImageResource(R.drawable.four_of_diamonds);
                break;
            case 5:
                MainActivity.topNum.setText("5");
                MainActivity.bottomNum.setText("5");
                MainActivity.centerImg.setImageResource(R.drawable.five_of_diamonds);
                break;
            case 6:
                MainActivity.topNum.setText("6");
                MainActivity.bottomNum.setText("6");
                MainActivity.centerImg.setImageResource(R.drawable.six_of_diamonds);
                break;
            case 7:
                MainActivity.topNum.setText("7");
                MainActivity.bottomNum.setText("7");
                MainActivity.centerImg.setImageResource(R.drawable.seven_of_diamonds);
                break;
            case 8:
                MainActivity.topNum.setText("8");
                MainActivity.bottomNum.setText("8");
                MainActivity.centerImg.setImageResource(R.drawable.eight_of_diamonds);
                break;
            case 9:
                MainActivity.topNum.setText("9");
                MainActivity.bottomNum.setText("9");
                MainActivity.centerImg.setImageResource(R.drawable.nine_of_diamonds);
                break;
            case 10:
                MainActivity.topNum.setText("10");
                MainActivity.bottomNum.setText("10");
                MainActivity.centerImg.setImageResource(R.drawable.ten_of_diamonds);
                break;
            case 11:
                MainActivity.topNum.setText("J");
                MainActivity.bottomNum.setText("J");
                MainActivity.centerImg.setImageResource(R.drawable.jack_of_diamonds);
                break;
            case 12:
                MainActivity.topNum.setText("Q");
                MainActivity.bottomNum.setText("Q");
                MainActivity.centerImg.setImageResource(R.drawable.queen_of_diamonds);
                break;
            case 13:
                MainActivity.topNum.setText("K");
                MainActivity.bottomNum.setText("K");
                MainActivity.centerImg.setImageResource(R.drawable.king_of_diamonds);
                break;
            default:
                MainActivity.topSuit.setImageResource(R.drawable.diamond);
                MainActivity.bottomSuit.setImageResource(R.drawable.diamond);
                break;
        }
    }

    private void setNumHearts()
    {
        MainActivity.topNum.setTextColor(Color.RED);
        MainActivity.bottomNum.setTextColor(Color.RED);
        switch (cardNum)
        {
            case 1:
                MainActivity.topNum.setText("A");
                MainActivity.bottomNum.setText("A");
                MainActivity.centerImg.setImageResource(R.drawable.ace_of_hearts);
                break;
            case 2:
                MainActivity.topNum.setText("2");
                MainActivity.bottomNum.setText("2");
                MainActivity.centerImg.setImageResource(R.drawable.two_of_hearts);
                break;
            case 3:
                MainActivity.topNum.setText("3");
                MainActivity.bottomNum.setText("3");
                MainActivity.centerImg.setImageResource(R.drawable.three_of_hearts);
                break;
            case 4:
                MainActivity.topNum.setText("4");
                MainActivity.bottomNum.setText("4");
                MainActivity.centerImg.setImageResource(R.drawable.four_of_hearts);
                break;
            case 5:
                MainActivity.topNum.setText("5");
                MainActivity.bottomNum.setText("5");
                MainActivity.centerImg.setImageResource(R.drawable.five_of_hearts);
                break;
            case 6:
                MainActivity.topNum.setText("6");
                MainActivity.bottomNum.setText("6");
                MainActivity.centerImg.setImageResource(R.drawable.six_of_hearts);
                break;
            case 7:
                MainActivity.topNum.setText("7");
                MainActivity.bottomNum.setText("7");
                MainActivity.centerImg.setImageResource(R.drawable.seven_of_hearts);
                break;
            case 8:
                MainActivity.topNum.setText("8");
                MainActivity.bottomNum.setText("8");
                MainActivity.centerImg.setImageResource(R.drawable.eight_of_hearts);
                break;
            case 9:
                MainActivity.topNum.setText("9");
                MainActivity.bottomNum.setText("9");
                MainActivity.centerImg.setImageResource(R.drawable.nine_of_hearts);
                break;
            case 10:
                MainActivity.topNum.setText("10");
                MainActivity.bottomNum.setText("10");
                MainActivity.centerImg.setImageResource(R.drawable.ten_of_hearts);
                break;
            case 11:
                MainActivity.topNum.setText("J");
                MainActivity.bottomNum.setText("J");
                MainActivity.centerImg.setImageResource(R.drawable.jack_of_hearts);
                break;
            case 12:
                MainActivity.topNum.setText("Q");
                MainActivity.bottomNum.setText("Q");
                MainActivity.centerImg.setImageResource(R.drawable.queen_of_hearts);
                break;
            case 13:
                MainActivity.topNum.setText("K");
                MainActivity.bottomNum.setText("K");
                MainActivity.centerImg.setImageResource(R.drawable.king_of_hearts);
                break;
            default:
                MainActivity.topSuit.setImageResource(R.drawable.heart);
                MainActivity.bottomSuit.setImageResource(R.drawable.heart);
                break;
        }
    }

}
