import controllers.AuthenticationController;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.DoctorClientService;
import services.IDonationServer;

public class StartClient extends Application {
    public static void main(String[] args) {
        launch(args);

    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        try {

            ApplicationContext factory = new ClassPathXmlApplicationContext("classpath:spring-client.xml");
            IDonationServer server=(IDonationServer)factory.getBean("donationService");
            System.out.println("Obtained a reference to remote chat server");
            DoctorClientService ctrl=new DoctorClientService(server);


            FXMLLoader loader;
            Parent root;

            loader = new FXMLLoader(getClass().getResource("/auth.fxml"));
            root = loader.load();

            AuthenticationController lc = loader.getController();
            lc.setClientService(ctrl);

            Scene scene = new Scene(root);
            primaryStage.setScene(scene);

            primaryStage.setOnCloseRequest(event -> {
                Platform.exit();
                System.exit(0);
            });
            primaryStage.show();


        } catch (Exception e) {
            System.err.println("Chat Initialization  exception:"+e);
            e.printStackTrace();
        }
    }
}
