import Interfaces.Move;

public class Jump implements Move {
    public int CurrentPosition;
    public int PreviousStep;


    @Override
    public boolean isPossible(int NextPosition) {
        return false;
    }

    @Override
    public Move move(int NextPosition) {
        return null;
    }
}
