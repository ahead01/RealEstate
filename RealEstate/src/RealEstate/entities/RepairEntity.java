package RealEstate.entities;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "Repair", schema = "RealEstate", catalog = "")
public class RepairEntity {
    private int repairId;
    private BigDecimal cost;
    private String effectedArea;
    private String vendor;

    @Id
    @Column(name = "repairId")
    public int getRepairId() {
        return repairId;
    }

    public void setRepairId(int repairId) {
        this.repairId = repairId;
    }

    @Basic
    @Column(name = "cost")
    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    @Basic
    @Column(name = "effectedArea")
    public String getEffectedArea() {
        return effectedArea;
    }

    public void setEffectedArea(String effectedArea) {
        this.effectedArea = effectedArea;
    }

    @Basic
    @Column(name = "vendor")
    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RepairEntity that = (RepairEntity) o;

        if (repairId != that.repairId) return false;
        if (cost != null ? !cost.equals(that.cost) : that.cost != null) return false;
        if (effectedArea != null ? !effectedArea.equals(that.effectedArea) : that.effectedArea != null) return false;
        if (vendor != null ? !vendor.equals(that.vendor) : that.vendor != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = repairId;
        result = 31 * result + (cost != null ? cost.hashCode() : 0);
        result = 31 * result + (effectedArea != null ? effectedArea.hashCode() : 0);
        result = 31 * result + (vendor != null ? vendor.hashCode() : 0);
        return result;
    }
}
