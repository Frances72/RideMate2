package RideMate.conf.factory;


import RideMate.domain.Chip;
import RideMate.domain.Cycler;

/**
 * Created by User on 2015/05/10.
 */
public class ChipFactory {
    public static Chip createChip(Long id, Cycler cycler){
        Chip chip = new Chip.Builder(cycler).id(id).build();
        return chip;
    }
}
