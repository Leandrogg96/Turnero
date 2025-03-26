/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author leandrogg
 */
@Entity
public class Turn {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_turn;
    @Temporal(TemporalType.DATE)
    private Date turn_date;
    private String turn_hour;
    private String comments;
    @ManyToOne
    @JoinColumn(name="psychologist_id")
    private Psychologist psicho;
    @ManyToOne
    @JoinColumn(name="patient_id")
    private Patient pati;
    
    public Turn() {
    }

    public Turn(int id_turn, Date turn_date, String turn_hour, String comments) {
        this.id_turn = id_turn;
        this.turn_date = turn_date;
        this.turn_hour = turn_hour;
        this.comments = comments;
    }

    public int getId_turn() {
        return id_turn;
    }

    public void setId_turn(int id_turn) {
        this.id_turn = id_turn;
    }

    public Date getTurn_date() {
        return turn_date;
    }

    public void setTurn_date(Date turn_date) {
        this.turn_date = turn_date;
    }

    public String getTurn_hour() {
        return turn_hour;
    }

    public void setTurn_hour(String turn_hour) {
        this.turn_hour = turn_hour;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Psychologist getPsicho() {
        return psicho;
    }

    public void setPsicho(Psychologist psicho) {
        this.psicho = psicho;
    }

    public Patient getPati() {
        return pati;
    }

    public void setPati(Patient pati) {
        this.pati = pati;
    }
}
