package com.coursecube.serviceimpl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.coursecube.RequestInput.AgreementData;
import com.coursecube.Service.BsArticleSalesDateInt;

@Service
@Transactional
public class BsArticleSalesDate implements BsArticleSalesDateInt {

	@Override
	public String getArticleSalesDate(AgreementData agreementData) {
		
		return "ok";
	}

}
