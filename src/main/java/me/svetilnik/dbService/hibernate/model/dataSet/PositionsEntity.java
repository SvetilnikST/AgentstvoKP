package me.svetilnik.dbService.hibernate.model.dataSet;

import me.svetilnik.agentstvo.servlet.model.Model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "positions")
public class PositionsEntity extends Model {

    @Id
    @GeneratedValue
    @Column(name = "idPositions", nullable = false)
    private long idPositions;

    @Column(name = "Positions", nullable = false, length = 45)
    private String positions;

    public long getIdPositions() {
        return idPositions;
    }

    public void setIdPositions(long idPositions) {
        this.idPositions = idPositions;
    }

    public String getPositions() {
        return positions;
    }

    public void setPositions(String positions) {
        this.positions = positions;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        PositionsEntity that = (PositionsEntity) o;
//
//        if (idPositions != that.idPositions) return false;
//        if (positions != null ? !positions.equals(that.positions) : that.positions != null) return false;
//
//        return true;
//    }
//
//    @Override
//    public int hashCode() {
//        int result = idPositions;
//        result = 31 * result + (positions != null ? positions.hashCode() : 0);
//        return result;
//    }

    @OneToMany(mappedBy = "positionsEntity", cascade = CascadeType.ALL)
    private Set<EmployeesEntity> employeesEntity;

    public Set<EmployeesEntity> getEmployeesEntity() {
        return employeesEntity;
    }

    public void setEmployeesEntity(Set<EmployeesEntity> employeesEntity) {
        this.employeesEntity = employeesEntity;
    }
}
