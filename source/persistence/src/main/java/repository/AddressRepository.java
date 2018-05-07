package repository;

import domain.Address;
import org.hibernate.SessionFactory;

public class AddressRepository extends AbstractRepository<Integer, Address> implements IRepository<Integer, Address>
{

    public AddressRepository()
    {

    }

    @Override
    public int size() throws RepositoryException
    {
        return sizeGeneric("Address");
    }

    @Override
    public void save(Address entity) throws RepositoryException
    {
        saveGeneric(entity);
    }

    @Override
    public void delete(Integer integer) throws RepositoryException
    {
        deleteGeneric(new Address(integer));
    }

    @Override
    public void update( Address entity) throws RepositoryException
    {
        updateGeneric(entity);
    }

    @Override
    public Address findOne(Integer integer) throws RepositoryException
    {
        return findOneGeneric(integer, Address.class);
    }

    @Override
    public Iterable<Address> findAll() throws RepositoryException
    {
        return findAllGeneric("Address");
    }

    @Override
    public void setFactory(SessionFactory factory)
    {
        super.setFactory(factory);
    }

}
