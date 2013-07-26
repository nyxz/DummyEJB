package com.maistora.ejbear.client;

import java.math.BigDecimal;

import javax.ejb.Remote;

@Remote
public interface ICalculator {

	<T1 extends Number, T2 extends Number> BigDecimal add(T1 a, T2 b);

	<T1 extends Number, T2 extends Number> BigDecimal multiply(T1 a, T2 b);
}
