package me.svetilnik.dbService.hibernate.model.dataSet;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "paramproperty", schema = "agentstvo")
public class ParampropertyEntity {
    private int idParamProperty;
    private int paramPropertyArea;
    private int paramPropertyLocation;
    private int paramPropertyFloor;
    private String paramPropertyDescription;
    private LocationEntity locationByParamPropertyLocation;
    private Collection<PropertyEntity> propertiesByIdParamProperty;

    @Id
    @Column(name = "idParamProperty", nullable = false)
    public int getIdParamProperty() {
        return idParamProperty;
    }

    public void setIdParamProperty(int idParamProperty) {
        this.idParamProperty = idParamProperty;
    }

    @Basic
    @Column(name = "ParamPropertyArea", nullable = false)
    public int getParamPropertyArea() {
        return paramPropertyArea;
    }

    public void setParamPropertyArea(int paramPropertyArea) {
        this.paramPropertyArea = paramPropertyArea;
    }

    @Basic
    @Column(name = "ParamPropertyLocation", nullable = false, insertable = false, updatable = false)
    public int getParamPropertyLocation() {
        return paramPropertyLocation;
    }

    public void setParamPropertyLocation(int paramPropertyLocation) {
        this.paramPropertyLocation = paramPropertyLocation;
    }

    @Basic
    @Column(name = "ParamPropertyFloor", nullable = false)
    public int getParamPropertyFloor() {
        return paramPropertyFloor;
    }

    public void setParamPropertyFloor(int paramPropertyFloor) {
        this.paramPropertyFloor = paramPropertyFloor;
    }

    @Basic
    @Column(name = "ParamPropertyDescription", nullable = false, length = 200)
    public String getParamPropertyDescription() {
        return paramPropertyDescription;
    }

    public void setParamPropertyDescription(String paramPropertyDescription) {
        this.paramPropertyDescription = paramPropertyDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ParampropertyEntity that = (ParampropertyEntity) o;

        if (idParamProperty != that.idParamProperty) return false;
        if (paramPropertyArea != that.paramPropertyArea) return false;
        if (paramPropertyLocation != that.paramPropertyLocation) return false;
        if (paramPropertyFloor != that.paramPropertyFloor) return false;
        if (paramPropertyDescription != null ? !paramPropertyDescription.equals(that.paramPropertyDescription) : that.paramPropertyDescription != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idParamProperty;
        result = 31 * result + paramPropertyArea;
        result = 31 * result + paramPropertyLocation;
        result = 31 * result + paramPropertyFloor;
        result = 31 * result + (paramPropertyDescription != null ? paramPropertyDescription.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "ParamPropertyLocation", referencedColumnName = "idLocation", nullable = false)
    public LocationEntity getLocationByParamPropertyLocation() {
        return locationByParamPropertyLocation;
    }

    public void setLocationByParamPropertyLocation(LocationEntity locationByParamPropertyLocation) {
        this.locationByParamPropertyLocation = locationByParamPropertyLocation;
    }

    @OneToMany(mappedBy = "parampropertyByParamProperty")
    public Collection<PropertyEntity> getPropertiesByIdParamProperty() {
        return propertiesByIdParamProperty;
    }

    public void setPropertiesByIdParamProperty(Collection<PropertyEntity> propertiesByIdParamProperty) {
        this.propertiesByIdParamProperty = propertiesByIdParamProperty;
    }
}
