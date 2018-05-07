package repository;

import domain.Doctor;
import org.hibernate.SessionFactory;

public class DoctorRepository extends AbstractRepository<Integer, Doctor> implements IRepository<Integer, Doctor>
{


    @Override
    public int size() throws RepositoryException
    {
        return sizeGeneric("Doctor");
    }

    @Override
    public void save(Doctor entity) throws RepositoryException
    {
        saveGeneric(entity);
    }

    @Override
    public void delete(Integer integer) throws RepositoryException
    {
        deleteGeneric(new Doctor(integer));
    }

    @Override
    public void update(Doctor entity) throws RepositoryException
    {
        updateGeneric(entity);
    }

    @Override
    public Doctor findOne(Integer integer) throws RepositoryException
    {
        return findOneGeneric(integer, Doctor.class);
    }

    @Override
    public Iterable<Doctor> findAll() throws RepositoryException
    {
        return findAllGeneric("Doctor");
    }
    @Override
    public void setFactory(SessionFactory factory)
    {
        super.setFactory(factory);
    }
}
