package RideMate.repository;

import RideMate.App;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import org.testng.annotations.Test;

/**
 * Created by User on 2015/05/11.
 */

@SpringApplicationConfiguration(classes= App.class)
@WebAppConfiguration
public class CyclerCrudTest extends AbstractTestNGSpringContextTests{

    private Long id;
    private String first;
    private String last;
    private int age;

    @Autowired
    private CyclerRepository repository;

    @Test
    public void create() throws Exception {

       /* Cycler cycler = CyclerFactory.createCycler("1", "John", "Wayne", "55");


        @Test
        public void create() throws Exception{
           Cycler cycler = new Cycler.Builder("12343").first("Maddy").last("Laine").age("33").build();
            repository.save(cycler);
            id=cycler.getId();
            Assert.assertNotNull(cycler.getId());

        }



        @Test(dependsOnMethods = "create")
        public void read ()throws Exception {
            Cycler cycler = repository.findOne(id);
            Assert.assertNotNull(cycler.getCyclerID());
            Assert.assertEquals("1", cycler.getCyclerID().cycler.getFirst().cycler.getLast().cycler.getAge());

        }

        @Test(dependsOnMethods = "read")
        public void update ()throws Exception {

        }

        @Test(dependsOnMethods = "update")
        public void delete ()throws Exception {
            Cycler cycler = repository.findOne(id);
            repository.delete(cycler);
            Cycler deletedCycler = repository.findOne(id);
            Assert.assertNull(deletedCycler);


        }

*/
    }


}