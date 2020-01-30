package com.coursecube.serviceimpl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.coursecube.RequestInput.AgreementData;
import com.coursecube.Service.BsArticlePurchasePriceInt;

@Service
@Transactional
public class BsArticlePurchasePrice implements BsArticlePurchasePriceInt {

	@Override
	public String getArticlePurchasePrice(AgreementData agreementData) {
		
		return "ok";
	}

}
