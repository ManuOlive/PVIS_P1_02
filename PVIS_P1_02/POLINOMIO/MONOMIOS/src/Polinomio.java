
import java.util.ArrayList;

public class Polinomio {

    private ArrayList<Monomio> elementos;

    public Polinomio() {
        elementos = new ArrayList<Monomio>();
    }
    public Integer tamanio(){
        return this.elementos.size();
    } 
    public Monomio obtener (Integer i){
        return this.elementos.get(i);
    }
    public void add(Monomio m) {
        this.elementos.add(m);
    }
    public String toString() {
        String acumulador = " ";
        for (int i = 0; i < this.elementos.size(); i++) {
            Monomio m = this.elementos.get(i);
            acumulador = acumulador + m.toString();
        }
        return acumulador;
    }

    public void Simplificar() {
        ArrayList <Monomio> temporal = new ArrayList<>();
        while(this.elementos.size()!=0){
            Monomio actual = this.elementos.remove(0);
            int i=0;
            while(i<this.elementos.size()){
                Monomio comparar = this.elementos.get(i);
                if(actual.getExponente().compareTo(comparar.getExponente())==0){
                    Integer nuevoCoeficiente = actual.getCoeficiente()+comparar.getCoeficiente();
                    actual.setCoeficiente(nuevoCoeficiente);
                    this.elementos.remove(i);
                }else{
                    i++;
                }
                temporal.add(actual);
            }
        }
        elementos=temporal; 
    }
    public String tuString(){
        return String.format("%d",elementos);
    }
    public void adicionar(Monomio m){
        this.elementos.add(m);
        this.Simplificar();
    }
    public void adicionar (Polinomio p){
        for(int i=0;i<p.tamanio();i++){
            Monomio aux = p.obtener(i);
            this.elementos.add(new Monomio(aux.getCoeficiente(),aux.getExponente()));
        }
        this.Simplificar();
    }
    public Integer youString() {
        Integer acumulador = 0;
        Integer acumulador2 = 0;
        for (int i = 0; i < this.elementos.size(); i++) {
            Monomio m = this.elementos.get(i);
            acumulador = (acumulador + (m.getCoeficiente() * m.getCoeficiente()));
        }
        for(int j = 0; j<this.elementos.size();j++){
            Monomio m = this.elementos.get(j);
            acumulador2 =  (acumulador2 + (m.getExponente() * m.getExponente()));
        }
        return acumulador + acumulador2;
    }
}
