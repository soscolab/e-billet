package dao;

import java.util.List;

import data.Evenement;



public interface IUtilisateurDAO {
	public Evenement save(Evenement c);
	public List<Evenement> findAll();
	public Evenement update(Evenement c);
	public void delete(Long id);

}
