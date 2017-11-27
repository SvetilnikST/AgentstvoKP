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

    @OneToMany(mappedBy = "propertyEntity", cascade = CascadeType.ALL)
    private Set<DealEntity> dealEntities;

    public Set<DealEntity> getDealEntities() {
        return dealEntities;
    }

    public void setDealEntities(Set<DealEntity> dealEntities) {
        this.dealEntities= dealEntities;
    }
}
