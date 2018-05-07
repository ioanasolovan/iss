package repository;

import domain.Patient;
import org.hibernate.SessionFactory;

public class PatientRepository extends AbstractRepository<Integer, Patient> implements IRepository<Integer, Patient>
{

    @Override
    public int size() throws RepositoryException
    {
        return sizeGeneric("Patient");
    }

    @Override
    public void save(Patient entity) throws RepositoryException
    {
        saveGeneric(entity);
    }

    @Override
    public void delete(Integer integer) throws RepositoryException
    {
        Patient p = findOne(integer);
        deleteGeneric(p);
    }

    @Override
    public void update(Patient entity) throws RepositoryException
    {
        updateGeneric(entity);
    }

    @Override
    public Patient findOne(Integer integer) throws RepositoryException
    {
        return findOneGeneric(integer, Patient.class);
    }

    @Override
    public Iterable<Patient> findAll() throws RepositoryException
    {
        return findAllGeneric("Patient");
    }
    @Override
    public void setFactory(SessionFactory factory)
    {
        super.setFactory(factory);
    }
}
