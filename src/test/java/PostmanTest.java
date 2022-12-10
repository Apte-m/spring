import endpoint.Get;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.ConfigFileApplicationContextInitializer;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;



@RunWith(SpringRunner.class)
@ContextConfiguration(initializers = ConfigFileApplicationContextInitializer.class,classes = Get.class)
@ActiveProfiles("test")
public class PostmanTest {

    @Autowired
    Get get;


    @Test
    public void exampleTest() {
        get.exampleTest();

    }
}
