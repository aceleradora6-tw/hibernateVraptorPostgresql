package org.aceleradora.registrolivre.controller;

import org.aceleradora.registrolivre.model.Cliente;
import org.aceleradora.registrolivre.model.Produto;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;

@Resource
public class IndexController {
	@Path("/")
	public void index(){
		
		AnnotationConfiguration configuration = new AnnotationConfiguration();
		configuration.configure();
		SessionFactory sf = configuration.buildSessionFactory();			
		Session session = sf.openSession();
		
		Produto p = new Produto();
		p.setNome("Teste");
		p.setDescricao("Teste");
		p.setPreco(15.00);
		
		Cliente c = new Cliente();
		c.setNome("Cliente");
		c.setIdade(15);		
		
		Transaction tx = session.beginTransaction();
		
		session.save(c);
		session.save(p);
		
		tx.commit();
		
		session.close();
				
				
	}
	

}
