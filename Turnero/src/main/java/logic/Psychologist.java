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
public class Psychologist extends Person{
    private String specialty;
    @OneToMany(mappedBy="psicho")
    private List<Turn> list_turn;
    @OneToOne
    private User a_user;
    @OneToOne
    private Schedule a_schedule;
    @OneToOne
    private Diary a_diary;

    public Psychologist() {
    }

    public Psychologist(String specialty, List<Turn> list_turn, User a_user, Schedule a_schedule, Diary a_diary, int id, String dni, String name, String last_name, String phone, String adress, Date birth_date) {
        super(id, dni, name, last_name, phone, adress, birth_date);
        this.specialty = specialty;
        this.list_turn = list_turn;
        this.a_user = a_user;
        this.a_schedule = a_schedule;
        this.a_diary = a_diary;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public List<Turn> getList_turn() {
        return list_turn;
    }

    public void setList_turn(List<Turn> list_turn) {
        this.list_turn = list_turn;
    }

    public User getA_user() {
        return a_user;
    }

    public void setA_user(User a_user) {
        this.a_user = a_user;
    }

    public Schedule getA_schedule() {
        return a_schedule;
    }

    public void setA_schedule(Schedule a_schedule) {
        this.a_schedule = a_schedule;
    }

    public Diary getA_diary() {
        return a_diary;
    }

    public void setA_diary(Diary a_diary) {
        this.a_diary = a_diary;
    }
    
    
    
    
}
