package services;

import domain.Address;
import domain.Donor;

public interface IDonationServer {
    boolean login(Object user, IDonationObserverServer client);
    boolean register(Object user);

    Integer saveAddress(Address adr);

    Address findAddress(Integer id);

    void saveDonor(Donor donor);
}
