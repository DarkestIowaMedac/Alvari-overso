public class Jugador extends Alvariño {
    int eligeprimero;
    int mueveprimero;
    int estado; // 0 aturdido, 1 atacando, 2 bloqueando, 3 casteando una habilidad, 4 canalizando maná, 5 canalizando energía
    int contadores_aturdimiento;
    boolean haRecibidoDañoEsteTurno;
    public Jugador(int eligeprimero, int mueveprimero, int estado, int contadores_aturdimiento,
            boolean haRecibidoDañoEsteTurno) {
        this.eligeprimero = eligeprimero;
        this.mueveprimero = mueveprimero;
        this.estado = estado;
        this.contadores_aturdimiento = contadores_aturdimiento;
        this.haRecibidoDañoEsteTurno = haRecibidoDañoEsteTurno;
    }
    public Jugador(double ataque, double magia, double vida, double def_fis, double def_mag, double escudo,
            double velocidad, double mana, double maxmana, double energia, int idhabilidadpasiva, int idhabilidad1, int idhabilidad2, 
            int idhabilidad3, int idhabilidad4, int idhabilidad5, int eligeprimero, int mueveprimero,
            int estado, int contadores_aturdimiento, boolean haRecibidoDañoEsteTurno) {
        super(ataque, magia, vida, def_fis, def_mag, escudo, velocidad, mana, maxmana, energia, idhabilidadpasiva, idhabilidad1, idhabilidad2, 
        idhabilidad3, idhabilidad4, idhabilidad5);
        this.eligeprimero = eligeprimero;
        this.mueveprimero = mueveprimero;
        this.estado = estado;
        this.contadores_aturdimiento = contadores_aturdimiento;
        this.haRecibidoDañoEsteTurno = haRecibidoDañoEsteTurno;
    }
    public int getEligeprimero() {
        return eligeprimero;
    }
    public void setEligeprimero(int eligeprimero) {
        this.eligeprimero = eligeprimero;
    }
    public int getMueveprimero() {
        return mueveprimero;
    }
    public void setMueveprimero(int mueveprimero) {
        this.mueveprimero = mueveprimero;
    }
    public int getEstado() {
        return estado;
    }
    public void setEstado(int estado) {
        this.estado = estado;
    }
    public int getContadores_aturdimiento() {
        return contadores_aturdimiento;
    }
    public void setContadores_aturdimiento(int contadores_aturdimiento) {
        this.contadores_aturdimiento = contadores_aturdimiento;
    }
    public boolean haRecibidoDañoEsteTurno() {
        return haRecibidoDañoEsteTurno;
    }
    public void setHaRecibidoDañoEsteTurno(boolean haRecibidoDañoEsteTurno) {
        this.haRecibidoDañoEsteTurno = haRecibidoDañoEsteTurno;
    }


    public void atacar(Jugador querecibeeldaño) {
        
    }
    public void bloquear() {

    }
    public void usarhabilidad(){
        
    }
    public void canalizarMana(){
        
    }
    public void canalizarEnergia(){

    }
}

