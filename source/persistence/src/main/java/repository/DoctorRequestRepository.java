package repository;

import domain.DoctorRequest;
import org.hibernate.SessionFactory;

public class DoctorRequestRepository extends AbstractRepository<Integer, DoctorRequest> implements IRepository<Integer, DoctorRequest>
{

    @Override
    public int size() throws RepositoryException
    {
        return sizeGeneric("DoctorRequest");
    }

    @Override
    public Integer save(DoctorRequest entity) throws RepositoryException
    {
       return saveGeneric(entity);
    }

    @Override
    public void delete(Integer integer) throws RepositoryException
    {

        deleteGeneric(findOne(integer));
    }

    @Override
    public void update(DoctorRequest entity) throws RepositoryException
    {
        updateGeneric(entity);
    }

    @Override
    public DoctorRequest findOne(Integer integer) throws RepositoryException
    {
        return findOneGeneric(integer, DoctorRequest.class);
    }

    @Override
    public Iterable<DoctorRequest> findAll() throws RepositoryException
    {
        return findAllGeneric("DoctorRequest");
    }
    @Override
    public void setFactory(SessionFactory factory)
    {
        super.setFactory(factory);
    }
}
