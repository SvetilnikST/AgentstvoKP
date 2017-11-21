package me.svetilnik.dbService.hibernate.model.dataSet;

import me.svetilnik.agentstvo.servlet.model.Model;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "property", schema = "agentstvo")
public class PropertyEntity extends Model {
    private int idProperty;
    private String property;
    private int paramProperty;

    private Collection<DealEntity> dealsByIdProperty;
    private ParampropertyEntity parampropertyByParamProperty;

    @Id
    @Column(name = "idProperty", nullable = false)
    public int getIdProperty() {
        return idProperty;
    }

    public void setIdProperty(int idProperty) {
        this.idProperty = idProperty;
    }

    @Basic
    @Column(name = "Property", nullable = false, length = 45)
    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    @Basic
    @Column(name = "ParamProperty", nullable = false)
    public int getParamProperty() {
        return paramProperty;
    }

    public void setParamProperty(int paramProperty) {
        this.paramProperty = paramProperty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PropertyEntity that = (PropertyEntity) o;

        if (idProperty != that.idProperty) return false;
        if (paramProperty != that.paramProperty) return false;
        if (property != null ? !property.equals(that.property) : that.property != null) return false;
      // if (propertycol != null ? !propertycol.equals(that.propertycol) : that.propertycol != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idProperty;
        result = 31 * result + (property != null ? property.hashCode() : 0);
        result = 31 * result + paramProperty;
       // result = 31 * result + (propertycol != null ? propertycol.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "propertyByDealProperty")
    public Collection<DealEntity> getDealsByIdProperty() {
        return dealsByIdProperty;
    }

    public void setDealsByIdProperty(Collection<DealEntity> dealsByIdProperty) {
        this.dealsByIdProperty = dealsByIdProperty;
    }

    @ManyToOne
    @JoinColumn(name = "ParamProperty", referencedColumnName = "idParamProperty", nullable = false , insertable = false, updatable = false)
    public ParampropertyEntity getParampropertyByParamProperty() {
        return parampropertyByParamProperty;
    }

    public void setParampropertyByParamProperty(ParampropertyEntity parampropertyByParamProperty) {
        this.parampropertyByParamProperty = parampropertyByParamProperty;
    }
}
