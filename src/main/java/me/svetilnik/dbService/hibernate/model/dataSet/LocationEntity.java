package me.svetilnik.dbService.hibernate.model.dataSet;

import me.svetilnik.agentstvo.servlet.model.Model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Set;

@Entity
@Table(name = "location", schema = "agentstvo")
public class LocationEntity extends Model {


    @Id
    @GeneratedValue
    @Column(name = "idLocation", nullable = false)
    private long idLocation;
//    private long locationStreet;

    @Column(name = "LocationHouse", nullable = false, length = 20)
    private String locationHouse;

    @Column(name = "LocationCorps", nullable = false, length = 20)
    private String locationCorps;

    @Column(name = "LocationFlat", nullable = false)
    private String locationFlat;

    public long getIdLocation() {
        return idLocation;
    }

    public void setIdLocation(long idLocation) {
        this.idLocation = idLocation;
    }

    public String getLocationHouse() {
        return locationHouse;
    }

    public void setLocationHouse(String locationHouse) {
        this.locationHouse = locationHouse;
    }

    public String getLocationCorps() {
        return locationCorps;
    }

    public void setLocationCorps(String locationCorps) {
        this.locationCorps = locationCorps;
    }


    public String getLocationFlat() {
        return locationFlat;
    }

    public void setLocationFlat(String locationName) {
        this.locationFlat = locationFlat;
    }



//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        LocationEntity that = (LocationEntity) o;
//
//        if (idLocation != that.idLocation) return false;
//        if (locationStreet != that.locationStreet) return false;
//        if (locationHouse != null ? !locationHouse.equals(that.locationHouse) : that.locationHouse != null)
//            return false;
//
//        return true;
//    }
//
//    @Override
//    public int hashCode() {
//        int result = idLocation;
//        result = 31 * result + locationStreet;
//        result = 31 * result + (locationHouse != null ? locationHouse.hashCode() : 0);
//        return result;
//    }

    @ManyToOne
    @JoinColumn(name = "LocationStreet")
    private StreetsEntity streetsEntity;

    public StreetsEntity getStreetsEntity() { return streetsEntity; }

    public void setStreetsEntity(StreetsEntity streetsEntity){
        this.streetsEntity= streetsEntity;
    }


    @OneToMany(mappedBy = "locationEntity", cascade = CascadeType.ALL)
    private Set<ParampropertyEntity> parampropertyEntities;

    public Set<ParampropertyEntity> getParampropertyEntities() {
        return parampropertyEntities;
    }

    public void setParampropertyEntities(Set<ParampropertyEntity> parampropertyEntities) {
        this.parampropertyEntities= parampropertyEntities;
    }


}
