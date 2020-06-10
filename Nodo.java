
public class Nodo<T> {
    public Nodo Siguiente;
    private T Data;
    
    public Nodo(Nodo Sig, T Data){
    this.Siguiente= Sig;
    this.Data=Data;
    }
    
    public T obtenerData(){
    return Data;
    }
    public void ColocarData(T Data){
    this.Data=Data;
    }
    
    public String toString(){
    
    return "Data: "+Data;
    }
}
