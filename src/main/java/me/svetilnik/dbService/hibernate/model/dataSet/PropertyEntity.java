package me.svetilnik.dbService.hibernate.model.dataSet;

import me.svetilnik.agentstvo.servlet.model.Model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Set;

@Entity
@Table(name = "property", schema = "agentstvo")
public class PropertyEntity extends Model {

    @Id
    @GeneratedValue
    @Column(name = "idProperty", nullable = false)
    private long idProperty;

    @Column(name = "Property", nullable = false, length = 45)
    private String property;


//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        PropertyEntity that = (PropertyEntity) o;
//
//        if (idProperty != that.idProperty) return false;
//        if (paramProperty != that.paramProperty) return false;
//        if (property != null ? !property.equals(that.property) : that.property != null) return false;
//      // if (propertycol != null ? !propertycol.equals(that.propertycol) : that.propertycol != null) return false;
//
//        return true;
//    }
//
//    @Override
//    public int hashCode() {
//        int result = idProperty;
//        result = 31 * result + (property != null ? property.hashCode() : 0);
//        result = 31 * result + paramProperty;
//       // result = 31 * result + (propertycol != null ? propertycol.hashCode() : 0);
//        return result;
//    }

    @OneToMany(mappedBy = "propertyEntity", cascade = CascadeType.ALL)
    private Set<DealEntity> dealEntities;

    public Set<DealEntity> getDealEntities() {
        return dealEntities;
    }

    public void setDealEntities(Set<DealEntity> dealEntities) {
        this.dealEntities= dealEntities;
    }



//    @OneToMany(mappedBy = "propertyByDealProperty")
//    public Collection<DealEntity> getDealsByIdProperty() {
//        return dealsByIdProperty;
//    }
//
//    public void setDealsByIdProperty(Collection<DealEntity> dealsByIdProperty) {
//        this.dealsByIdProperty = dealsByIdProperty;
//    }
//
//    @ManyToOne
//    @JoinColumn(name = "ParamProperty", referencedColumnName = "idParamProperty", nullable = false , insertable = false, updatable = false)
//    public ParampropertyEntity getParampropertyByParamProperty() {
//        return parampropertyByParamProperty;
//    }
//
//    public void setParampropertyByParamProperty(ParampropertyEntity parampropertyByParamProperty) {
//        this.parampropertyByParamProperty = parampropertyByParamProperty;
//    }
}
