package repository;

import domain.Donor;
import org.hibernate.SessionFactory;

public class DonorRepository implements IDonorRepository {
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
    public void save(Donor entity) {

    }

    @Override
    public void delete(String s) {

    }

    @Override
    public void update(String s, Donor entity) {

    }

    @Override
    public Donor findOne(String s) {
        return null;
    }

    @Override
    public Iterable<Donor> findAll() {
        return null;
    }
}
