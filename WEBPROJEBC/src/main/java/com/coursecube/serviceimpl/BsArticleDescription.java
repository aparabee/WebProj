package com.coursecube.serviceimpl;

import org.springframework.stereotype.Service;

import com.coursecube.RequestInput.AgreementData;
import com.coursecube.Service.BsArticleDescInt;

@Service
public class BsArticleDescription implements BsArticleDescInt {

	@Override
	public String getArticleDesc(AgreementData agreementData) {
	
		return "ok";
	}

}
