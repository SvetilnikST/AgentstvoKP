package me.svetilnik.dbService.hibernate.model.dataSet;

import me.svetilnik.agentstvo.servlet.model.Model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Set;

@Entity
@Table(name = "paramproperty", schema = "agentstvo")
public class ParampropertyEntity extends Model {

    @Id
    @GeneratedValue
    @Column(name = "idParamProperty", nullable = false)
    private long idParamProperty;

    @Column(name = "ParamPropertyArea", nullable = false)
    private int paramPropertyArea;

//    private int paramPropertyLocation;

    @Column(name = "ParamPropertyFloor", nullable = false)
    private int paramPropertyFloor;

    @Column(name = "ParamPropertyDescription", nullable = false, length = 200)
    private String paramPropertyDescription;

    public long getIdParamProperty() {
        return idParamProperty;
    }

    public void setIdParamProperty(long idParamProperty) {
        this.idParamProperty = idParamProperty;
    }

    public int getParamPropertyArea() {
        return paramPropertyArea;
    }

    public void setParamPropertyArea(int paramPropertyArea) {
        this.paramPropertyArea = paramPropertyArea;
    }


    public int getParamPropertyFloor() {
        return paramPropertyFloor;
    }

    public void setParamPropertyFloor(int paramPropertyFloor) {
        this.paramPropertyFloor = paramPropertyFloor;
    }

    public String getParamPropertyDescription() {
        return paramPropertyDescription;
    }

    public void setParamPropertyDescription(String paramPropertyDescription) {
        this.paramPropertyDescription = paramPropertyDescription;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        ParampropertyEntity that = (ParampropertyEntity) o;
//
//        if (idParamProperty != that.idParamProperty) return false;
//        if (paramPropertyArea != that.paramPropertyArea) return false;
//        if (paramPropertyLocation != that.paramPropertyLocation) return false;
//        if (paramPropertyFloor != that.paramPropertyFloor) return false;
//        if (paramPropertyDescription != null ? !paramPropertyDescription.equals(that.paramPropertyDescription) : that.paramPropertyDescription != null)
//            return false;
//
//        return true;
//    }
//
//    @Override
//    public int hashCode() {
//        int result = idParamProperty;
//        result = 31 * result + paramPropertyArea;
//        result = 31 * result + paramPropertyLocation;
//        result = 31 * result + paramPropertyFloor;
//        result = 31 * result + (paramPropertyDescription != null ? paramPropertyDescription.hashCode() : 0);
//        return result;
//    }

//    @ManyToOne
//    @JoinColumn(name = "ParamPropertyLocation", referencedColumnName = "idLocation", nullable = false)
//    public LocationEntity getLocationByParamPropertyLocation() {
//        return locationByParamPropertyLocation;
//    }
//
//    public void setLocationByParamPropertyLocation(LocationEntity locationByParamPropertyLocation) {
//        this.locationByParamPropertyLocation = locationByParamPropertyLocation;
//    }
//
//    @OneToMany(mappedBy = "parampropertyByParamProperty")
//    public Collection<PropertyEntity> getPropertiesByIdParamProperty() {
//        return propertiesByIdParamProperty;
//    }
//
//    public void setPropertiesByIdParamProperty(Collection<PropertyEntity> propertiesByIdParamProperty) {
//        this.propertiesByIdParamProperty = propertiesByIdParamProperty;
//    }


    @ManyToOne
    @JoinColumn(name = "ParamPropertyLocation")
    private LocationEntity locationEntity;

    public LocationEntity getLocationEntity() { return locationEntity; }

    public void setLocationEntity(LocationEntity locationEntity){
        this.locationEntity= locationEntity;
    }

    @OneToMany(mappedBy = "parampropertyEntity", cascade = CascadeType.ALL)
    private Set<DealEntity> dealEntities;

    public Set<DealEntity> getDealEntities() {
        return dealEntities;
    }

    public void setDealEntities(Set<DealEntity> dealEntities) {
        this.dealEntities= dealEntities;
    }



}
