package com.bank.beneficiary.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.bank.beneficiary.schema.BeneficiaryApiRequest;
import com.bank.beneficiary.schema.BeneficiaryApiResponse;
import com.bank.beneficiary.service.BeneficiaryApiService;

@RestController
public class BeneficiaryApiController implements BeneficiaryApi {
private static final Logger logger = LogManager.getLogger(BeneficiaryApiController.class);
    
	@Autowired
	BeneficiaryApiService beneficiarApiService;

	@Override
	public ResponseEntity<BeneficiaryApiResponse> addBeneficiaryAccount(BeneficiaryApiRequest beneficiaryRequest) {
		BeneficiaryApiResponse beneficiaryResponse = beneficiarApiService.beneficiaryPostRequest(beneficiaryRequest);
		return new ResponseEntity<>(beneficiaryResponse, HttpStatus.CREATED);
	}

	

	
	
	
	
}
