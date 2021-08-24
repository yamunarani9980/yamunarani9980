package com.bank.beneficiary.schema;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BeneficiaryApiResponse {

	@JsonProperty("customer_id")
	private Integer customer_id;
	
	@JsonProperty("beneficiary_id")
	private Integer beneficiary_id;

	public Integer getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(Integer customer_id) {
		this.customer_id = customer_id;
	}

	public Integer getBeneficiary_id() {
		return beneficiary_id;
	}

	public void setBeneficiary_id(Integer beneficiary_id) {
		this.beneficiary_id = beneficiary_id;
	}
	
	
	
	
}
