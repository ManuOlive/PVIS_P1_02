public class Hora {
    private Integer segundo;
    private Integer minuto;
    private Integer hora;

    public Hora(Integer segundo, Integer minuto, Integer hora) {
        this.segundo = segundo;
        this.minuto = minuto;
        this.hora = hora;
    }

    public Integer getSegundo() {
        return segundo;
    }

    public void setSegundo(Integer segundo) {
        this.segundo = segundo;
    }

    public Integer getMinuto() {
        return minuto;
    }

    public void setMinuto(Integer minuto) {
        this.minuto = minuto;
    }

    public Integer getHora() {
        return hora;
    }

    public void setHora(Integer hora) {
        this.hora = hora;
    }
    public Hora(int s, int m, int h){
        this.segundo=s;
        this.minuto=m;
        this.hora=h;
    }
    public void aumentar(){
        segundo = segundo + 1;
           if (segundo > 59){
               segundo = 0;
               minuto = minuto + 1;
               if(minuto > 59){
                   minuto = 0;
                   hora = hora + 1;
                   if(hora > 23){
                       hora = 0;
                   }
               }
           }
    }
    public String toString(){
      return ": " + hora + " : " + minuto + " : " + segundo;
    }
}
