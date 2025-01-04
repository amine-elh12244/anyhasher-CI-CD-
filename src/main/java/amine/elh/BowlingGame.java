package amine.elh;

public class BowlingGame {

    private int roll=0;
    private int[] rolles =new int[21];



    public void roll(int pinsDown) {
        rolles[roll++]=pinsDown;
    }

    public int score() {
        int score = 0;
        int cursor=0;

        for(int frame=0; frame<10; frame++) {
            if (isSpare(cursor)){
                score+=10+rolles[cursor+2];
                cursor+=2;

            }
            else {
                score += rolles[cursor] + rolles[cursor + 1];
                cursor += 2;
            }
        }

        return score;
    }

    private boolean isSpare(int cursor) {
        return rolles[cursor] + rolles[cursor + 1] == 10;
    }
}
