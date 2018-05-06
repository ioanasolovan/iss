package repository;

import domain.Address;
import org.hibernate.SessionFactory;

public class AddressRepository implements IAddressRepository {
    private SessionFactory factory;

    public SessionFactory getFactory() {
        return factory;
    }

    public void setFactory(SessionFactory factory) {
        this.factory = factory;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void save(Address entity) {

    }

    @Override
    public void delete(Integer integer) {

    }

    @Override
    public void update(Integer integer, Address entity) {

    }

    @Override
    public Address findOne(Integer integer) {
        return null;
    }

    @Override
    public Iterable<Address> findAll() {
        return null;
    }
}
