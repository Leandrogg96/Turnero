package logic;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author leandrogg
 */
@Entity
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_schedule;
    private String turn_schedule;

    public Schedule() {
    }

    public Schedule(int id_schedule, String turn_schedule) {
        this.id_schedule = id_schedule;
        this.turn_schedule = turn_schedule;
    }

    public int getId_schedule() {
        return id_schedule;
    }

    public void setId_schedule(int id_schedule) {
        this.id_schedule = id_schedule;
    }

    public String getTurn_schedule() {
        return turn_schedule;
    }

    public void setTurn_schedule(String turn_schedule) {
        this.turn_schedule = turn_schedule;
    }
    
    
    
}
