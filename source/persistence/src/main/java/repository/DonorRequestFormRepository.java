package repository;

import domain.DonorRequestForm;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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


    public List<DonorRequestForm> findDonorRequestbyUsername(String username) throws RepositoryException {
      List<DonorRequestForm> lista = new ArrayList<>();
        findAll().forEach(lista::add);
        return lista.stream().filter(x->x.getUsername().equals(username)).collect(Collectors.toList());
    }
}
