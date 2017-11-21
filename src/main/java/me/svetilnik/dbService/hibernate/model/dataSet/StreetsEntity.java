package me.svetilnik.dbService.hibernate.model.dataSet;

import me.svetilnik.agentstvo.servlet.model.Model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Set;

@Entity
@Table(name = "streets")
public class StreetsEntity extends Model{


    @Id
    @GeneratedValue
    @Column(name = "idStreets", nullable = false)
    private long idStreets;

    @Column(name = "StreetsName", nullable = false, length = 150)
    private String streetsName;

    public long getIdStreets() {
        return idStreets;
    }

    public void setIdStreets(long idStreets) {
        this.idStreets = idStreets;
    }

    public String getStreetsName() {
        return streetsName;
    }

    public void setStreetsName(String streetsName) {
        this.streetsName = streetsName;
    }

    @OneToMany(mappedBy = "streetsEntity", cascade = CascadeType.ALL)
    private Set<LocationEntity> locationEntities;

    public Set<LocationEntity> getLocationEntities() {
        return locationEntities;
    }

    public void setLocationEntities(Set<LocationEntity> locationEntities) {
        this.locationEntities= locationEntities;
    }



//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        StreetsEntity that = (StreetsEntity) o;
//
//        if (idStreets != that.idStreets) return false;
//        if (streetsName != null ? !streetsName.equals(that.streetsName) : that.streetsName != null) return false;
//
//        return true;
//    }
//
//    @Override
//    public int hashCode() {
//        int result = idStreets;
//        result = 31 * result + (streetsName != null ? streetsName.hashCode() : 0);
//        return result;
//    }

}
