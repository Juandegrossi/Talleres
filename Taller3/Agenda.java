package aed;

public class Agenda {

    private Fecha _fecha;
    private ArregloRedimensionableDeRecordatorios _recordatorio;

    public Agenda(Fecha fechaActual) {
        Fecha fecha2 = new Fecha(fechaActual);
        _fecha=fecha2;
        _recordatorio = new ArregloRedimensionableDeRecordatorios();
    }

 // no funciona, verificar y de ultima preguntar //
    public void agregarRecordatorio(Recordatorio recordatorio) {
        _recordatorio.agregarAtras(recordatorio);

    }

    @Override
    public String toString() {
        String res = new String(_fecha.toString() + "\n=====\n");
        for (int i = 0; i < _recordatorio.longitud(); i++) {
            if (_recordatorio.obtener(i).fecha().equals(_fecha))
            res = res + _recordatorio.obtener(i).toString() + "\n";
        }
        return res;
    }

    public void incrementarDia() {
        Fecha fecha2 = new Fecha(_fecha);
        fecha2.incrementarDia();
        _fecha = fecha2;

    }

    public Fecha fechaActual() {
        Fecha res = new Fecha(_fecha);
        return res;
    }

}
