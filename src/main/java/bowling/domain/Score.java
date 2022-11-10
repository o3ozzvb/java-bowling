package bowling.domain;

import java.util.Objects;

public class Score {
    private final int score;
    private final int nextScoreCnt;

    public Score(int score, int nextScoreCnt) {
        this.score = score;
        this.nextScoreCnt = nextScoreCnt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Score score1 = (Score) o;
        return score == score1.score && nextScoreCnt == score1.nextScoreCnt;
    }

    @Override
    public int hashCode() {
        return Objects.hash(score, nextScoreCnt);
    }

    public boolean canCalculate() {
        return this.nextScoreCnt == 0;
    }

    public Score addScore(Score nextScore) {
        return new Score(this.score + nextScore.score, this.nextScoreCnt - 1);
    }

    public int getScore() {
        return score;
    }
}
