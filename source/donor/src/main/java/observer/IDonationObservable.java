package observer;

/**
 * 
 */
public interface IDonationObservable {

    /**
     * @param observer
     */
    public void addObserver(IDonationObserver observer);

    /**
     * @param observer
     */
    public void removeObserver(IDonationObserver observer);

    /**
     * 
     */
    public void NotifyObservers();

}