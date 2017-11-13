package me.svetilnik.dbService.hibernate.model.dataSet;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "positions", schema = "agentstvo")
public class PositionsEntity {
    private int idPositions;
    private String positions;
    private Collection<EmployeesEntity> employeesByIdPositions;

    @Id
    @Column(name = "idPositions", nullable = false)
    public int getIdPositions() {
        return idPositions;
    }

    public void setIdPositions(int idPositions) {
        this.idPositions = idPositions;
    }

    @Basic
    @Column(name = "Positions", nullable = false, length = 45)
    public String getPositions() {
        return positions;
    }

    public void setPositions(String positions) {
        this.positions = positions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PositionsEntity that = (PositionsEntity) o;

        if (idPositions != that.idPositions) return false;
        if (positions != null ? !positions.equals(that.positions) : that.positions != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idPositions;
        result = 31 * result + (positions != null ? positions.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "positionsByPosition")
    public Collection<EmployeesEntity> getEmployeesByIdPositions() {
        return employeesByIdPositions;
    }

    public void setEmployeesByIdPositions(Collection<EmployeesEntity> employeesByIdPositions) {
        this.employeesByIdPositions = employeesByIdPositions;
    }
}
