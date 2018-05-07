package repository;

import domain.Location;
import domain.MedicalCenter;
import org.hibernate.SessionFactory;

public class MedicalCenterRepository extends AbstractRepository<Integer, MedicalCenter> implements IRepository<Integer, MedicalCenter>
{

    @Override
    public int size() throws RepositoryException
    {
        return sizeGeneric("MedicalCenter");
    }

    @Override
    public void save(MedicalCenter entity) throws RepositoryException
    {
        saveGeneric(entity);
    }

    @Override
    public void delete(Integer integer) throws RepositoryException
    {
        deleteGeneric(new MedicalCenter(integer,new Location(2)));
    }

    @Override
    public void update(MedicalCenter entity) throws RepositoryException
    {
        updateGeneric(entity);
    }

    @Override
    public MedicalCenter findOne(Integer integer) throws RepositoryException
    {
        return findOneGeneric(integer, MedicalCenter.class);
    }

    @Override
    public Iterable<MedicalCenter> findAll() throws RepositoryException
    {
        return findAllGeneric("MedicalCenter");
    }
    @Override
    public void setFactory(SessionFactory factory)
    {
        super.setFactory(factory);
    }
}
