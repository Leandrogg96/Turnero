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
public class Notes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_note;
    @Temporal(TemporalType.DATE)
    private Date day_note;
    private String commentary;
    
    @ManyToOne
    @JoinColumn(name="tracking_id")
    private Tracking track;

    public Notes() {
    }

    public Notes(int id_note, Date day_note, String commentary) {
        this.id_note = id_note;
        this.day_note = day_note;
        this.commentary = commentary;
    }
    
    public int getId_note() {
        return id_note;
    }

    public void setId_note(int id_note) {
        this.id_note = id_note;
    }

    public Date getDay_note() {
        return day_note;
    }

    public void setDay_note(Date day_note) {
        this.day_note = day_note;
    }

    public String getCommentary() {
        return commentary;
    }

    public void setCommentary(String commentary) {
        this.commentary = commentary;
    }

    public Tracking getTrack() {
        return track;
    }

    public void setTrack(Tracking track) {
        this.track = track;
    }
    
}

