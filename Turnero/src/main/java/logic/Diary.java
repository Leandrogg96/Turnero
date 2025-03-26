/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author leandrogg
 */

@Entity
public class Diary implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_diary;
    @Temporal(TemporalType.DATE)
    private Date date;
    @OneToMany(mappedBy="diary")
    private List<Session> a_session;
    private String observation;

    public Diary() {
    }

    public Diary(int id_diary, Date date, List<Session> a_session, String observation) {
        this.id_diary = id_diary;
        this.date = date;
        this.a_session = a_session;
        this.observation = observation;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getId_diary() {
        return id_diary;
    }

    public void setId_diary(int id_diary) {
        this.id_diary = id_diary;
    }

    public List<Session> getA_session() {
        return a_session;
    }

    public void setA_session(List<Session> a_session) {
        this.a_session = a_session;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }
    
}
