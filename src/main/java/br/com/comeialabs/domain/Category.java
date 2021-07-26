package br.com.comeialabs.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "category")
@Data
public class Category extends BaseEntity {
	
	@Column(length = 100, nullable = false)
	private String description;
	
	@ManyToMany
	@JoinTable(name = "product_category", 
		joinColumns = @JoinColumn(referencedColumnName = "id", name = "category_id"),
		inverseJoinColumns = @JoinColumn(referencedColumnName = "id", name = "product_id"))
	private List<Product> products;
	
}
