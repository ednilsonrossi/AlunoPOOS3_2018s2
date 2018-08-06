package model;

public class Aluno {
	private double notas[];
	
	public Aluno(double p1, double p2, double pp, double lab, double ex) {
		notas = new double[5];
		notas[0] = p1;
		notas[1] = p2;
		notas[2] = pp;
		notas[3] = lab;
		notas[4] = ex;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	
}
