package com.example.currency.bus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.example.currency.model.Currency;

public class CurrencyImpl {
	private Map<String, ArrayList> currenciesMap = new HashMap<>();
	private ArrayList<Currency> list;
	
	public CurrencyImpl() {
		Currency MalaysianRinggit = new Currency ("SGD", 0.33);
		Currency MalaysianRinggit1 = new Currency ( "IDR", 3454.78);
		Currency MalaysianRinggit2 = new Currency ("THB", 7.84);
		
		list = new ArrayList<>();
		list.add(MalaysianRinggit);
		list.add(MalaysianRinggit1);
		list.add(MalaysianRinggit2);
		currenciesMap.put("MYR", list);
		
		Currency SingaporeDollar = new Currency ("MYR", 3.05);
		Currency SingaporeDollar1 = new Currency ( "IDR", 10511.85);
		Currency SingaporeDollar2 = new Currency ("THB", 24.03);
		
		list = new ArrayList<>();
		list.add(SingaporeDollar);
		list.add(SingaporeDollar1);
		list.add(SingaporeDollar2);
		currenciesMap.put("SGD", list);
		
		Currency IndonesiaRupiah = new Currency ("MYR", 0.029);
		Currency IndonesiaRupiah1 = new Currency ( "SGD", 0.0096);
		Currency IndonesiaRupiah2 = new Currency ("THB", 0.23);
		
		list = new ArrayList<>();
		list.add(IndonesiaRupiah);
		list.add(IndonesiaRupiah1);
		list.add(IndonesiaRupiah2);
		currenciesMap.put("IDR", list);
		
		Currency ThailandBaht = new Currency ("MYR", 12.70);
		Currency ThailandBaht1 = new Currency ( "SGD", 4.16);
		Currency ThailandBaht2 = new Currency ("IDR", 43502.42);
		
		list = new ArrayList<>();
		list.add(ThailandBaht);
		list.add(ThailandBaht1);
		list.add(ThailandBaht2);
		currenciesMap.put("THB", list);
		
	}
	
	public ArrayList getCurrencyResult (String denomination) {
		return currenciesMap.get(denomination);
	}
}

