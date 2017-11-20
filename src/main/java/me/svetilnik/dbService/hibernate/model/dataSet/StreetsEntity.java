package me.svetilnik.dbService.hibernate.model.dataSet;

import me.svetilnik.agentstvo.servlet.model.Model;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "streets", schema = "agentstvo")
public class StreetsEntity extends Model{
    private int idStreets;
    private String streetsName;
    private Collection<LocationEntity> locationsByIdStreets;

    @Id
    @Column(name = "idStreets", nullable = false)
    public int getIdStreets() {
        return idStreets;
    }

    public void setIdStreets(int idStreets) {
        this.idStreets = idStreets;
    }

    @Basic
    @Column(name = "StreetsName", nullable = false, length = 150)
    public String getStreetsName() {
        return streetsName;
    }

    public void setStreetsName(String streetsName) {
        this.streetsName = streetsName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StreetsEntity that = (StreetsEntity) o;

        if (idStreets != that.idStreets) return false;
        if (streetsName != null ? !streetsName.equals(that.streetsName) : that.streetsName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idStreets;
        result = 31 * result + (streetsName != null ? streetsName.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "streetsByLocationStreet" )
    public Collection<LocationEntity> getLocationsByIdStreets() {
        return locationsByIdStreets;
    }

    public void setLocationsByIdStreets(Collection<LocationEntity> locationsByIdStreets) {
        this.locationsByIdStreets = locationsByIdStreets;
    }
}
