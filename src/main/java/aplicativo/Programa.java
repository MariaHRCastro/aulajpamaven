package aplicativo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {

		//INSTANCIA O FACTORY
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		//PRA INSTANCIAR O ENTITYMANAGER
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Pessoa p = em.find(Pessoa.class, 2);
		em.remove(p);
		
		em.getTransaction().commit();
		System.out.println("PRONTO!");

		em.close();
		emf.close();

	}

}
