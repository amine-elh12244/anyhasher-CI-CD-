package amine.elh;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.CoreMatchers.*;



public class BowlingGameTest {

    private BowlingGame game;

    
    @Before
    public void setUp() {
        game = new BowlingGame();
    }

    @Test
    public void CanMakeGame(){
        new BowlingGame();
    }

    @Test
    public void CanRollBall(){
        game.roll(0);
    }

    @Test
    public void CanMAkeGutterGame(){
        roll(20,0);
        assertThat(game.score(),is(0));
    }

    @Test
    public void CanMakeGameOfOnes(){
        roll(20,1);
        assertThat(game.score(),is(20));

    }

    @Test
    public void CanScoreSpareThenThree(){
        game.roll(5);
        game.roll(5);
        game.roll(3);
        roll(17,0);
        assertThat(game.score(),is(16));
    }



    public void roll(int times ,int pinsDown ){
        for (int i=0; i<times; i++) {
            game.roll(pinsDown);
        }
    }
}
