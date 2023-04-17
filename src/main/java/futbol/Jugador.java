package futbol;

public class Jugador extends Futbolista implements Comparable<Object> {
	public short golesMarcados;
	public byte dorsal;
	
	public Jugador(String nombre,int edad,String posicion,short golesMarcados,byte dorsal) {
		super(nombre,edad,posicion);
		this.golesMarcados=golesMarcados;
		this.dorsal=dorsal;
	}
	
	public Jugador() {
		super();
		this.golesMarcados=289;
		this.dorsal=7;
	}
	
	public int compareTo(Object f) {
		int dif=this.getEdad()-((Futbolista)f).getEdad();
		if(dif>0) {
			return dif;
		}
		else return -dif;
	}
	
	public String toString() {
		return "El futbolista "+this.getNombre()+" tiene "+this.getEdad()+ ", y juega de "+this.getPosicion()+" con el dorsal "+this.dorsal+ ". Ha marcado "+this.golesMarcados;
	}
	
	public boolean jugarConLasManos() {return false;}
	
	

}
