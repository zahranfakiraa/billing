package org.ocs.billing.dto.pPrice;

import java.math.BigDecimal;
import java.sql.Date;

import org.ocs.billing.entity.pPrice.PpricePlan;
import org.springframework.data.annotation.CreatedDate;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PpricePlanDto {
    // input data
    private String pricePlanName;

    private String pricePlanCode;

    private String pricePlanType;

    private String comments;

    // fix data
    @JsonIgnore
    private String state = "X";

    @JsonIgnore
    private String applyLevel = "S";

    @JsonIgnore
    private BigDecimal spId = new BigDecimal(0);

    @JsonIgnore
    @CreatedDate
    private Date stateDate;

    public PpricePlanDto(PpricePlan ppricePlan) {
        this.pricePlanName = ppricePlan.getPricePlanName();
        this.pricePlanCode = ppricePlan.getPricePlanCode();
        this.pricePlanType = ppricePlan.getPricePlanType().getPricePlanType();
        this.comments = ppricePlan.getComments();
        this.state = ppricePlan.getState();
        this.applyLevel = ppricePlan.getApplyLevel();
        this.spId = ppricePlan.getSpId();
        this.stateDate = new java.sql.Date(ppricePlan.getStateDate().getTime());
    }
}