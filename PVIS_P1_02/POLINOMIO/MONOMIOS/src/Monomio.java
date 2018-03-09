public class Monomio {
    private Integer coeficiente;
    private Integer exponente;
    public Monomio (Integer c,Integer e){
        this.coeficiente=c;
        this.exponente=e;
    }
    public void setCoeficiente(Integer c){
        this.coeficiente=c;
    }
    public Integer getCoeficiente(){
        return coeficiente;
    }
    public void setExponente(Integer e){
        this.exponente=e;
    }
    public Integer getExponente(){
        return exponente;
    }
    public String toString(){
        if(coeficiente>0){
            return String.format("+%d x^%d",coeficiente,exponente);
        }else{
            return String.format("%d x^%d",coeficiente,exponente);
        }
    }
    public static void main(String[] args){
        Polinomio primero = new Polinomio();
        primero.add(new Monomio(5,2));
        primero.add(new Monomio(7,3));
        Polinomio segundo = new Polinomio();
        segundo.add(new Monomio(3,8));
        segundo.add(new Monomio(3,2));
        primero.adicionar(segundo);
        Polinomio p = new Polinomio();
        Polinomio resul = new Polinomio();
        Monomio mono = new Monomio(5,2);
        Monomio mono1 = new Monomio(7,4);
        Monomio mono2 = new Monomio(3,8);
        Monomio mono3 = new Monomio(3,9);
        p.add(mono);
        p.add(mono1);
        p.add(mono2);
        p.add(mono3);
        System.out.println("Polinomio: "+p);
        System.out.println("Simplificacion: "+primero);
    }
}
