package me.svetilnik.dbService.hibernate.model.dataSet;

import me.svetilnik.agentstvo.servlet.model.Model;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "location", schema = "agentstvo")
public class LocationEntity extends Model {
    private int idLocation;
    private int locationStreet;
    private String locationHouse;
    private String locationName;
    private StreetsEntity streetsByLocationStreet;
    private Collection<ParampropertyEntity> parampropertiesByIdLocation;

    @Id
    @Column(name = "idLocation", nullable = false)
    public int getIdLocation() {
        return idLocation;
    }

    public void setIdLocation(int idLocation) {
        this.idLocation = idLocation;
    }


    @Basic
    @Column(name = "LocationName", nullable = false)
    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }


    @Basic
    @Column(name = "LocationStreet", nullable = false)
    public int getLocationStreet() {
        return locationStreet;
    }

    public void setLocationStreet(int locationStreet) {
        this.locationStreet = locationStreet;
    }

    @Basic
    @Column(name = "LocationHouse", nullable = false, length = 20)
    public String getLocationHouse() {
        return locationHouse;
    }

    public void setLocationHouse(String locationHouse) {
        this.locationHouse = locationHouse;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LocationEntity that = (LocationEntity) o;

        if (idLocation != that.idLocation) return false;
        if (locationStreet != that.locationStreet) return false;
        if (locationHouse != null ? !locationHouse.equals(that.locationHouse) : that.locationHouse != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idLocation;
        result = 31 * result + locationStreet;
        result = 31 * result + (locationHouse != null ? locationHouse.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "LocationStreet", referencedColumnName = "idStreets", nullable = false , insertable = false, updatable = false)
    public StreetsEntity getStreetsByLocationStreet() {
        return streetsByLocationStreet;
    }

    public void setStreetsByLocationStreet(StreetsEntity streetsByLocationStreet) {
        this.streetsByLocationStreet = streetsByLocationStreet;
    }

    @OneToMany(mappedBy = "locationByParamPropertyLocation")
    public Collection<ParampropertyEntity> getParampropertiesByIdLocation() {
        return parampropertiesByIdLocation;
    }

    public void setParampropertiesByIdLocation(Collection<ParampropertyEntity> parampropertiesByIdLocation) {
        this.parampropertiesByIdLocation = parampropertiesByIdLocation;
    }
}
