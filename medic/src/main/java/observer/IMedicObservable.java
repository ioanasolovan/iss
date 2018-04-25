package observer;

import java.util.*;

/**
 * 
 */
public interface IMedicObservable {

    /**
     * @param observer 
     * @return
     */
    public void addObserver(IMedicObserver observer);

    /**
     * @param observer 
     * @return
     */
    public void removeObserver(IMedicObserver observer);

    /**
     * @return
     */
    public void notifyObservers();

}