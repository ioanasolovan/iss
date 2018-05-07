package repository;

import org.hibernate.SessionFactory;

public interface IRepository<ID, T>
{

    int size() throws RepositoryException;
    void save(T entity) throws RepositoryException;
    void delete(ID id) throws RepositoryException;
    void update(T entity) throws RepositoryException;
    T findOne(ID id) throws RepositoryException;
    Iterable<T> findAll() throws RepositoryException;
    void setFactory(SessionFactory factory) ;

}