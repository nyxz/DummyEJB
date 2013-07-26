package com.maistora.ejbear.ejb;

import java.math.BigDecimal;

import javax.ejb.Stateless;

import com.maistora.ejbear.client.ICalculator;

@Stateless(name = "Calculator", mappedName = "ejb/Calc")
public class Calculator implements ICalculator {

	@Override
	public <T1 extends Number, T2 extends Number> BigDecimal add(T1 a, T2 b) {
		final BigDecimal valA = new BigDecimal(a.toString());
		final BigDecimal valB = new BigDecimal(b.toString());

		return valA.add(valB);
	}

	@Override
	public <T1 extends Number, T2 extends Number> BigDecimal multiply(T1 a, T2 b) {
		final BigDecimal valA = new BigDecimal(a.toString());
		final BigDecimal valB = new BigDecimal(b.toString());

		return valA.multiply(valB);
	}

}
