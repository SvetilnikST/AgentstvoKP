package me.svetilnik.dbService.hibernate.model.dataSet;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "viewdeal", schema = "agentstvo")
public class ViewdealEntity {
    private int idViewDeal;
    private String viewDeal;
    private Collection<DealEntity> dealsByIdViewDeal;

    @Id
    @Column(name = "idViewDeal", nullable = false)
    public int getIdViewDeal() {
        return idViewDeal;
    }

    public void setIdViewDeal(int idViewDeal) {
        this.idViewDeal = idViewDeal;
    }

    @Basic
    @Column(name = "ViewDeal", nullable = false, length = 45)
    public String getViewDeal() {
        return viewDeal;
    }

    public void setViewDeal(String viewDeal) {
        this.viewDeal = viewDeal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ViewdealEntity that = (ViewdealEntity) o;

        if (idViewDeal != that.idViewDeal) return false;
        if (viewDeal != null ? !viewDeal.equals(that.viewDeal) : that.viewDeal != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idViewDeal;
        result = 31 * result + (viewDeal != null ? viewDeal.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "viewdealByDealView")
    public Collection<DealEntity> getDealsByIdViewDeal() {
        return dealsByIdViewDeal;
    }

    public void setDealsByIdViewDeal(Collection<DealEntity> dealsByIdViewDeal) {
        this.dealsByIdViewDeal = dealsByIdViewDeal;
    }
}
