package plp.funcional2.memoria;
import plp.funcional2.*;

public class ListMap implements ContextIdValor{
  private ListMap listMap;
  private Map map;

  ListMap(){
    listMap=null;
    map = new Map();}

   ListMap( ContextIdValor listMap ){
    this.listMap = (ListMap)listMap;
    map = new Map();}

  public ContextIdValor incrementa(){
     /*Cria um novo Map que simboliza o contexto que esta sendo trabalhado*/
     ListMap aux = new ListMap();
     aux.map = new Map();
     aux.listMap = this;
     return aux;
  }
  public ContextIdValor restaura(){
     return listMap;
  }

  public boolean hasMoreElements(){return listMap!=null;}

  public ContextIdValor nextElement(){ return listMap; }

  public void addId( Id idArg, Contextuavel valorArg )throws VariavelJaDeclaradaException{
      if (!map.exists( idArg )) map.addId( idArg, valorArg );
      else throw new VariavelJaDeclaradaException( idArg );  }

  public boolean exists( Id idArg ){
      if ( !map.exists(idArg) && (listMap == null) ) return false;
      else if ( !map.exists(idArg)) return listMap.exists(idArg);
      else return true;
  }

  public Contextuavel getValor( Id idArg )throws VariavelNaoDeclaradaException {
      if ( !map.exists(idArg) && (listMap == null) ) throw new VariavelNaoDeclaradaException( idArg );
      else if ( !map.exists(idArg)) return listMap.getValor(idArg);
      else return map.getValor(  idArg );
  }

}
