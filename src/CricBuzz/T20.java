package CricBuzz;

public class T20 implements MatchType{
    @Override
    public int noOfOvers() {
        return 20;
    }

    @Override
    public int maxBowlerOver() {
        return 4;
    }
}
