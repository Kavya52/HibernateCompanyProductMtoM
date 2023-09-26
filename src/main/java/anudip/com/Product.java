package anudip.com;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.ManyToMany;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {

	@Id
	private int productId;
	private String productName;
	
    @ManyToMany(mappedBy="productset")
	private Set<Company> companySet=new HashSet<Company>();
    
	public Product() {
		super();
	}
	public int getproductId() {
	return productId;
	}
	public String getproductName() {
		return productName;
	}
	
	public void setProductId(int productId) {
		this.productId = productId;
	}
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Set<Company> getCompanySet() {
		return companySet;
	}
	public void setCompanySet(Set<Company> companySet) {
		this.companySet = companySet;
	}
	
}
