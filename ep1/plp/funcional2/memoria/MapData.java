package plp.funcional2.memoria;
import plp.funcional2.*;

public interface MapData{

  public void addId(Id idArg, Contextuavel cont);
  public Contextuavel getValor(Id idArg);
  public boolean exists(Id idArg);
}
