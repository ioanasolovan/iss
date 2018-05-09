package services;

import domain.Address;
import domain.Donor;
import domain.DonorRequestForm;

import java.util.List;

public interface IDonationServer {
    boolean login(Object user, IDonationObserverServer client);
    boolean register(Object user);

    Integer saveAddress(Address adr);

    Address findAddress(Integer id);

    void saveDonor(Donor donor);

    Integer saveDonorRequestForm(DonorRequestForm form);

    List<DonorRequestForm> getAllDonorRequestsByUsername(String username);

    Iterable<DonorRequestForm> getAllDonorRequests();

    Iterable<Address> findAllAddresses() ;

    Iterable<Donor> findAllDonors();

    Donor findDonor(String id);
}
