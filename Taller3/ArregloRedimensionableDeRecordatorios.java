package aed;

class ArregloRedimensionableDeRecordatorios implements SecuenciaDeRecordatorios {

    private Recordatorio[] _recordatorios;

    public ArregloRedimensionableDeRecordatorios() {
        Recordatorio[] res = new Recordatorio[0];
        _recordatorios = res;
    }
// no funciona la creacion del vector y no entiendo porque //
    public ArregloRedimensionableDeRecordatorios(ArregloRedimensionableDeRecordatorios vector) {
        Recordatorio[] res = new Recordatorio[vector._recordatorios.length];
        for (int i = 0; i < vector._recordatorios.length; i++) {
            res[i] = vector._recordatorios[i];
        }
        _recordatorios = res;
    }

    public int longitud(){
        return _recordatorios.length;
            
    }

    @Override
    public void agregarAtras(Recordatorio i) {
        Recordatorio[] res = new Recordatorio[_recordatorios.length + 1];
        for (int j = 0; j < _recordatorios.length; j++) {
            res[j] = this._recordatorios[j]; 
        }
        res[res.length - 1] = i;
        _recordatorios = res;
    }

    public Recordatorio obtener(int i) {
        return _recordatorios[i];
    }

    public void quitarAtras() {
        Recordatorio[] res = new Recordatorio[_recordatorios.length - 1];
        for (int i = 0; i < _recordatorios.length-1; i++) {
            res[i] = _recordatorios[i];
        }
        _recordatorios = res;
    }

    public void modificarPosicion(int indice, Recordatorio valor) {
        _recordatorios[indice] = valor; 
    }

    public ArregloRedimensionableDeRecordatorios copiar() {
        ArregloRedimensionableDeRecordatorios res = new ArregloRedimensionableDeRecordatorios();
        for (int i=0; i<_recordatorios.length; i++){
            res._recordatorios[i] = this._recordatorios[i];
        }
        return  res;
    }

}
