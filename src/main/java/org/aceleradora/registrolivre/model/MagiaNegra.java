package org.aceleradora.registrolivre.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class MagiaNegra {
	
	private static Session session;
	
	public static void abreSessao(){
		if(session == null){
			AnnotationConfiguration configuration = new AnnotationConfiguration();
			configuration.configure();
			SessionFactory sf = configuration.buildSessionFactory();			
			session = sf.openSession();
		}			
	}
	
	public static void gravaProduto(){
		Produto p = new Produto();
		p.setNome("Teste");
		p.setDescricao("Teste");
		p.setPreco(15.00);
		
	}
	
	public static void fechaSessao(){
		if(session != null)
			session.close();
	}

}
