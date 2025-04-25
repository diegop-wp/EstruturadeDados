package EstruturaDeDados_Lista;

public class IteratorListaLigada<TIPO> {
    private Elemento<TIPO> elemento;

    public IteratorListaLigada(Elemento<TIPO>atual){
        this.elemento = atual;
    }

    public Boolean temProximo(){
        if (elemento.getProximo()== null){
            return false;
        }else {
            return true;
        }

    }

    public Elemento<TIPO> getProximo(){
        elemento = elemento.getProximo();
        return elemento;
    }
}
