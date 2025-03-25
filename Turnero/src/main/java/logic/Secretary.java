/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

/**
 *
 * @author leandrogg
 */
@Entity
public class Secretary extends Person{
    private String sector;
    @OneToOne
    private User a_user;

    public Secretary() {
    }

    public Secretary(String sector, User a_user, int id, String dni, String name, String last_name, String phone, String adress, Date birth_date) {
        super(id, dni, name, last_name, phone, adress, birth_date);
        this.sector = sector;
        this.a_user = a_user;
    }
    
     public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public User getA_user() {
        return a_user;
    }

    public void setA_user(User a_user) {
        this.a_user = a_user;
    }
    
    
}
