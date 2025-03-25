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
    private Date day_not;
    private String commentary;
    
    @ManyToOne
    @JoinColumn(name="")
    private Tracking track;

    public Notes() {
    }

    public Notes(int id_note, Date day_not, String commentary) {
        this.id_note = id_note;
        this.day_not = day_not;
        this.commentary = commentary;
    }
    
    public int getId_note() {
        return id_note;
    }

    public void setId_note(int id_note) {
        this.id_note = id_note;
    }

    public Date getDay_not() {
        return day_not;
    }

    public void setDay_not(Date day_not) {
        this.day_not = day_not;
    }

    public String getCommentary() {
        return commentary;
    }

    public void setCommentary(String commentary) {
        this.commentary = commentary;
    }
    
    
}

