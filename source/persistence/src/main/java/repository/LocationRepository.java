package repository;

import domain.Location;
import org.hibernate.SessionFactory;

public class LocationRepository extends AbstractRepository<Integer, Location> implements IRepository<Integer, Location>
{

    @Override
    public int size() throws RepositoryException
    {
        return sizeGeneric("Location");
    }

    @Override
    public void save(Location entity) throws RepositoryException
    {
        saveGeneric(entity);
    }

    @Override
    public void delete(Integer integer) throws RepositoryException
    {

        deleteGeneric(findOne(integer));
    }

    @Override
    public void update(Location entity) throws RepositoryException
    {
        updateGeneric(entity);
    }

    @Override
    public Location findOne(Integer integer) throws RepositoryException
    {
        return findOneGeneric(integer, Location.class);
    }

    @Override
    public Iterable<Location> findAll() throws RepositoryException
    {
        return findAllGeneric("Location");
    }
    @Override
    public void setFactory(SessionFactory factory)
    {
        super.setFactory(factory);
    }
}
