/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author leandrogg
 */
@Entity
public class Patient extends Person{
    private boolean is_insurance;
    @OneToMany(mappedBy="pati")
    private List<Turn> list_turn;
    @OneToOne
    private Tracking a_patient_tracking;
    
    public Patient() {
    }

    public Patient(boolean is_insurance, List<Turn> list_turn, Tracking a_patient_tracking, int id, String dni, String name, String last_name, String phone, String adress, Date birth_date) {
        super(id, dni, name, last_name, phone, adress, birth_date);
        this.is_insurance = is_insurance;
        this.list_turn = list_turn;
        this.a_patient_tracking = a_patient_tracking;
    }

    public Tracking getA_patient_tracking() {
        return a_patient_tracking;
    }

    public void setA_patient_tracking(Tracking patient_tracking) {
        this.a_patient_tracking = patient_tracking;
    }
    
    public List<Turn> getList_turn() {
        return list_turn;
    }

    public void setList_turn(List<Turn> list_turn) {
        this.list_turn = list_turn;
    }

    public boolean isIs_insurance() {
        return is_insurance;
    }

    public void setIs_insurance(boolean is_insurance) {
        this.is_insurance = is_insurance;
    }
    
    
    
}
