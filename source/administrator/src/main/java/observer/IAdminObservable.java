package observer;

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