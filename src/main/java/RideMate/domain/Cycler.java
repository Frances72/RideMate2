package RideMate.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by User on 2015/05/10.
 */

@Entity
public class Cycler implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String first;
    private String last;
    private int age;

    private Cycler(){

    }

    private Cycler(Builder builder){
        id=builder.id;
        first = builder.first;
        last = builder.last;
        age = builder.age;
    }
    public Long getId(){return id;}

    public String getFirst(){return first;}

    public String getLast(){return last;}

    public int getAge(){return age;}

    public static class Builder {
        private Long id;
        private String first;
        private String last;
        private int age;


        public Builder(Long id) {
            this.id = id;
        }

        public Builder first(String value) {
            this.first = value;
            return this;
        }

        public Builder last(String value) {
            this.last = value;
            return this;
        }

        public Builder age(int value) {
            this.age = value;
            return this;
        }
        public Builder cop(Cycler value){
            this.id = value.id;
            this.first = value.first;
            this.last = value.last;
            this.age = value.age;
            return this;

        }
        public Cycler build(){
            return new Cycler(this);
        }
    }








}
