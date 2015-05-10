package RideMate.conf.factory;

import RideMate.domain.Cycler;

/**
 * Created by User on 2015/05/10.
 */
public class CyclerFactory {
    public static Cycler cycler (Long id, String first, String last, int age){
        Cycler cycler = new Cycler.Builder(id).first(first).last(last).age(age).build();
        return cycler;
    }
}
