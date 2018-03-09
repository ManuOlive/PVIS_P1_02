public class Reloj {
    private Fecha fecha;
    private Hora hora;
    public Reloj(Fecha fecha, Hora hora){
        this.fecha=fecha;
        this.hora=hora;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public Hora getHora() {
        return hora;
    }

    public void setHora(Hora hora) {
        this.hora = hora;
    }
    public Reloj(int s, int min, int h, int d, int m, int a){
        this.hora=new Hora(s,min,h);
        this.fecha=new Fecha(d,m,a);
    }
    public void aumentar(){
        this.hora.aumentar();
       if((this.hora.getHora()==0)&&(this.hora.getMinuto()==0)&&(this.hora.getSegundo()==0)){
           this.fecha.aumentar();
        }
    }
    public String toString(){
        return "La fecha es: " + fecha + " y La hora es " + hora; 
    }
}
