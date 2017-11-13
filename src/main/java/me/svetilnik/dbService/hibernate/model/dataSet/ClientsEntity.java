package me.svetilnik.dbService.hibernate.model.dataSet;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "clients", schema = "agentstvo")
public class ClientsEntity {
    private int idClients;
    private String snmClients;
    private String floor;
    private String passportClients;
    private String phoneClients;
    private Collection<DealEntity> dealsByIdClients;
    private Collection<DealEntity> dealsByIdClients_0;

    @Id
    @Column(name = "idClients", nullable = false)
    public int getIdClients() {
        return idClients;
    }

    public void setIdClients(int idClients) {
        this.idClients = idClients;
    }

    @Basic
    @Column(name = "SNMClients", nullable = false, length = 150)
    public String getSnmClients() {
        return snmClients;
    }

    public void setSnmClients(String snmClients) {
        this.snmClients = snmClients;
    }

    @Basic
    @Column(name = "Floor", nullable = false, length = 45)
    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    @Basic
    @Column(name = "PassportClients", nullable = false, length = 45)
    public String getPassportClients() {
        return passportClients;
    }

    public void setPassportClients(String passportClients) {
        this.passportClients = passportClients;
    }

    @Basic
    @Column(name = "PhoneClients", nullable = false, length = 45)
    public String getPhoneClients() {
        return phoneClients;
    }

    public void setPhoneClients(String phoneClients) {
        this.phoneClients = phoneClients;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClientsEntity that = (ClientsEntity) o;

        if (idClients != that.idClients) return false;
        if (snmClients != null ? !snmClients.equals(that.snmClients) : that.snmClients != null) return false;
        if (floor != null ? !floor.equals(that.floor) : that.floor != null) return false;
        if (passportClients != null ? !passportClients.equals(that.passportClients) : that.passportClients != null)
            return false;
        if (phoneClients != null ? !phoneClients.equals(that.phoneClients) : that.phoneClients != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idClients;
        result = 31 * result + (snmClients != null ? snmClients.hashCode() : 0);
        result = 31 * result + (floor != null ? floor.hashCode() : 0);
        result = 31 * result + (passportClients != null ? passportClients.hashCode() : 0);
        result = 31 * result + (phoneClients != null ? phoneClients.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "clientsByDealClient1")
    public Collection<DealEntity> getDealsByIdClients() {
        return dealsByIdClients;
    }

    public void setDealsByIdClients(Collection<DealEntity> dealsByIdClients) {
        this.dealsByIdClients = dealsByIdClients;
    }

    @OneToMany(mappedBy = "clientsByDealClient2")
    public Collection<DealEntity> getDealsByIdClients_0() {
        return dealsByIdClients_0;
    }

    public void setDealsByIdClients_0(Collection<DealEntity> dealsByIdClients_0) {
        this.dealsByIdClients_0 = dealsByIdClients_0;
    }
}
