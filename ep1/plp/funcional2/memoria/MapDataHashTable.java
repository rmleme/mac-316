package plp.funcional2.memoria;
import plp.funcional2.*;

public class MapDataHashTable implements MapData{
  private java.util.Hashtable mapHash;

  public MapDataHashTable() {mapHash = new java.util.Hashtable(); }

  public void addId(Id idArg, Contextuavel cont){mapHash.put(idArg,cont);}
  public Contextuavel getValor(Id idArg){ return (Contextuavel)mapHash.get(idArg); }
  public boolean exists(Id idArg){return mapHash.containsKey(idArg);}
}
