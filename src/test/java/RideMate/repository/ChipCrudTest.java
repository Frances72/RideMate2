package RideMate.repository;

import RideMate.App;
import RideMate.domain.Cycler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import org.testng.annotations.Test;

/**
 * Created by User on 2015/05/10.
 */

@SpringApplicationConfiguration(classes= App.class)
@WebAppConfiguration
public class ChipCrudTest extends AbstractTestNGSpringContextTests {

    private Long id;
    private Cycler cycler;

    @Autowired
    private ChipRepository repository;

    @Test
    public void create() throws Exception {
/*
        Chip chip = ChipFactory.createChip("1", "1");


        @Test(dependsOnMethods = "create")
        public void read ()throws Exception {
            Chip chip = repository.findOne(id);
            Assert.assertNotNull(chip1.getChipID());
            Assert.assertEquals("1", chip.getChipID().cycler.getCyclerId());

        }

        @Test(dependsOnMethods = "read")
        public void update ()throws Exception {

        }

        @Test(dependsOnMethods = "update")
        public void delete ()throws Exception {
            Chip chip = repository.findOne(id);
            repository.delete(chip);
            Chip deletedChip = repository.findOne(id);
            Assert.assertNull(deletedChip);


        }*/
    }
}