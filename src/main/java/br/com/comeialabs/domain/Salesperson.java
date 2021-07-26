package br.com.comeialabs.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "salesperson")
@Getter
@Setter
public class Salesperson extends BaseEntity {

	@Column(length = 60, nullable = false)
	private String name;

}
