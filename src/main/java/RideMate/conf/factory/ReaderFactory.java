package RideMate.conf.factory;

import RideMate.domain.Reader;

/**
 * Created by User on 2015/05/10.
 */

public class ReaderFactory {
    public static Reader createReader(Long id, Double distance){
        Reader reader = new Reader.Builder(id). distance(distance).build();
        return reader;
    }
}
