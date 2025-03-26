/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author leandrogg
 */
@Entity
public class Tracking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_tracking;
    @OneToMany(mappedBy="track")
    private List<Notes> list_notes;

    public Tracking() {
    }
    
    public Tracking(int id_tracking, List<Notes> list_notes) {
        this.id_tracking = id_tracking;
        this.list_notes = list_notes;
    }

    public List<Notes> getList_notes() {
        return list_notes;
    }

    public void setList_notes(List<Notes> list_notes) {
        this.list_notes = list_notes;
    }
    
    public int getId_tracking() {
        return id_tracking;
    }

    public void setId_tracking(int id_tracking) {
        this.id_tracking = id_tracking;
    } 
}
