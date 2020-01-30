package com.coursecube.serviceimpl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.coursecube.RequestInput.AgreementData;
import com.coursecube.Service.BsArticlePriceInt;

@Service
@Transactional
public class BsArticlePrice implements BsArticlePriceInt {

	@Override
	public String getArticlePrice(AgreementData agreementData) {
		
		return "ok";
	}

}
