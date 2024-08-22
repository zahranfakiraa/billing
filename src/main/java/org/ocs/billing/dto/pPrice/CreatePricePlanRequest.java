package org.ocs.billing.dto.pPrice;

import java.math.BigDecimal;
import java.sql.Date;

import org.springframework.data.annotation.CreatedDate;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreatePricePlanRequest {
    // input data
    @NotBlank
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
}