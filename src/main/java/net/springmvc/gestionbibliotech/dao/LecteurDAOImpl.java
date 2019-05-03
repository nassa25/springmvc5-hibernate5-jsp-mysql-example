package net.springmvc.gestionbibliotech.dao;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import net.springmvc.gestionbibliotech.entity.Lecteur;


@Repository
public class LecteurDAOImpl implements LecteurDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	public List<Lecteur> getLecteurs() {
		Session session = sessionFactory.getCurrentSession();
		CriteriaBuilder cb = session.getCriteriaBuilder();
		CriteriaQuery< Lecteur > cq = cb.createQuery(Lecteur.class);
		Root< Lecteur > root = cq.from(Lecteur.class);
		cq.select(root);
		Query query = session.createQuery(cq);
		return query.getResultList();
	}

	public void saveLecteur(Lecteur theLecteur) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(theLecteur);
		
	}
	
	public Lecteur getLecteur(int theId) {
		Session currentSession = sessionFactory.getCurrentSession();
		Lecteur theLecteur  = currentSession.get(Lecteur.class, theId);
		return theLecteur;
	}

	public void deleteLecteur(int id) {
		Session session = sessionFactory.getCurrentSession();
		Lecteur lec = session.byId(Lecteur.class).load(id);
		session.delete(lec);
		
	}

}
