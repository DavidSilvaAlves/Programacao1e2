package programacao1.terca.aovivo.aula09;

public class Calca extends Vestuario { // aplicando Heran�a

	private boolean temCinto;

	@Override
	public String toString() {
		return super.toString() + " Calca [temCinto=" + temCinto + "]";
	}

	public boolean isTemCinto() {
		return temCinto;
	}

	public void setTemCinto(boolean temCinto) {
		this.temCinto = temCinto;
	}

}
