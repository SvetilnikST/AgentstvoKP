package me.svetilnik.dbService.hibernate.model.dataSet;

import me.svetilnik.agentstvo.servlet.model.Model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

@Entity
@Table(name = "employees", schema = "agentstvo")
public class EmployeesEntity extends Model {
    private int idEmployees;
    private String employeesSnm;
    private String employeesFloor;
    private String employeesCitizinship;
    private Timestamp employeesDoB;
    private String employeesPassport;
    private int position;
    private String employeesPhone;
    private String employeesMail;
    private String password;
    private String solt;
    private Integer status;
    private String employeescol;
    private Collection<DealEntity> dealsByIdEmployees;
    private PositionsEntity positionsByPosition;

    @Id
    @Column(name = "idEmployees", nullable = false)
    public int getIdEmployees() {
        return idEmployees;
    }

    public void setIdEmployees(int idEmployees) {
        this.idEmployees = idEmployees;
    }

    @Basic
    @Column(name = "EmployeesSNM", nullable = false, length = 150)
    public String getEmployeesSnm() {
        return employeesSnm;
    }

    public void setEmployeesSnm(String employeesSnm) {
        this.employeesSnm = employeesSnm;
    }

    @Basic
    @Column(name = "EmployeesFloor", nullable = false, length = 45)
    public String getEmployeesFloor() {
        return employeesFloor;
    }

    public void setEmployeesFloor(String employeesFloor) {
        this.employeesFloor = employeesFloor;
    }

    @Basic
    @Column(name = "EmployeesCitizinship", nullable = false, length = 45)
    public String getEmployeesCitizinship() {
        return employeesCitizinship;
    }

    public void setEmployeesCitizinship(String employeesCitizinship) {
        this.employeesCitizinship = employeesCitizinship;
    }

    @Basic
    @Column(name = "EmployeesDoB", nullable = false)
    public Timestamp getEmployeesDoB() {
        return employeesDoB;
    }

    public void setEmployeesDoB(Timestamp employeesDoB) {
        this.employeesDoB = employeesDoB;
    }

    @Basic
    @Column(name = "EmployeesPassport", nullable = true, length = 45)
    public String getEmployeesPassport() {
        return employeesPassport;
    }

    public void setEmployeesPassport(String employeesPassport) {
        this.employeesPassport = employeesPassport;
    }

    @Basic
    @Column(name = "Position", nullable = false , insertable = false, updatable = false)
    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    @Basic
    @Column(name = "EmployeesPhone", nullable = false, length = 45)
    public String getEmployeesPhone() {
        return employeesPhone;
    }

    public void setEmployeesPhone(String employeesPhone) {
        this.employeesPhone = employeesPhone;
    }

    @Basic
    @Column(name = "EmployeesMail", nullable = false, length = 45)
    public String getEmployeesMail() {
        return employeesMail;
    }

    public void setEmployeesMail(String employeesMail) {
        this.employeesMail = employeesMail;
    }

    @Basic
    @Column(name = "password", nullable = false, length = 32)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "solt", nullable = false, length = 32)
    public String getSolt() {
        return solt;
    }

    public void setSolt(String solt) {
        this.solt = solt;
    }

    @Basic
    @Column(name = "status", nullable = true)
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Basic
    @Column(name = "employeescol", nullable = true, length = 45)
    public String getEmployeescol() {
        return employeescol;
    }

    public void setEmployeescol(String employeescol) {
        this.employeescol = employeescol;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmployeesEntity that = (EmployeesEntity) o;

        if (idEmployees != that.idEmployees) return false;
        if (position != that.position) return false;
        if (employeesSnm != null ? !employeesSnm.equals(that.employeesSnm) : that.employeesSnm != null) return false;
        if (employeesFloor != null ? !employeesFloor.equals(that.employeesFloor) : that.employeesFloor != null)
            return false;
        if (employeesCitizinship != null ? !employeesCitizinship.equals(that.employeesCitizinship) : that.employeesCitizinship != null)
            return false;
        if (employeesDoB != null ? !employeesDoB.equals(that.employeesDoB) : that.employeesDoB != null) return false;
        if (employeesPassport != null ? !employeesPassport.equals(that.employeesPassport) : that.employeesPassport != null)
            return false;
        if (employeesPhone != null ? !employeesPhone.equals(that.employeesPhone) : that.employeesPhone != null)
            return false;
        if (employeesMail != null ? !employeesMail.equals(that.employeesMail) : that.employeesMail != null)
            return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (solt != null ? !solt.equals(that.solt) : that.solt != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (employeescol != null ? !employeescol.equals(that.employeescol) : that.employeescol != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idEmployees;
        result = 31 * result + (employeesSnm != null ? employeesSnm.hashCode() : 0);
        result = 31 * result + (employeesFloor != null ? employeesFloor.hashCode() : 0);
        result = 31 * result + (employeesCitizinship != null ? employeesCitizinship.hashCode() : 0);
        result = 31 * result + (employeesDoB != null ? employeesDoB.hashCode() : 0);
        result = 31 * result + (employeesPassport != null ? employeesPassport.hashCode() : 0);
        result = 31 * result + position;
        result = 31 * result + (employeesPhone != null ? employeesPhone.hashCode() : 0);
        result = 31 * result + (employeesMail != null ? employeesMail.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (solt != null ? solt.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (employeescol != null ? employeescol.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "employeesByDealEmployee")
    public Collection<DealEntity> getDealsByIdEmployees() {
        return dealsByIdEmployees;
    }

    public void setDealsByIdEmployees(Collection<DealEntity> dealsByIdEmployees) {
        this.dealsByIdEmployees = dealsByIdEmployees;
    }

    @ManyToOne
    @JoinColumn(name = "Position", referencedColumnName = "idPositions", nullable = false)
    public PositionsEntity getPositionsByPosition() {
        return positionsByPosition;
    }

    public void setPositionsByPosition(PositionsEntity positionsByPosition) {
        this.positionsByPosition = positionsByPosition;
    }
}
