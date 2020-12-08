package plp.funcional2.memoria;
import plp.funcional2.*;

public class Map {
  private MapData mapData;

  public Map(MapData mapDataArg){ mapData = mapDataArg;}
  public Map(){mapData = new MapDataHashTable();}

  public void addId(Id idArg, Contextuavel cont){mapData.addId( idArg, cont);}
  public Contextuavel getValor(Id idArg){return mapData.getValor(idArg); }
  public boolean exists(Id idArg){ return mapData.exists(idArg); }
}
