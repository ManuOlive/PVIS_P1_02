public class Fecha {
    private Integer dia;
    private Integer mes;
    private Integer anio;

    public Fecha(Integer dia, Integer mes, Integer anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public Integer getDia() {
        return dia;
    }

    public void setDia(Integer dia) {
        this.dia = dia;
    }

    public Integer getMes() {
        return mes;
    }

    public void setMes(Integer mes) {
        this.mes = mes;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }
    public Fecha(int d, int m, int a){
        this.dia=d;
        this.mes=m;
        this.anio=a;
    } 
    private Integer diaMes(){
       switch(this.mes){
           case 1:
           case 3:
           case 5:
           case 7:
           case 8:
           case 10:
           case 12:
               return 31;
           case 4:
           case 6:
           case 9:
           case 11:
               return 30;
           case 2:
               if(this.anio % 4 == 0){
                   return 29;
               }else{
                   return 28;
               }
           default: return 0;
       }
       
    }
    public void aumentar(){
        this.dia++;
        if(this.dia > this.diaMes()){
            this.dia = 1;
            this.mes++;
            if(this.mes > 12){
                this.mes = 1;
                this.anio++;
            }
        }
    }
    public String toString(){
      return " " + anio + " : " + mes + " : " + dia;
    }
}
