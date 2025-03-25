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
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author leandrogg
 */
@Entity
public class Session {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_session;
    @OneToOne
    private Patient a_patient;
    @Temporal(TemporalType.DATE)
    private Date session_date;
    private String notes;
    
    @ManyToOne
    @JoinColumn(name="")
    private Diary sess;
    
    public Session() {
    }

    public Session(int id_session, Patient a_patient, Date session_date, String notes) {
        this.id_session = id_session;
        this.a_patient = a_patient;
        this.session_date = session_date;
        this.notes = notes;
    }

    public int getId_session() {
        return id_session;
    }

    public void setId_session(int id_session) {
        this.id_session = id_session;
    }

    public Patient getA_patient() {
        return a_patient;
    }

    public void setA_patient(Patient a_patient) {
        this.a_patient = a_patient;
    }

    public Date getSession_date() {
        return session_date;
    }

    public void setSession_date(Date session_date) {
        this.session_date = session_date;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String comments) {
        this.notes = comments;
    }
    
    
}

