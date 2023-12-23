public class Jugador extends Alvariño {
    private boolean eligeprimero;
    private boolean mueveprimero;
    private int estado; // 0 aturdido, 1 atacando, 2 bloqueando, 3 casteando una habilidad, 4 canalizando maná, 5 canalizando energía
    private int contadores_aturdimiento;
    private boolean haRecibidoDañoEsteTurno;
    private static int turno = 0;
    
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
    public Jugador(Alvariño Alvariño, boolean eligeprimero, boolean mueveprimero,
            int estado, int contadores_aturdimiento, boolean haRecibidoDañoEsteTurno) {
        this.ataque = Alvariño.ataque;
        this.magia = Alvariño.magia;
        this.vida = Alvariño.vida;
        this.def_fis = Alvariño.def_fis;
        this.def_mag = Alvariño.def_mag;
        this.escudo = Alvariño.escudo;
        this.velocidad = Alvariño.velocidad;
        this.mana = Alvariño.mana;
        this.maxmana = Alvariño.maxmana;
        this.energia = Alvariño.energia;
        this.idhabilidadpasiva = Alvariño.idhabilidadpasiva;
        this.idhabilidad1 = Alvariño.idhabilidad1;
        this.idhabilidad2 = Alvariño.idhabilidad2;
        this.idhabilidad3 = Alvariño.idhabilidad3;
        this.idhabilidad4 = Alvariño.idhabilidad4;
        this.idhabilidad5 = Alvariño.idhabilidad5;
    
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
    public static int getTurno() {
        return turno;
    }
    public static void setTurno(int turno) {
        Jugador.turno = turno;
    }
    @Override
    public String toString (){
        return ""+this.vida;
    }

    public void atacar(double ataque, boolean haRecibidoDañoEsteTurno, Jugador querecibeeldaño) {
        this.estado = 1;

        double calculo_de_daño = (this.ataque/2)-(querecibeeldaño.getDef_fis());
        if (calculo_de_daño < 0){
            calculo_de_daño = 0;
        }
        if (this.energia > 0){
        if(this.haRecibidoDañoEsteTurno == true){
            querecibeeldaño.setVida(querecibeeldaño.getVida()-((this.ataque/2)));
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
    public void bloquear() {
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
        this.haRecibidoDañoEsteTurno = false;
    }
    public void principioturnoj1actuaprimero (Jugador j2){
        double probabilidad = (this.velocidad/(this.velocidad+j2.getVelocidad()))*100; 
        double numero = (Math.random() * 100);
        if (numero > (100-probabilidad)){
            this.mueveprimero = true;
            j2.mueveprimero = false;
        }
        else{
            this.mueveprimero = false;
            j2.mueveprimero = true;
        }
    }
    public void principioturnoj1mueveprimero (Jugador j2){
        if (turno%2 == 1){
            this.eligeprimero = true;
            j2.eligeprimero = false;
        }
        else{
            this.eligeprimero = false;
            j2.eligeprimero = true;
        }
    }   
    public void finturnoavanzarturno (Jugador j2){
        turno++;
    }
}
