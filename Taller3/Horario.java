package aed;

public class Horario {

    private Integer _minutos;
    private Integer _hora;

    public Horario(int hora, int minutos) {
        _hora = hora;
        _minutos = minutos;
    }

    public int hora() {
        return _hora;
    }

    public int minutos() {
        return _minutos;
    }

    @Override
    public String toString() {
        return _hora + ":" + _minutos;
    }

    @Override
    public boolean equals(Object otro) {
    if(otro == null || otro.getClass() != this.getClass()){
        return false;
    }
    else{
        Horario otraHora = (Horario) otro;
        return (otraHora._hora == _hora && otraHora._minutos == _minutos);
    }
    }

}
