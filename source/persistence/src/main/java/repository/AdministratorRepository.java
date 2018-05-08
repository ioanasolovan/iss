package repository;

import domain.Administrator;
import org.hibernate.SessionFactory;

public class AdministratorRepository extends AbstractRepository<String, Administrator> implements IRepository<String,Administrator>
{
    public AdministratorRepository()
    {
    }

    @Override
    public int size() throws RepositoryException
    {
        return sizeGeneric("Administrator");
    }

    @Override
    public String save(Administrator entity) throws RepositoryException
    {
       return saveGeneric(entity);
    }

    @Override
    public void delete(String string) throws RepositoryException
    {
        deleteGeneric(new Administrator(string));
    }

    @Override
    public void update(Administrator entity) throws RepositoryException
    {
        updateGeneric(entity);
    }

    @Override
    public Administrator findOne(String s) throws RepositoryException
    {
        return findOneGeneric(s, Administrator.class);
    }

    @Override
    public Iterable<Administrator> findAll() throws RepositoryException
    {
        return findAllGeneric("Administrator");
    }
    @Override
    public void setFactory(SessionFactory factory)
    {
        super.setFactory(factory);
    }
}
