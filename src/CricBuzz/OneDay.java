package CricBuzz;

public class OneDay implements MatchType{
    @Override
    public int noOfOvers() {
        return 50;
    }

    @Override
    public int maxBowlerOver() {
        return 10;
    }
}
