package RideMate.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by User on 2015/05/10.
 */
@Entity
public class Reading implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="chip_id")
    private Chip chip;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="cycler_id")
    private Cycler cycler;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="reader_id")
    private Reader reader;

    private Date readTime;

    public Reading(){

    }

    public Reading(Builder builder){
        id = builder.id;
        chip = builder.chip;
        cycler = builder.cycler;
        reader = builder.reader;
        readTime = builder.readTime;

    }

    public Long getId(){return id;}
    public Chip getChip(){return chip;}
    public Cycler getCycler(){return cycler;}
    public Reader getReader(){return reader;}
    public Date getReadTime(){return readTime;}

    public static class Builder{
        private long id;
        private Chip chip;
        private Cycler cycler;
        private Reader reader;
        private Date readTime;

        public Builder(Long value){
            this.id = value;
        }
        public Builder chip(Chip value){
            this.chip = value;
            return this;
        }
        public Builder cycler(Cycler value){
            this.cycler = value;
            return this;

        }
        public Builder reader(Reader value){
            this.reader = value;
            return this;
        }
        public Builder readTime(Date value){
            this.readTime = value;
            return this;
        }
        public Builder copy(Reading value){
            this.chip = value.chip;
            this.cycler = value.cycler;
            this.reader = value.reader;
            this.readTime = value.readTime;
            return this;
        }

        public Reading build(){
            return new Reading(this);
        }
    }
}
