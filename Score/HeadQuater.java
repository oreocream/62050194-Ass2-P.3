package Score;

import java.util.ArrayList;

public class HeadQuater implements Source {
    private final ArrayList<MyObserver> list;
    private String score;

    public HeadQuater() {
        this.list = new ArrayList<MyObserver>();
    }
    public void setscore(String aData) {
        score = aData;
        notifyObservers();
    }
    public String getscore() {
	    return score;
    }
    @Override
    public void register (MyObserver observer) {
        list.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (int j = 0; j < list.size(); ++j) {
            list.get(j).update(this);
	    }
    }
}