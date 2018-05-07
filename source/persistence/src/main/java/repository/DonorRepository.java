package repository;

import domain.Donor;
import org.hibernate.SessionFactory;

public class DonorRepository extends AbstractRepository<String,Donor> implements IRepository<String, Donor>
{
    private SessionFactory factory;


    public SessionFactory getFactory() {
        return factory;
    }


    @Override
    public int size() throws RepositoryException
    {
        return sizeGeneric("Donor");
    }

    @Override
    public void save(Donor entity)throws RepositoryException
    {
        saveGeneric(entity);
    }

    @Override
    public void delete(String s) throws RepositoryException
    {
        Donor d =findOne(s);
        deleteGeneric(d);
    }

    @Override
    public void update( Donor entity) throws RepositoryException
    {
        updateGeneric(entity);
    }

    @Override
    public Donor findOne(String s)throws RepositoryException
    {
        return findOneGeneric(s, Donor.class);
    }

    @Override
    public Iterable<Donor> findAll() throws RepositoryException
    {
        return findAllGeneric("Donor");
    }
    @Override
    public void setFactory(SessionFactory factory)
    {
        super.setFactory(factory);
    }
}
