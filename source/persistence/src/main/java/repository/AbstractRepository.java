package repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.io.Serializable;

public class AbstractRepository<ID,T>
{
    private SessionFactory factory;

    protected AbstractRepository()
    {

    }

    protected void setFactory(SessionFactory factory)
    {
        this.factory = factory;
    }

    protected int sizeGeneric(String className) throws RepositoryException
    {
        int nr=0;
        Transaction transaction=null;
        try(Session session =factory.openSession())
        {
            transaction=session.beginTransaction();
            nr=( (Integer) session.createQuery("select count(*) from "+className ).iterate().next() ).intValue();
            transaction.commit();
        }
        catch (Exception e)
        {
            if(transaction!=null)
                transaction.rollback();
            throw new RepositoryException(e);
        }
        return 0;
    }

    protected void saveGeneric(T entity) throws RepositoryException
    {
        Transaction transaction=null;
        try(Session session = factory.openSession())
        {

            transaction=session.beginTransaction();
            session.save(entity);
            transaction.commit();
        }
        catch (Exception e)
        {
            if(transaction!=null)
                transaction.rollback();
            throw new RepositoryException(e);
        }
    }

    protected void deleteGeneric(T t) throws RepositoryException
    {
        Transaction transaction = null;
        try(Session session= factory.openSession())
        {
            transaction=session.beginTransaction();
            session.delete(t);
            transaction.commit();
        }
        catch (Exception e)
        {
            if (transaction != null)
               transaction.rollback();
            throw new RepositoryException(e);
        }
    }

    protected void updateGeneric( T entity) throws RepositoryException
    {
        Transaction transaction = null;
        try(Session session = factory.openSession())
        {
            transaction= session.beginTransaction();
            session.update(entity);
            transaction.commit();
        }
        catch (Exception e)
        {
            if(transaction!=null)
                transaction.rollback();
            throw  new RepositoryException(e);
        }
    }

    protected T findOneGeneric(ID id,Class<T> tClass) throws RepositoryException
    {
        Transaction transaction = null;
        T address=null;
        try(Session session= factory.openSession())
        {
            transaction= session.beginTransaction();

           address = session.get(tClass, (Serializable) id);
            transaction.commit();
        }
        catch (Exception e)
        {
            if(transaction!=null)
                transaction.rollback();
            throw new RepositoryException(e);
        }
        return address;
    }

    protected Iterable<T> findAllGeneric(String className) throws RepositoryException
    {
        Transaction transaction = null;
        Iterable<T> addresses = null;
        try(Session session= factory.openSession())
        {
            transaction= session.beginTransaction();
            addresses= session.createQuery("from "+className).list();
            transaction.commit();
        }
        catch (Exception e)
        {
            if(transaction!=null)
               transaction.rollback();
            throw new RepositoryException(e);
        }
        return addresses;
    }
}
