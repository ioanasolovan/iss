package observer;

import java.util.*;

/**
 * 
 */
public interface ICentruObservable {

    /**
     * @param observer:ICentruObserver
     */
    public void addObserver(ICentruObserver observer);

    /**
     * @param observer:ICentruObserver
     */
    public void removeObserver(ICentruObserver observer);

    /**
     * 
     */
    public void notifyObservers();

}