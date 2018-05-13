package repository;

import domain.Doctor;
import org.hibernate.SessionFactory;

public class DoctorRepository extends AbstractRepository<String, Doctor> implements IRepository<String, Doctor>
{


    @Override
    public int size() throws RepositoryException
    {
        return sizeGeneric("Doctor");
    }

    @Override
    public String  save(Doctor entity) throws RepositoryException
    {
       return saveGeneric(entity);
    }

    @Override
    public void delete(String string) throws RepositoryException
    {
        Doctor doctor = findOne(string);
        deleteGeneric(doctor);
    }

    @Override
    public void update(Doctor entity) throws RepositoryException
    {
        updateGeneric(entity);
    }

    @Override
    public Doctor findOne(String string) throws RepositoryException
    {
        return findOneGeneric(string, Doctor.class);
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
