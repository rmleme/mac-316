package plp.funcional2.memoria;

import plp.funcional2.Id;
import plp.funcional2.Expressao;
import plp.funcional2.ValorFuncao;

public class ContextoExecucao implements AmbienteExecucao {

	/**
	 * A pilha de blocos de contexto.
	 */
	private StackHashIdValor pilha;
	
	/**
	 * Construtor da classe.
	 */
	public ContextoExecucao() {
		pilha = new StackHashIdValor();
	}

	public void incrementa(){
		pilha.push(new HashIdExpressao());
	}

	public void restaura(){
		pilha.pop();
	}

        /**
	 * Mapeia o id na expressao dada.
	 *
	 * @exception VariavelJaDeclaradaException se já existir um mapeamento
	 *          do identificador nesta tabela.
	 */
	public void mapValor(Id idArg, Expressao expressaoId) throws VariavelJaDeclaradaException {
		HashIdExpressao aux = pilha.peek();
		if (aux.put(idArg, expressaoId) != null) {
			throw new VariavelJaDeclaradaException(idArg);
		}
	}

	/**
	 * Retorna a expressao mapeada ao id dado.
	 *
	 * @exception VariavelNaoDeclaradaException se não existir nenhum valor
	 *          mapeado ao id dado nesta tabela.
	 */
	public Expressao getValor( Id idArg ) throws VariavelNaoDeclaradaException {
		Expressao result = null;
		StackHashIdValor auxStack = new StackHashIdValor();
		while (result == null && !pilha.empty()) {
			HashIdExpressao aux = pilha.pop();
			auxStack.push(aux);
			result = aux.get(idArg);
		}
		while (!auxStack.empty()) {
			pilha.push(auxStack.pop());
		}
		if (result == null) {
			throw new VariavelNaoDeclaradaException(idArg);
		} else {
			return result;
		}
	}

}
