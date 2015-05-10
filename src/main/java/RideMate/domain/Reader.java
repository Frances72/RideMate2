package RideMate.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by User on 2015/05/10.
 */
@Entity
public class Reader implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private Double distance;

    public Reader(){

    }

    public Reader(Builder builder){
        id= builder.id;
        distance = builder.distance;
    }

    public Double getDistance(){return distance;}

    public Long getId(){return id;}

    public static class Builder{
        private Long id;
        private Double distance;

        public Builder(Long value){
            this.id = value;
        }
        public Builder distance(Double value){
            this.distance = value;
            return this;
        }
        public Builder copy (Reader value){
            this.id = value.id;
            this.distance = value.distance;
            return this;
        }
        public Reader build(){
            return new Reader(this);
        }
    }
}
