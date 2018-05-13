package servers;

import domain.Address;
import domain.Doctor;
import domain.Donor;
import domain.DonorRequestForm;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import repository.*;
import services.IDonationObserverServer;
import services.IDonationServer;

import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


public class DonationServer implements IDonationServer {
    private DonorRepository donorRepository;
    private AddressRepository addressRepository;
    private DoctorRepository doctorRepository;
    private AdministratorRepository administratorRepository;
    private DoctorRequestRepository doctorRequestRepository;
    private PatientRepository patientRepository;
    private BloodBagRepository bloodBagRepository;
    private LocationRepository locationRepository;
    private DonorRequestFormRepository donorRequuestForm;
    private MedicalCenterRepository medicalCenterRepository;

    private static SessionFactory sessionFactory;
    private Map<String, IDonationObserverServer> loggedClients;

    public DonationServer(DonorRepository donorRepository, AddressRepository addressRepository, DoctorRepository doctorRepository, AdministratorRepository administratorRepository, DoctorRequestRepository doctorRequestRepository, PatientRepository patientRepository, BloodBagRepository bloodBagRepository, LocationRepository locationRepository, DonorRequestFormRepository donorRequuestForm, MedicalCenterRepository medicalCenterRepository) {
        this.donorRepository = donorRepository;
        this.addressRepository = addressRepository;
        this.doctorRepository = doctorRepository;
        this.administratorRepository = administratorRepository;
        this.doctorRequestRepository = doctorRequestRepository;
        this.patientRepository = patientRepository;
        this.bloodBagRepository = bloodBagRepository;
        this.locationRepository = locationRepository;
        this.donorRequuestForm = donorRequuestForm;
        this.medicalCenterRepository = medicalCenterRepository;
        loggedClients = new HashMap<>();
        initialize();
        setSessionFactoryes();
       // System.out.println(getAllDonorRequestsByUsername("dragos").size());
    }

    private void setSessionFactoryes()
    {
        this.donorRepository.setFactory(sessionFactory);
        this.addressRepository.setFactory(sessionFactory);
        this.doctorRepository.setFactory(sessionFactory);
        this.administratorRepository.setFactory(sessionFactory);
        this.doctorRequestRepository.setFactory(sessionFactory);
        this.patientRepository.setFactory(sessionFactory);
        this.bloodBagRepository.setFactory(sessionFactory);
        this.locationRepository.setFactory(sessionFactory);
        this.donorRequuestForm.setFactory(sessionFactory);
        this.medicalCenterRepository.setFactory(sessionFactory);
    }

    private void initialize() {
        // A SessionFactory is set up once for an application!
        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure("hibernate.cfg.xml") // configures settings from hibernate.cfg.xml
                .build();
        try {
            sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
        } catch (Exception e) {
            System.out.println("Exceptie " + e);
            StandardServiceRegistryBuilder.destroy(registry);
        }
    }

    @Override
    public boolean login(Object user, IDonationObserverServer client) {
        if(user instanceof Donor){
            try {
                Donor donor = donorRepository.findOne( ((Donor) user).getUsername());
                if(donor.getPassword().equals(((Donor) user).getPassword()))
                    return true;
            } catch (RepositoryException e) {
                return false;
            }
        }
        if(user instanceof Doctor){
            try {
                Doctor doctor = doctorRepository.findOne( ((Doctor) user).getUsername());
                if(doctor.getPassword().equals(((Doctor) user).getPassword()))
                    return true;
            } catch (RepositoryException e) {
                return false;
            }
        }


        return false;

    }

    @Override
    public boolean register(Object user) {
        if(user instanceof Donor){
            try {
                donorRepository.save((Donor)user);
                return true;
            } catch (RepositoryException e) {
                return false;
            }
        }
        if(user instanceof Doctor){
            try {
                doctorRepository.save((Doctor)user);
                return true;
            }catch (RepositoryException e){
                return false;
            }
        }
        return false;
    }

    @Override
    public Integer saveAddress(Address adr) {
        try {
            return addressRepository.save(adr);
        } catch (RepositoryException e) {
            return null;
        }
    }

    @Override
    public Address findAddress(Integer id) {
        try {
            return addressRepository.findOne(id);
        } catch (RepositoryException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void saveDonor(Donor donor) {
        try {
            donorRepository.save(donor);
        } catch (RepositoryException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Integer saveDonorRequestForm(DonorRequestForm form) {
        try {
            return donorRequuestForm.save(form);
        } catch (RepositoryException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public List<DonorRequestForm> getAllDonorRequestsByUsername(String username) {
        try {
            return donorRequuestForm.findDonorRequestbyUsername(username);
        } catch (RepositoryException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public Iterable<DonorRequestForm> getAllDonorRequests() {
        try {
            return donorRequuestForm.findAll();
        } catch (RepositoryException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Iterable<Address> findAllAddresses()  {
        try {
            return addressRepository.findAll();
        } catch (RepositoryException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Iterable<Donor> findAllDonors() {
        try {
            return donorRepository.findAll();
        } catch (RepositoryException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Donor findDonor(String id) {
        try {
            return donorRepository.findOne(id);
        } catch (RepositoryException e) {
            e.printStackTrace();
        }
        return null;
    }
}
