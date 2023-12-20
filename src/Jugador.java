public class Jugador extends Alvariño {
    boolean eligeprimero;
    boolean mueveprimero;
    int estado; // 0 aturdido, 1 atacando, 2 bloqueando, 3 casteando una habilidad, 4 canalizando maná, 5 canalizando energía
    int contadores_aturdimiento;
    boolean haRecibidoDañoEsteTurno;
    public Jugador(boolean eligeprimero, boolean mueveprimero, int estado, int contadores_aturdimiento,
            boolean haRecibidoDañoEsteTurno) {
        this.eligeprimero = eligeprimero;
        this.mueveprimero = mueveprimero;
        this.estado = estado;
        this.contadores_aturdimiento = contadores_aturdimiento;
        this.haRecibidoDañoEsteTurno = haRecibidoDañoEsteTurno;
    }
    public Jugador(double ataque, double magia, double vida, double def_fis, double def_mag, double escudo,
            double velocidad, double mana, double maxmana, double energia, int idhabilidadpasiva, int idhabilidad1, int idhabilidad2, 
            int idhabilidad3, int idhabilidad4, int idhabilidad5, boolean eligeprimero, boolean mueveprimero,
            int estado, int contadores_aturdimiento, boolean haRecibidoDañoEsteTurno) {
        super(ataque, magia, vida, def_fis, def_mag, escudo, velocidad, mana, maxmana, energia, idhabilidadpasiva, idhabilidad1, idhabilidad2, 
        idhabilidad3, idhabilidad4, idhabilidad5);
        this.eligeprimero = eligeprimero;
        this.mueveprimero = mueveprimero;
        this.estado = estado;
        this.contadores_aturdimiento = contadores_aturdimiento;
        this.haRecibidoDañoEsteTurno = haRecibidoDañoEsteTurno;
    }
    public boolean getEligeprimero() {
        return this.eligeprimero;
    }
    public void setEligeprimero(boolean eligeprimero) {
        this.eligeprimero = eligeprimero;
    }
    public boolean getMueveprimero() {
        return this.mueveprimero;
    }
    public void setMueveprimero(boolean mueveprimero) {
        this.mueveprimero = mueveprimero;
    }
    public int getEstado() {
        return this.estado;
    }
    public void setEstado(int estado) {
        this.estado = estado;
    }
    public int getContadores_aturdimiento() {
        return this.contadores_aturdimiento;
    }
    public void setContadores_aturdimiento(int contadores_aturdimiento) {
        this.contadores_aturdimiento = contadores_aturdimiento;
    }
    public boolean haRecibidoDañoEsteTurno() {
        return this.haRecibidoDañoEsteTurno;
    }
    public void setHaRecibidoDañoEsteTurno(boolean haRecibidoDañoEsteTurno) {
        this.haRecibidoDañoEsteTurno = haRecibidoDañoEsteTurno;
    }


    public void atacar(double ataque, boolean haRecibidoDañoEsteTurno, Jugador querecibeeldaño) {
        this.estado = 1;

        double calculo_de_daño = (this.ataque/2)-(querecibeeldaño.getDef_fis());
        if (calculo_de_daño < 0){
            calculo_de_daño = 0;
        }
        if (this.energia > 0){
        if(this.haRecibidoDañoEsteTurno == true){
            if(querecibeeldaño.getEstado() == 2){
                querecibeeldaño.setVida(querecibeeldaño.getVida()- (calculo_de_daño/2));
            }
            else{
            querecibeeldaño.setVida(querecibeeldaño.getVida()-((this.ataque/2)));
            }
        }
        else{
            if(querecibeeldaño.getEstado() == 2){
                querecibeeldaño.setVida(querecibeeldaño.getVida()- (calculo_de_daño));
            }
            else{
            querecibeeldaño.setVida(querecibeeldaño.getVida()-(this.ataque));
            }
        }
        if (calculo_de_daño > 0)
        querecibeeldaño.setHaRecibidoDañoEsteTurno(true);
    }
}
    public void bloquear(double def_fis, boolean mueveprimero, Jugador queataca) {
        this.estado = 2;
    }
    
    public void usarhabilidad(){
        this.estado = 3;
        System.out.println("Has usado una habilidad (Funcionalidad añadida más adelante)");
    }
    public void canalizarMana(){
        this.estado = 4;
        System.out.println("Has canalizado maná (Funcionalidad añadida más adelante)");
    }
    public void canalizarEnergia(){
        this.estado = 5;
        if(this.haRecibidoDañoEsteTurno == true){
        this.energia = energia + 1;
        }
        else{
        this.energia = energia + 2;
        }
    }
    public void findeturnoenergia (){
        if (this.estado == 1){
            this.energia = (this.energia-1);
        }
        if (this.haRecibidoDañoEsteTurno == true && this.estado != 2){
            this.energia = (this.energia-1);
        }
        if (this.energia < 0){
            this.energia = 0;
        }
        this.energia++;
    }
    public void findeturnoreset (){
        this.haRecibidoDañoEsteTurno == false;
    }
}

