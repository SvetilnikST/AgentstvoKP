package me.svetilnik.dbService.hibernate.model.dataSet;

import me.svetilnik.agentstvo.servlet.model.Model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Set;

@Entity
@Table(name = "viewdeal", schema = "agentstvo")
public class ViewdealEntity extends Model {
    @Id
//    @GeneratedValue
    @Column(name = "idViewDeal", nullable = false)
    private long idViewDeal;

    @Column(name = "ViewDeal", nullable = false, length = 45)
    private String viewDeal;

    public long getIdViewDeal() {
        return idViewDeal;
    }

    public void setIdViewDeal(long idViewDeal) {
        this.idViewDeal = idViewDeal;
    }

    public String getViewDeal() {
        return viewDeal;
    }

    public void setViewDeal(String viewDeal) {
        this.viewDeal = viewDeal;
    }

    @OneToMany(mappedBy = "viewdealEntity", cascade = CascadeType.ALL)
    private Set<DealEntity> dealEntities;

    public Set<DealEntity> getDealEntities() {
        return dealEntities;
    }

    public void setDealEntities(Set<DealEntity> dealEntities) {
        this.dealEntities= dealEntities;
    }


}
