package anudip.com;

import java.util.Set;
import java.util.HashSet;

import javax.persistence.JoinColumn;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Entity;


@Entity
public class Company {
	@Id
	private int companyId;
	private String companyName;
	
	@ManyToMany
	@JoinTable(name="Company_Products",joinColumns=@JoinColumn(name="companyId"),inverseJoinColumns=@JoinColumn(name="productId"))
	private Set<Product> productset=new HashSet<Product>();
	
	public Company() {
		super();
	}

	public int getCompanyId() {
		return companyId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public Set<Product> getProductset() {
		return productset;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public void setProductset(Set<Product> productset) {
		this.productset = productset;
	}
	
	

}
