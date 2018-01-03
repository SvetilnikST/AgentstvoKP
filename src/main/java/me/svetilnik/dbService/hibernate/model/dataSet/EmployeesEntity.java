package me.svetilnik.dbService.hibernate.model.dataSet;

import me.svetilnik.agentstvo.servlet.model.Model;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Set;

@Entity
@Table(name = "employees")
public class EmployeesEntity extends Model {


    @Id
//    @GeneratedValue
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
    private Date employeesDoB;

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

    public Date getEmployeesDoB() {
        return employeesDoB;
    }

    public void setEmployeesDoB(Date employeesDoB) {
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

}
