package me.svetilnik.dbService.hibernate.model.dataSet;

import me.svetilnik.agentstvo.servlet.model.Model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Set;

@Entity
@Table(name = "employees")
public class EmployeesEntity extends Model {


    @Id
    @GeneratedValue
    @Column(name = "idEmployees", nullable = false)
    private long idEmployees;

    @Column(name = "EmployeesSNM", nullable = false, length = 150)
    private String employeesSnm;

    @Basic
    @Column(name = "EmployeesFloor", nullable = false, length = 45)
    private String employeesFloor;

    @Column(name = "EmployeesCitizinship", nullable = false, length = 45)
    private String employeesCitizinship;

    @Column(name = "EmployeesDoB", nullable = false)
    private Timestamp employeesDoB;

    @Column(name = "EmployeesPassport", nullable = true, length = 45)
    private String employeesPassport;

    @Column(name = "EmployeesPhone", nullable = false, length = 45)
    private String employeesPhone;

    @Column(name = "EmployeesMail", nullable = false, length = 45)
    private String employeesMail;

    @Column(name = "password", nullable = false, length = 32)
    private String password;

    @Column(name = "solt", nullable = false, length = 32)
    private String solt;

    @Column(name = "status", nullable = true)
    private int status;

    @Column(name = "employeescol", nullable = true, length = 45)
    private String employeescol;

    public long getIdEmployees() {
        return idEmployees;
    }

    public void setIdEmployees(long idEmployees) {
        this.idEmployees = idEmployees;
    }

    public String getEmployeesSnm() {
        return employeesSnm;
    }

    public void setEmployeesSnm(String employeesSnm) {
        this.employeesSnm = employeesSnm;
    }

    public String getEmployeesFloor() {
        return employeesFloor;
    }

    public void setEmployeesFloor(String employeesFloor) {
        this.employeesFloor = employeesFloor;
    }

    public String getEmployeesCitizinship() {
        return employeesCitizinship;
    }

    public void setEmployeesCitizinship(String employeesCitizinship) {
        this.employeesCitizinship = employeesCitizinship;
    }

    public Timestamp getEmployeesDoB() {
        return employeesDoB;
    }

    public void setEmployeesDoB(Timestamp employeesDoB) {
        this.employeesDoB = employeesDoB;
    }

    public String getEmployeesPassport() {
        return employeesPassport;
    }

    public void setEmployeesPassport(String employeesPassport) {
        this.employeesPassport = employeesPassport;
    }

    public String getEmployeesPhone() {
        return employeesPhone;
    }

    public void setEmployeesPhone(String employeesPhone) {
        this.employeesPhone = employeesPhone;
    }

    public String getEmployeesMail() {
        return employeesMail;
    }

    public void setEmployeesMail(String employeesMail) {
        this.employeesMail = employeesMail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSolt() {
        return solt;
    }

    public void setSolt(String solt) {
        this.solt = solt;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getEmployeescol() {
        return employeescol;
    }

    public void setEmployeescol(String employeescol) {
        this.employeescol = employeescol;
    }


    @ManyToOne
    @JoinColumn(name = "position")
    private PositionsEntity positionsEntity;

    public PositionsEntity getPositionsEntity() { return positionsEntity; }

    public void setPositionsEntity(PositionsEntity positionsEntity){
        this.positionsEntity = positionsEntity;
    }


////исправить
    @OneToMany(mappedBy = "employeesEntity", cascade = CascadeType.ALL)
    private Set<DealEntity> dealEntities;

    public Set<DealEntity> getDealEntities() {
        return dealEntities;
    }

    public void setDealEntities(Set<DealEntity> dealEntities) {
        this.dealEntities= dealEntities;
    }




    //    private long position;


//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        EmployeesEntity that = (EmployeesEntity) o;
//
//        if (idEmployees != that.idEmployees) return false;
//        if (position != that.position) return false;
//        if (employeesSnm != null ? !employeesSnm.equals(that.employeesSnm) : that.employeesSnm != null) return false;
//        if (employeesFloor != null ? !employeesFloor.equals(that.employeesFloor) : that.employeesFloor != null)
//            return false;
//        if (employeesCitizinship != null ? !employeesCitizinship.equals(that.employeesCitizinship) : that.employeesCitizinship != null)
//            return false;
//        if (employeesDoB != null ? !employeesDoB.equals(that.employeesDoB) : that.employeesDoB != null) return false;
//        if (employeesPassport != null ? !employeesPassport.equals(that.employeesPassport) : that.employeesPassport != null)
//            return false;
//        if (employeesPhone != null ? !employeesPhone.equals(that.employeesPhone) : that.employeesPhone != null)
//            return false;
//        if (employeesMail != null ? !employeesMail.equals(that.employeesMail) : that.employeesMail != null)
//            return false;
//        if (password != null ? !password.equals(that.password) : that.password != null) return false;
//        if (solt != null ? !solt.equals(that.solt) : that.solt != null) return false;
//        if (status != null ? !status.equals(that.status) : that.status != null) return false;
//        if (employeescol != null ? !employeescol.equals(that.employeescol) : that.employeescol != null) return false;
//
//        return true;
//    }
//
//    @Override
//    public long hashCode() {
//        long result = idEmployees;
//        result = 31 * result + (employeesSnm != null ? employeesSnm.hashCode() : 0);
//        result = 31 * result + (employeesFloor != null ? employeesFloor.hashCode() : 0);
//        result = 31 * result + (employeesCitizinship != null ? employeesCitizinship.hashCode() : 0);
//        result = 31 * result + (employeesDoB != null ? employeesDoB.hashCode() : 0);
//        result = 31 * result + (employeesPassport != null ? employeesPassport.hashCode() : 0);
//        result = 31 * result + position;
//        result = 31 * result + (employeesPhone != null ? employeesPhone.hashCode() : 0);
//        result = 31 * result + (employeesMail != null ? employeesMail.hashCode() : 0);
//        result = 31 * result + (password != null ? password.hashCode() : 0);
//        result = 31 * result + (solt != null ? solt.hashCode() : 0);
//        result = 31 * result + (status != null ? status.hashCode() : 0);
//        result = 31 * result + (employeescol != null ? employeescol.hashCode() : 0);
//        return result;
//    }

}
