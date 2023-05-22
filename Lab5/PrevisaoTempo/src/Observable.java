public interface Observable {
    //will countain a list of the observers and will provide methods to add, remove, and notify the observer
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
