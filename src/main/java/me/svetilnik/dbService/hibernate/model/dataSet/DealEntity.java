package me.svetilnik.dbService.hibernate.model.dataSet;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "deal", schema = "agentstvo")
public class DealEntity {

    @Id
    @GeneratedValue
    @Column(name = "idDeal", nullable = false)
    private long idDeal;

    @Column(name = "DateDeal", nullable = false)
    private Date dateDeal;

    @Column(name = "DealSum", nullable = false, precision = 0)
    private double dealSum;

    @Column(name = "DealPercent", nullable = false, precision = 0)
    private double dealPercent;

    public long getIdDeal() {
        return idDeal;
    }

    public void setIdDeal(long idDeal) {
        this.idDeal = idDeal;
    }

    public Date getDateDeal() {
        return dateDeal;
    }

    public void setDateDeal(Date dateDeal) {
        this.dateDeal = dateDeal;
    }

    public double getDealSum() {
        return dealSum;
    }

    public void setDealSum(double dealSum) {
        this.dealSum = dealSum;
    }

    public double getDealPercent() {
        return dealPercent;
    }

    public void setDealPercent(double dealPercent) {
        this.dealPercent = dealPercent;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        DealEntity that = (DealEntity) o;
//
//        if (idDeal != that.idDeal) return false;
//        if (dateDeal != that.dateDeal) return false;
//        if (dealClient1 != that.dealClient1) return false;
//        if (dealClient2 != that.dealClient2) return false;
//        if (dealView != that.dealView) return false;
//        if (dealProperty != that.dealProperty) return false;
//        if (dealPropertyParam != that.dealPropertyParam) return false;
//        if (dealEmployee != that.dealEmployee) return false;
//        if (Double.compare(that.dealSum, dealSum) != 0) return false;
//        if (Double.compare(that.dealPercent, dealPercent) != 0) return false;
//
//        return true;
//    }
//
//    @Override
//    public int hashCode() {
//        int result;
//        long temp;
//        result = idDeal;
//        result = 31 * result + dateDeal;
//        result = 31 * result + dealClient1;
//        result = 31 * result + dealClient2;
//        result = 31 * result + dealView;
//        result = 31 * result + dealProperty;
//        result = 31 * result + dealPropertyParam;
//        result = 31 * result + dealEmployee;
//        temp = Double.doubleToLongBits(dealSum);
//        result = 31 * result + (int) (temp ^ (temp >>> 32));
//        temp = Double.doubleToLongBits(dealPercent);
//        result = 31 * result + (int) (temp ^ (temp >>> 32));
//        return result;
//    }

    @ManyToOne
    @JoinColumn(name = "DealView")
    private ViewdealEntity viewdealEntity;

    public ViewdealEntity getViewdealEntity() { return viewdealEntity; }

    public void setViewdealEntity(ViewdealEntity viewdealEntity){
        this.viewdealEntity = viewdealEntity;
    }

    @ManyToOne
    @JoinColumn(name = "DealProperty")
    private PropertyEntity propertyEntity;

    public PropertyEntity getPropertyEntity() { return propertyEntity; }

    public void setPropertyEntity(PropertyEntity propertyEntity){
        this.propertyEntity= propertyEntity;
    }


    @ManyToOne
    @JoinColumn(name = "DealEmployee")
    private EmployeesEntity employeesEntity;

    public EmployeesEntity getEmployeesEntity() { return employeesEntity; }

    public void setEmployeesEntity(EmployeesEntity employeesEntity){
        this.employeesEntity= employeesEntity;
    }

    @ManyToOne
    @JoinColumn(name = "DealPropertyParam")
    private ParampropertyEntity parampropertyEntity;

    public ParampropertyEntity getParampropertyEntity() { return parampropertyEntity; }

    public void setParampropertyEntity(ParampropertyEntity parampropertyEntity){
        this.parampropertyEntity= parampropertyEntity;
    }

    @ManyToOne
    @JoinColumn(name = "DealClient1")
    private ClientsEntity clientsEntity1;

    public ClientsEntity getClientsEntity1() { return clientsEntity1; }

    public void setClientsEntity1(ClientsEntity clientsEntity1){
        this.clientsEntity1= clientsEntity1;
    }

    @ManyToOne
    @JoinColumn(name = "DealClient2")
    private ClientsEntity clientsEntity2;

    public ClientsEntity getClientsEntity2() { return clientsEntity2; }

    public void setClientsEntity2(ClientsEntity clientsEntity2){
        this.clientsEntity2= clientsEntity2;
    }

//    @ManyToOne
//    @JoinColumn(name = "DealClient1", referencedColumnName = "idClients", nullable = false)
//    public ClientsEntity getClientsByDealClient1() {
//        return clientsByDealClient1;
//    }
//
//    public void setClientsByDealClient1(ClientsEntity clientsByDealClient1) {
//        this.clientsByDealClient1 = clientsByDealClient1;
//    }
//
//    @ManyToOne
//    @JoinColumn(name = "DealClient2", referencedColumnName = "idClients", nullable = false)
//    public ClientsEntity getClientsByDealClient2() {
//        return clientsByDealClient2;
//    }
//
//    public void setClientsByDealClient2(ClientsEntity clientsByDealClient2) {
//        this.clientsByDealClient2 = clientsByDealClient2;
//    }
//
//    @ManyToOne
//    @JoinColumn(name = "DealView", referencedColumnName = "idViewDeal", nullable = false , insertable = false, updatable = false)
//    public ViewdealEntity getViewdealByDealView() {
//        return viewdealByDealView;
//    }
//
//    public void setViewdealByDealView(ViewdealEntity viewdealByDealView) {
//        this.viewdealByDealView = viewdealByDealView;
//    }
//
//    @ManyToOne
//    @JoinColumn(name = "DealProperty", referencedColumnName = "idProperty", nullable = false)
//    public PropertyEntity getPropertyByDealProperty() {
//        return propertyByDealProperty;
//    }
//
//    public void setPropertyByDealProperty(PropertyEntity propertyByDealProperty) {
//        this.propertyByDealProperty = propertyByDealProperty;
//    }
//
//    @ManyToOne
//    @JoinColumn(name = "DealEmployee", referencedColumnName = "idEmployees", nullable = false)
//    public EmployeesEntity getEmployeesByDealEmployee() {
//        return employeesByDealEmployee;
//    }
//
//    public void setEmployeesByDealEmployee(EmployeesEntity employeesByDealEmployee) {
//        this.employeesByDealEmployee = employeesByDealEmployee;
//    }
}
