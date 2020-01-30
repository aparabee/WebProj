package com.coursecube.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.coursecube.Service.*;
import com.coursecube.request.RequestForBs;

@RestController
public class WebProjController {
	
	@Autowired
	BsArticleDescInt bsArticleDescInt;
	
	@Autowired
	BsArticlePriceInt bsArticlePriceInt;
	
	@Autowired
	BsArticlePurchasePriceInt bsArticlePurchasePriceInt;
	
	@Autowired
	BsArticleSalesDateInt bsArticleSalesDateInt;
	
	@PostMapping(path="/bsArticleDesc", consumes="application/xml")
	public String bsArticleDescController(@RequestBody RequestForBs requestForBs){
		int i=0;
		if(i==0)
			return "ok";
		else
			return "Error";
	}
	
	@PostMapping(path="/bsArticlePrice", consumes="application/xml")
	public String bsArticlePriceController(@RequestBody RequestForBs requestForBs){
		int i=0;
		if(i==0)
			return "ok";
		else
			return "Error";
	}
	
	@PostMapping(path="/bsArticlePurchasePrice", consumes="application/xml")
		public String bsArticlePurchasePriceController(@RequestBody RequestForBs requestForBs){
			int i=0;
			if(i==0)
				return "ok";
			else
				return "Error";
	}
	
	@PostMapping(path="/bsArticleSalesDate", consumes="application/xml")
			public String bsArticleSalesDateController(@RequestBody RequestForBs requestForBs){
				int i=0;
				if(i==0)
					return "ok";
				else
					return "Error";
	}
	
	

}
