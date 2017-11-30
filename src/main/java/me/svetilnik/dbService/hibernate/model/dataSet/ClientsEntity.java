package me.svetilnik.dbService.hibernate.model.dataSet;

import me.svetilnik.agentstvo.servlet.model.Model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Set;

@Entity
@Table(name = "clients", schema = "agentstvo")
public class ClientsEntity extends Model {

    @Id
//    @GeneratedValue
    @Column(name = "idClients", nullable = false)
    private long idClients;

    @Column(name = "SNMClients", nullable = false, length = 150)
    private String snmClients;

    @Column(name = "Floor", nullable = false, length = 45)
    private String floor;

    @Column(name = "PassportClients", nullable = false, length = 45)
    private String passportClients;

    @Column(name = "PhoneClients", nullable = false, length = 45)
    private String phoneClients;

    public long getIdClients() {
        return idClients;
    }

    public void setIdClients(long idClients) {
        this.idClients = idClients;
    }

    public String getSnmClients() {
        return snmClients;
    }

    public void setSnmClients(String snmClients) {
        this.snmClients = snmClients;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getPassportClients() {
        return passportClients;
    }

    public void setPassportClients(String passportClients) {
        this.passportClients = passportClients;
    }

    public String getPhoneClients() {
        return phoneClients;
    }

    public void setPhoneClients(String phoneClients) {
        this.phoneClients = phoneClients;
    }

    @OneToMany(mappedBy = "clientsEntity1", cascade = CascadeType.ALL)
    private Set<DealEntity> dealEntities1;

    public Set<DealEntity> getDealEntities1() {
        return dealEntities1;
    }

    public void setDealEntities1(Set<DealEntity> dealEntities1) {
        this.dealEntities1= dealEntities1;
    }

    @OneToMany(mappedBy = "clientsEntity2", cascade = CascadeType.ALL)
    private Set<DealEntity> dealEntities2;

    public Set<DealEntity> getDealEntities2() {
        return dealEntities2;
    }

    public void setDealEntities2(Set<DealEntity> dealEntities2) {
        this.dealEntities2= dealEntities2;
    }
}
