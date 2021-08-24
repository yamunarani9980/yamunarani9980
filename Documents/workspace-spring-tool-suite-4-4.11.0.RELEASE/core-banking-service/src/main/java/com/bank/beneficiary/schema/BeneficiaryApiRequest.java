package com.bank.beneficiary.schema;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;
@Validated
public class BeneficiaryApiRequest {
	@ApiModelProperty(required = true)
	@JsonProperty("customer_id")
	int  customer_id;
	@ApiModelProperty(required = true)
	@JsonProperty("beneficiary_id")
	int beneficiary_id;
	@JsonProperty("beneficiary_customer_name")
	String customer_name;
	@JsonProperty("IFSC_code")
	String ifsc_code;
	
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public int getBeneficiary_id() {
		return beneficiary_id;
	}
	public void setBeneficiary_id(int beneficiary_id) {
		this.beneficiary_id = beneficiary_id;
	}
	@Override
	public String toString() {
		return "BeneficiaryApiRequest [customer_id=" + customer_id + ", beneficiary_id=" + beneficiary_id + "]";
	}
	
	

}
