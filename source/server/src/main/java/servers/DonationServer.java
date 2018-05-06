package servers;

import domain.Donor;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import repository.AddressRepository;
import repository.DonorRepository;
import services.IDonationObserverServer;
import services.IDonationServer;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class DonationServer implements IDonationServer {
    private DonorRepository donorRepository;
    private AddressRepository addressRepository;
    private static SessionFactory sessionFactory;
    private Map<String, IDonationObserverServer> loggedClients;


    public DonationServer(DonorRepository donorRepository, AddressRepository addressRepository) {
        this.donorRepository = donorRepository;
        this.addressRepository = addressRepository;
        loggedClients = new ConcurrentHashMap<>();
        initialize();
        donorRepository.setFactory(sessionFactory);
        addressRepository.setFactory(sessionFactory);
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
            System.out.println(((Donor) user).getPasssord());
            return true;
        }


        return false;

    }
}
