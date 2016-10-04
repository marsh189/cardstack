package edu.chapman.cpsc356.cardstack;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Collections;
import java.util.Stack;

public class MainActivity extends AppCompatActivity {

    private Stack<Card> stackOfCards = new Stack<Card>();
    public static ImageView topSuit;
    public static ImageView bottomSuit;
    public static ImageView centerImg;
    public static TextView topNum;
    public static TextView bottomNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        topSuit = (ImageView)findViewById(R.id.topSuit);
        bottomSuit = (ImageView)findViewById(R.id.bottomSuit);
        centerImg = (ImageView)findViewById(R.id.centerImg);
        topNum = (TextView)findViewById(R.id.topNum);
        bottomNum = (TextView)findViewById(R.id.bottomNum);
        FillStack();
        Card first = stackOfCards.pop();
        first.setSuitImg();
    }

    private void FillStack() {
        for (int x = 1; x <= 4; x++ )
        {
            for (int y = 1; y <= 13; y ++)
            {
                stackOfCards.push(new Card(y,x));
            }
        }
        Collections.shuffle(stackOfCards);
    }

    public void switchCard(View view) {
        if(!stackOfCards.isEmpty())
        {
            Card c = stackOfCards.pop();
            c.setSuitImg();
        }
        else
        {
            Toast.makeText(this, "Deck Is Empty", Toast.LENGTH_SHORT).show();
        }
    }
}
