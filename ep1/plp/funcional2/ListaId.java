package plp.funcional2;

public class ListaId {
  private Id head;
  private ListaId tail;

  public ListaId(Id h) {
    head = h;
    tail = null;
  }
  public ListaId (Id h, ListaId t) {
    head = h;
    tail = t;
  }

  public Id getId() {
    return head;
  }
  public ListaId next() {
    return tail;
  }
} 