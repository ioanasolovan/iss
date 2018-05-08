package repository;


public interface IRepositoryGeneric<ID, T> {
    int size() ;


    ID save(T entity) throws RepositoryException;
    void delete(T t) throws RepositoryException;
    void update(T t) throws RepositoryException;
    T findOne(ID id, Class<T> tClass) throws RepositoryException;
    Iterable<T> findAll(String className) throws RepositoryException;
}