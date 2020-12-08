package plp.funcional2;
import plp.funcional2.memoria.*;

public class Aplicacao implements Expressao {
  private Expressao func;
  private ListaExpressao args;

  public Aplicacao(Expressao f, ListaExpressao a) {
      func=f;
      args=a;
  }

  public Valor avaliar(AmbienteExecucao ambiente) throws VariavelNaoDeclaradaException,VariavelJaDeclaradaException {
	Valor arg = (args.getExp()).avaliar(ambiente); // Consideramos apenas funções de um parâmetro para casamento de padrões.
	ValorFuncao funcao;
	ListaValorFuncao lista = func.avaliarchamadodeaplicacao(ambiente);
	// O porquê da nova função da linha acima está explicado em Expressao.java
	funcao = lista.getValorFuncao (arg);
	ListaId parametros = funcao.getListaId();
	ListaId parametros_aux = parametros;
	ListaExpressao valorReal = args;

	HashIdExpressao valores = new HashIdExpressao();
	while (parametros!=null) {
		valores.put( parametros.getId(), valorReal.getExp().avaliar(ambiente));
		parametros=parametros.next();
		valorReal=valorReal.next();
	}

	ambiente.incrementa();

	while (parametros_aux!=null) {
		Id id = parametros_aux.getId();
		ambiente.mapValor( id , valores.get(id) );
		parametros_aux = parametros_aux.next();
	}

	Valor vresult = funcao.getExp().avaliar(ambiente);
	ambiente.restaura();
	return vresult;
  }

  public ListaValorFuncao avaliarchamadodeaplicacao(AmbienteExecucao ambiente) throws VariavelNaoDeclaradaException,VariavelJaDeclaradaException {
        return new ListaValorFuncao ((ValorFuncao)this.avaliar(ambiente));
  }

}