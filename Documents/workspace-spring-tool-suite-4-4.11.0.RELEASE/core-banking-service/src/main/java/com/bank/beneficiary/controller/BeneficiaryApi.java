package com.bank.beneficiary.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.bank.beneficiary.exception.BeneficiaryApiException;
import com.bank.beneficiary.schema.*;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

public interface BeneficiaryApi {
	@ApiOperation(value = "this api will add the beneficiary", nickname = "Beneficiary", notes = "this api will add the beneficiary", tags = {
	"core-banking-service-beneficiary" })
@ApiResponses(value = { @ApiResponse(code = 201, message = "CREATED"),
	@ApiResponse(code = 400, message = "Bad request BeneficiaryApiException"),
	@ApiResponse(code = 401, message = "Unauthorised BeneficiaryApiException"),
	@ApiResponse(code = 403, message = "Forbidden BeneficiaryApiException"),
	@ApiResponse(code = 404, message = "Entity not found BeneficiaryApiException"),
	@ApiResponse(code = 405, message = "Account Not found BeneficiaryApiException"),
	@ApiResponse(code = 406, message = "Not Acceptable BeneficiaryApiException"),
	@ApiResponse(code = 500, message = "An unexpected server BeneficiaryApiException occurred"),
	@ApiResponse(code = 503, message = "Service unavailable BeneficiaryApiException") })
@PostMapping(value = "/beneficiary", produces = MediaType.APPLICATION_JSON_VALUE)
@ResponseStatus(HttpStatus.CREATED)
ResponseEntity<BeneficiaryApiResponse> addBeneficiaryAccount(@RequestBody BeneficiaryApiRequest beneficiaryapirequest);

}
