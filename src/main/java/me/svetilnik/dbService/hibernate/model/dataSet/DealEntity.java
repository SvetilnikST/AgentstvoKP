package me.svetilnik.dbService.hibernate.model.dataSet;

import javax.persistence.*;

@Entity
@Table(name = "deal", schema = "agentstvo")
public class DealEntity {
    private int idDeal;
    private int dateDeal;
    private int dealClient1;
    private int dealClient2;
    private int dealView;
    private int dealProperty;
    private int dealPropertyParam;
    private int dealEmployee;
    private double dealSum;
    private double dealPercent;
    private ClientsEntity clientsByDealClient1;
    private ClientsEntity clientsByDealClient2;
    private ViewdealEntity viewdealByDealView;
    private PropertyEntity propertyByDealProperty;
    private EmployeesEntity employeesByDealEmployee;

    @Id
    @Column(name = "idDeal", nullable = false)
    public int getIdDeal() {
        return idDeal;
    }

    public void setIdDeal(int idDeal) {
        this.idDeal = idDeal;
    }

    @Basic
    @Column(name = "DateDeal", nullable = false)
    public int getDateDeal() {
        return dateDeal;
    }

    public void setDateDeal(int dateDeal) {
        this.dateDeal = dateDeal;
    }

    @Basic
    @Column(name = "DealClient1", nullable = false, insertable = false, updatable = false)
    public int getDealClient1() {
        return dealClient1;
    }

    public void setDealClient1(int dealClient1) {
        this.dealClient1 = dealClient1;
    }

    @Basic
    @Column(name = "DealClient2", nullable = false, insertable = false, updatable = false)
    public int getDealClient2() {
        return dealClient2;
    }

    public void setDealClient2(int dealClient2) {
        this.dealClient2 = dealClient2;
    }

    @Basic
    @Column(name = "DealView", nullable = false)
    public int getDealView() {
        return dealView;
    }

    public void setDealView(int dealView) {
        this.dealView = dealView;
    }

    @Basic
    @Column(name = "DealProperty", nullable = false, insertable = false, updatable = false)
    public int getDealProperty() {
        return dealProperty;
    }

    public void setDealProperty(int dealProperty) {
        this.dealProperty = dealProperty;
    }

    @Basic
    @Column(name = "DealPropertyParam", nullable = false)
    public int getDealPropertyParam() {
        return dealPropertyParam;
    }

    public void setDealPropertyParam(int dealPropertyParam) {
        this.dealPropertyParam = dealPropertyParam;
    }

    @Basic
    @Column(name = "DealEmployee", nullable = false, insertable = false, updatable = false)
    public int getDealEmployee() {
        return dealEmployee;
    }

    public void setDealEmployee(int dealEmployee) {
        this.dealEmployee = dealEmployee;
    }

    @Basic
    @Column(name = "DealSum", nullable = false, precision = 0)
    public double getDealSum() {
        return dealSum;
    }

    public void setDealSum(double dealSum) {
        this.dealSum = dealSum;
    }

    @Basic
    @Column(name = "DealPercent", nullable = false, precision = 0)
    public double getDealPercent() {
        return dealPercent;
    }

    public void setDealPercent(double dealPercent) {
        this.dealPercent = dealPercent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DealEntity that = (DealEntity) o;

        if (idDeal != that.idDeal) return false;
        if (dateDeal != that.dateDeal) return false;
        if (dealClient1 != that.dealClient1) return false;
        if (dealClient2 != that.dealClient2) return false;
        if (dealView != that.dealView) return false;
        if (dealProperty != that.dealProperty) return false;
        if (dealPropertyParam != that.dealPropertyParam) return false;
        if (dealEmployee != that.dealEmployee) return false;
        if (Double.compare(that.dealSum, dealSum) != 0) return false;
        if (Double.compare(that.dealPercent, dealPercent) != 0) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = idDeal;
        result = 31 * result + dateDeal;
        result = 31 * result + dealClient1;
        result = 31 * result + dealClient2;
        result = 31 * result + dealView;
        result = 31 * result + dealProperty;
        result = 31 * result + dealPropertyParam;
        result = 31 * result + dealEmployee;
        temp = Double.doubleToLongBits(dealSum);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(dealPercent);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "DealClient1", referencedColumnName = "idClients", nullable = false)
    public ClientsEntity getClientsByDealClient1() {
        return clientsByDealClient1;
    }

    public void setClientsByDealClient1(ClientsEntity clientsByDealClient1) {
        this.clientsByDealClient1 = clientsByDealClient1;
    }

    @ManyToOne
    @JoinColumn(name = "DealClient2", referencedColumnName = "idClients", nullable = false)
    public ClientsEntity getClientsByDealClient2() {
        return clientsByDealClient2;
    }

    public void setClientsByDealClient2(ClientsEntity clientsByDealClient2) {
        this.clientsByDealClient2 = clientsByDealClient2;
    }

    @ManyToOne
    @JoinColumn(name = "DealView", referencedColumnName = "idViewDeal", nullable = false , insertable = false, updatable = false)
    public ViewdealEntity getViewdealByDealView() {
        return viewdealByDealView;
    }

    public void setViewdealByDealView(ViewdealEntity viewdealByDealView) {
        this.viewdealByDealView = viewdealByDealView;
    }

    @ManyToOne
    @JoinColumn(name = "DealProperty", referencedColumnName = "idProperty", nullable = false)
    public PropertyEntity getPropertyByDealProperty() {
        return propertyByDealProperty;
    }

    public void setPropertyByDealProperty(PropertyEntity propertyByDealProperty) {
        this.propertyByDealProperty = propertyByDealProperty;
    }

    @ManyToOne
    @JoinColumn(name = "DealEmployee", referencedColumnName = "idEmployees", nullable = false)
    public EmployeesEntity getEmployeesByDealEmployee() {
        return employeesByDealEmployee;
    }

    public void setEmployeesByDealEmployee(EmployeesEntity employeesByDealEmployee) {
        this.employeesByDealEmployee = employeesByDealEmployee;
    }
}
