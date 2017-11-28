package me.svetilnik.dbService.hibernate.model.dataSet;

import me.svetilnik.agentstvo.servlet.model.Model;

import javax.persistence.*;
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

}
