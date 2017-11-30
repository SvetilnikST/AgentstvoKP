package me.svetilnik.dbService.hibernate.model.dataSet;

import me.svetilnik.agentstvo.servlet.model.Model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "paramproperty", schema = "agentstvo")
public class ParampropertyEntity extends Model {

    @Id
//    @GeneratedValue
    @Column(name = "idParamProperty", nullable = false)
    private long idParamProperty;

    @Column(name = "ParamPropertyArea", nullable = false)
    private int paramPropertyArea;

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
