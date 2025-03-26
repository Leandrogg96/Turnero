
package logic;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
/**
 *
 * @author leandrogg
 */

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String dni;
    private String name;
    private String last_name;
    private String phone;
    private String adress;
    @Temporal(TemporalType.DATE)
    private Date birth_date;
    
    public Person() {
    }

    public Person(int id, String dni, String name, String last_name, String phone, String adress, Date birth_date) {
        this.id = id;
        this.dni = dni;
        this.name = name;
        this.last_name = last_name;
        this.phone = phone;
        this.adress = adress;
        this.birth_date = birth_date;
    }
    
    public String getDni() {
        return dni;
    }

    public String getName() {
        return name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getPhone() {
        return phone;
    }

    public String getAdress() {
        return adress;
    }

    public Date getBirth_date() {
        return birth_date;
    }
    
    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setBirth_date(Date birth_date) {
        this.birth_date = birth_date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

