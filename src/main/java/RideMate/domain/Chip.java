package RideMate.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by User on 2015/05/10.
 */
@Entity
public class Chip implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="cycler_id")
    private Cycler cycler;

    public Chip(){

    }

    public Chip(Builder builder){
        id = builder.id;
        cycler = builder.cycler;
    }
    public Cycler getCyclerID(){return cycler;}

    public Long getChipID(){return id;}

    public static class Builder{
        private Long id;
        private Cycler cycler;

        public Builder(Cycler value){
            this.cycler = value;
        }
        public Builder id(Long value){
            this.id = value;
            return this;
        }
        public Builder copy(Chip value){
            this.id = value.id;
            this.cycler = value.cycler;
            return this;
        }
    public Chip build() {
        return new Chip(this);
    }
    }
}
