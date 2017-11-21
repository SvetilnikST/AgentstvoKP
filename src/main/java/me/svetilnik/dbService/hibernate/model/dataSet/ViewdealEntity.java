package me.svetilnik.dbService.hibernate.model.dataSet;

import me.svetilnik.agentstvo.servlet.model.Model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Set;

@Entity
@Table(name = "viewdeal", schema = "agentstvo")
public class ViewdealEntity extends Model {
    @Id
    @GeneratedValue
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

    //    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        ViewdealEntity that = (ViewdealEntity) o;
//
//        if (idViewDeal != that.idViewDeal) return false;
//        if (viewDeal != null ? !viewDeal.equals(that.viewDeal) : that.viewDeal != null) return false;
//
//        return true;
//    }
//
//    @Override
//    public int hashCode() {
//        int result = idViewDeal;
//        result = 31 * result + (viewDeal != null ? viewDeal.hashCode() : 0);
//        return result;
//    }

//    @OneToMany(mappedBy = "viewdealByDealView")
//    public Collection<DealEntity> getDealsByIdViewDeal() {
//        return dealsByIdViewDeal;
//    }
//
//    public void setDealsByIdViewDeal(Collection<DealEntity> dealsByIdViewDeal) {
//        this.dealsByIdViewDeal = dealsByIdViewDeal;
//    }

    @OneToMany(mappedBy = "viewdealEntity", cascade = CascadeType.ALL)
    private Set<DealEntity> dealEntities;

    public Set<DealEntity> getDealEntities() {
        return dealEntities;
    }

    public void setDealEntities(Set<DealEntity> dealEntities) {
        this.dealEntities= dealEntities;
    }


}
