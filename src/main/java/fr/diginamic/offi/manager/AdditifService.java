package fr.diginamic.offi.manager;

import javax.persistence.EntityManager;

import fr.diginamic.offi.dao.AdditifDao;
import fr.diginamic.offi.entity.Additif;

/**
 * Classe qui propose des services de traitement des additifs
 * 
 * @author RichardBONNAMY
 *
 */
public class AdditifService extends EntiteService<Additif> {

	/**
	 * Constructeur
	 * 
	 * @param em {@link EntityManager}
	 */
	public AdditifService(EntityManager em) {
		super(Additif.class, new AdditifDao(em));
	}

}
