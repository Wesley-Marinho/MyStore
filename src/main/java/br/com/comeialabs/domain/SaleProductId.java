package br.com.comeialabs.domain;

import java.io.Serializable;

import lombok.Data;

@Data
public class SaleProductId implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer sale;
	private Integer product;

}
