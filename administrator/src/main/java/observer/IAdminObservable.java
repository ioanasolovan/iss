package observer;

import java.util.*;

/**
 * 
 */
public interface IAdminObservable {

    /**
     * @param observer
     */
     void addObserver(IAdministratorObserver observer);

    /**
     * @param observer
     */
     void removeObserver(IAdministratorObserver observer);

    /**
     * 
     */
     void notifyObservers();

}