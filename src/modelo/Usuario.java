package modelo;

public class Usuario {
	
	private String cuenta;
	private String contrase�a;

	public Usuario(){
		setCuenta("");
		setContrase�a("");
	}

	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	public String getContrase�a() {
		return contrase�a;
	}

	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}
}
