package Score;

public class ScoreBoard1 implements MyObserver {
    @Override
    public void update(Source o){
        System.out.println("live result(1): " +((HeadQuater)o).getscore());
    }
}
