package metier;

import java.util.List;

import dao.IAdminDAO;

public class AdminMetierimplementation implements IAdminMetier{
	
private IAdminDAO dao;
	
	
	public void setDao(ICatalogueDAO dao) {
		this.dao = dao;
	}

	public void add(Produit p) {
		
	dao.addProduit(p);	
	}

	public Produit find(String ref) {
		
		return dao.getProduit(ref);
	}

	public List<Produit> findAll() {
		
		return dao.getAllProduits();
	}

	public void update(Produit p) {
		dao.updateProduit(p);
		
	}

	public void delete(Produit p) {
		dao.deleteProduit(p);
		
	}

}
