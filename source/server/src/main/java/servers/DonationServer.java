package servers;

import domain.Donor;
import domain.DonorRequestForm;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import repository.*;
import services.IDonationObserverServer;
import services.IDonationServer;

import java.util.HashMap;
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

    public DonationServer(DonorRepository donorRepository, AddressRepository addressRepository, DoctorRepository doctorRepository, AdministratorRepository administratorRepository, DoctorRequestRepository doctorRequestRepository, PatientRepository patientRepository, BloodBagRepository bloodBagRepository, LocationRepository locationRepository, DonorRequestFormRepository donorRequuestForm, MedicalCenterRepository medicalCenterRepository)
    {
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
                .configure() // configures settings from hibernate.cfg.xml
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
            System.out.println("bla ,bla");
            System.out.println(((Donor) user).getPassword());
            return true;
        }


        return false;

    }
}
