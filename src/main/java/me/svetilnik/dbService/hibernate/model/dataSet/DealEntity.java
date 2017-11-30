package me.svetilnik.dbService.hibernate.model.dataSet;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "deal", schema = "agentstvo")
public class DealEntity {

    @Id
//    @GeneratedValue
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

}
