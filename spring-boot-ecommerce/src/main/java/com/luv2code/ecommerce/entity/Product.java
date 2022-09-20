package com.luv2code.ecommerce.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name="product")
public class Product {

    public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(Long id, ProductCategory category, String sku, String name, String description, BigDecimal unitPrice,
			String imageUrl, boolean active, int unitsInStock, Date dateCreated, Date lastUpdated) {
		super();
		this.id = id;
		this.category = category;
		this.sku = sku;
		this.name = name;
		this.description = description;
		this.unitPrice = unitPrice;
		this.imageUrl = imageUrl;
		this.active = active;
		this.unitsInStock = unitsInStock;
		this.dateCreated = dateCreated;
		this.lastUpdated = lastUpdated;
	}

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private ProductCategory category;

    @Column(name = "sku")
    private String sku;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "unit_price")
    private BigDecimal unitPrice;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "active")
    private boolean active;

    @Column(name = "units_in_stock")
    private int unitsInStock;

    @Column(name = "date_created")
    @CreationTimestamp
    private Date dateCreated;

    @Column(name = "last_updated")
    @UpdateTimestamp
    private Date lastUpdated;

	@Override
	public int hashCode() {
		return Objects.hash(active, category, dateCreated, description, id, imageUrl, lastUpdated, name, sku, unitPrice,
				unitsInStock);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return active == other.active && Objects.equals(category, other.category)
				&& Objects.equals(dateCreated, other.dateCreated) && Objects.equals(description, other.description)
				&& Objects.equals(id, other.id) && Objects.equals(imageUrl, other.imageUrl)
				&& Objects.equals(lastUpdated, other.lastUpdated) && Objects.equals(name, other.name)
				&& Objects.equals(sku, other.sku) && Objects.equals(unitPrice, other.unitPrice)
				&& unitsInStock == other.unitsInStock;
	}
    
}
