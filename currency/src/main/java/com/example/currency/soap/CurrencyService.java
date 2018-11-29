package com.example.currency.soap;

import java.util.ArrayList;
import javax.jws.WebMethod;
import javax.jws.WebService;

import com.example.currency.bus.CurrencyImpl;
import com.example.currency.model.Currency;

@WebService
public class CurrencyService {
	CurrencyImpl cc = new CurrencyImpl();
	
	@WebMethod
	public ArrayList<Currency> getCurrencyResult (String denomination){
		return cc.getCurrencyResult(denomination);
	}
}
