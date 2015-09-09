package ejercicios;

public class Funcionario {

	private String nom;
	private Integer sueldo;

	public Funcionario(String nombre, Integer cantDinero) {
		this.nom = nombre;
		this.sueldo = cantDinero;
	}

	public Funcionario() {
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Integer getSueldo() {
		return sueldo;
	}

	public void setSueldo(Integer sueldo) {
		this.sueldo = sueldo;
	}

}
