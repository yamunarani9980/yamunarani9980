package com.bank.beneficiary.service;

import com.bank.beneficiary.schema.BeneficiaryApiRequest;
import com.bank.beneficiary.schema.BeneficiaryApiResponse;

public interface BeneficiaryApiService {
	BeneficiaryApiResponse beneficiaryPostRequest(BeneficiaryApiRequest beneficiaryRequest);

}
