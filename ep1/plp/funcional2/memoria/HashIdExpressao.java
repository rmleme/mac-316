package plp.funcional2.memoria;

import java.util.Enumeration;
import java.util.Hashtable;
import plp.funcional2.Id;
import plp.funcional2.Expressao;

/**
 * Tabela hash cujas chaves são identificadores e os valores
 * são expressoes.
 */
public class HashIdExpressao {

	/**
	 * A tabela hash de java para a qual serão delegadas as operações.
	 */
	private Hashtable tabela;
	
	/**
	 * Construtor da classe.
	 */
	public HashIdExpressao() {
		this.tabela = new Hashtable();
	}
	
	/**
	 * Insere um novo par (id, expressao) nesta tabela.
	 *
	 * @param id o id a ser mapeado no tipo.
	 * @param expressao a expressao mapeada no id.
	 * @return a expressao previamente mapeada ao id, ou <code>null</code>
         *         se nao existia.
	 */
	public Expressao put(Id id, Expressao expressao) {
		Object result = tabela.put(id, expressao);
		if (result == null) {
			return null;
		} else {
			return (Expressao) result;
		}
	}
	
	/**
	 * Retorna a expressao associada ao id dado.
	 *
	 * @param id o id procurado
	 * @return a expressao associada ao id dado.
	 */
	public Expressao get(Id id) {
		Object result = tabela.get(id);
		if (result == null) {
			return null;
		} else {
			return (Expressao) result;
		}
	}
	
	/**
	 * Retorna uma enumeracao com as chaves desta tabela.
	 *
	 * @return uma enumeracao com as chaves desta tabela.
	 */
	public Enumeration keys() {
		return tabela.keys();
	}

}
