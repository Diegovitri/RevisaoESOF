package v1;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

public class Testes {

	@Test
	public void exemplo() {
		Pessoa p1 = new Pessoa("Fulano", false, false);
		Pessoa p2 = new Pessoa("Ciclana", false, false);
		Pessoa p3 = new Pessoa("Beltrana", false, false);
		
		Fila f = new Fila();
		
		f.addPessoa(p1);
		f.addPessoa(p2);
		f.addPessoa(p3);
		
		Pessoa proximo = f.proximoFila();
		
		Assert.assertEquals(proximo.getNome(), "Fulano");
		
		f.removePessoa(proximo);
		proximo = f.proximoFila();
			
		Assert.assertEquals(proximo.getNome(), "Ciclana");
		
		f.removePessoa(proximo);
		proximo = f.proximoFila();
		
		Assert.assertEquals(proximo.getNome(), "Beltrana");
		
		f.removePessoa(proximo);
	}
	
	@Test
	public void TesteGravida(){
		Pessoa p4 = new Pessoa("Maria", false, false);
		Pessoa p5 = new Pessoa("Joana", true, false);
		
		Fila f2 = new Fila();
		f2.addPessoa(p4);
		f2.addPessoa(p5);
		
		Pessoa proximo2 = f2.proximoFila();
		Assert.assertEquals(proximo2.isGravida(), true);
		
		f2.removePessoa(proximo2);
		proximo2 = f2.proximoFila();
		
		Assert.assertEquals(proximo2.isGravida(), false);
		f2.removePessoa(proximo2);
		proximo2 = f2.proximoFila();
			
		
	}

}
