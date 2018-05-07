package repository;

import domain.BloodBag;
import org.hibernate.SessionFactory;

public class BloodBagRepository extends AbstractRepository<Integer, BloodBag> implements IRepository<Integer, BloodBag>
{

    @Override
    public int size() throws RepositoryException
    {
        return sizeGeneric("BloodBag");
    }

    @Override
    public void save(BloodBag entity) throws RepositoryException
    {
        saveGeneric(entity);
    }

    @Override
    public void delete(Integer integer) throws RepositoryException
    {
        deleteGeneric(new BloodBag(integer));
    }

    @Override
    public void update(BloodBag entity) throws RepositoryException
    {
        updateGeneric(entity);
    }

    @Override
    public BloodBag findOne(Integer integer) throws RepositoryException
    {
        return findOneGeneric(integer, BloodBag.class);
    }

    @Override
    public Iterable<BloodBag> findAll() throws RepositoryException
    {
        return findAllGeneric("BloodBag");
    }
    @Override
    public void setFactory(SessionFactory factory)
    {
        super.setFactory(factory);
    }
}
