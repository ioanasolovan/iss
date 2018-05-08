package repository;

import domain.DonorRequestForm;
import org.hibernate.SessionFactory;

public class DonorRequestFormRepository extends AbstractRepository<Integer, DonorRequestForm> implements IRepository<Integer,DonorRequestForm>
{

    @Override
    public int size() throws RepositoryException
    {
        return sizeGeneric("DonorRequestForm");
    }

    @Override
    public Integer save(DonorRequestForm entity) throws RepositoryException
    {
       return saveGeneric(entity);
    }

    @Override
    public void delete(Integer integer) throws RepositoryException
    {
        deleteGeneric(findOne(integer));
    }

    @Override
    public void update(DonorRequestForm entity) throws RepositoryException
    {
        updateGeneric(entity);
    }

    @Override
    public DonorRequestForm findOne(Integer integer) throws RepositoryException
    {
        return findOneGeneric(integer, DonorRequestForm.class);
    }

    @Override
    public Iterable<DonorRequestForm> findAll() throws RepositoryException
    {
        return findAllGeneric("DonorRequestForm");
    }
    @Override
    public void setFactory(SessionFactory factory)
    {
        super.setFactory(factory);
    }
}
