import ch.bfh.aspfb.CampConfig;
import ch.bfh.aspfb.service.PartyService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("lol generics");
        final AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(CampConfig.class);
        final PartyService partyService = annotationConfigApplicationContext.getBean(PartyService.class);
        partyService.createParty("döner");
        partyService.createParty("bier");
    }
}
