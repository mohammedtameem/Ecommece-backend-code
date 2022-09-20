package com.luv2code.ecommerce.entity;



import java.util.Objects;

import javax.persistence.*;

@Entity
@Table(name="state")
public class State {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;

    @ManyToOne
    @JoinColumn(name="country_id")
    private Country country;

	public State(int id, String name, Country country) {
		super();
		this.id = id;
		this.name = name;
		this.country = country;
	}

	public State() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		return Objects.hash(country, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		State other = (State) obj;
		return Objects.equals(country, other.country) && id == other.id && Objects.equals(name, other.name);
	}
    
    

}












