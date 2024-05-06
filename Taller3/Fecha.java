package aed;

public class Fecha {

    private Integer _dia;  
    private Integer _mes; 

    public Fecha(int dia, int mes) {
        _dia = dia;
        _mes = mes;
    }

    public Fecha(Fecha fecha) {
       _dia = fecha._dia;
       _mes = fecha._mes ;
    }

    public Integer dia() {
        return _dia;
    }

    public Integer mes() {
        return _mes;
    }

    @Override
    public String toString() {
        return _dia + "/" + _mes;
    }

    @Override
    public boolean equals(Object otra) {
        if(otra == null || otra.getClass() != this.getClass()){
            return false;
        }
        else{
            Fecha otraFecha = (Fecha) otra;
            return (otraFecha._dia == _dia && otraFecha._mes == _mes);
        }
    }

    public void incrementarDia() {
        if(_dia != diasEnMes(_mes)){
            _dia += 1; 
        }
        else {
            _dia = 1;
            if (_mes == 12){_mes=1;}
            else{_mes +=1;}
        }
    }

    private int diasEnMes(int mes) {
        int dias[] = {
                // ene, feb, mar, abr, may, jun
                31, 28, 31, 30, 31, 30,
                // jul, ago, sep, oct, nov, dic
                31, 31, 30, 31, 30, 31
        };
        return dias[mes - 1];
    }

}
