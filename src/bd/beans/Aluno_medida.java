package bd.beans;

import java.util.Calendar;
import javax.xml.soap.Text;

public class Aluno_medida {

	private int id_alunomedida;
	private Calendar data;
	private float biceps_direito;
	private float biceps_esquerdo;
	private float coxa_direita;
	private float coxa_esquerda;
	private float peso;
	private float altura;
	private float peitoral;
	private float gordura_abdominal;
	private float pant_direita;
	private float pant_esquerda;
	private float cintura;
	private float quadril;
	private Text observacao;
	private Aluno id_aluno;

	public Aluno_medida() {

	}

	public Aluno_medida(int id_alunomedida, Calendar data,
			float biceps_direito, float biceps_esquerdo, float coxa_direita,
			float coxa_esquerda, float peso, float altura, float peitoral,
			float gordura_abdominal, float pant_direita, float pant_esquerda,
			float cintura, float quadril, Text observacao, Aluno id_aluno) {
		super();
		this.id_alunomedida = id_alunomedida;
		this.data = data;
		this.biceps_direito = biceps_direito;
		this.biceps_esquerdo = biceps_esquerdo;
		this.coxa_direita = coxa_direita;
		this.coxa_esquerda = coxa_esquerda;
		this.peso = peso;
		this.altura = altura;
		this.peitoral = peitoral;
		this.gordura_abdominal = gordura_abdominal;
		this.pant_direita = pant_direita;
		this.pant_esquerda = pant_esquerda;
		this.cintura = cintura;
		this.quadril = quadril;
		this.observacao = observacao;
		this.id_aluno = id_aluno;
	}

	public int getId_alunomedida() {
		return id_alunomedida;
	}

	public void setId_alunomedida(int id_alunomedida) {
		this.id_alunomedida = id_alunomedida;
	}

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}

	public float getBiceps_direito() {
		return biceps_direito;
	}

	public void setBiceps_direito(float biceps_direito) {
		this.biceps_direito = biceps_direito;
	}

	public float getBiceps_esquerdo() {
		return biceps_esquerdo;
	}

	public void setBiceps_esquerdo(float biceps_esquerdo) {
		this.biceps_esquerdo = biceps_esquerdo;
	}

	public float getCoxa_direita() {
		return coxa_direita;
	}

	public void setCoxa_direita(float coxa_direita) {
		this.coxa_direita = coxa_direita;
	}

	public float getCoxa_esquerda() {
		return coxa_esquerda;
	}

	public void setCoxa_esquerda(float coxa_esquerda) {
		this.coxa_esquerda = coxa_esquerda;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getPeitoral() {
		return peitoral;
	}

	public void setPeitoral(float peitoral) {
		this.peitoral = peitoral;
	}

	public float getGordura_abdominal() {
		return gordura_abdominal;
	}

	public void setGordura_abdominal(float gordura_abdominal) {
		this.gordura_abdominal = gordura_abdominal;
	}

	public float getPant_direita() {
		return pant_direita;
	}

	public void setPant_direita(float pant_direita) {
		this.pant_direita = pant_direita;
	}

	public float getPant_esquerda() {
		return pant_esquerda;
	}

	public void setPant_esquerda(float pant_esquerda) {
		this.pant_esquerda = pant_esquerda;
	}

	public float getCintura() {
		return cintura;
	}

	public void setCintura(float cintura) {
		this.cintura = cintura;
	}

	public float getQuadril() {
		return quadril;
	}

	public void setQuadril(float quadril) {
		this.quadril = quadril;
	}

	public Text getObservacao() {
		return observacao;
	}

	public void setObservacao(Text observacao) {
		this.observacao = observacao;
	}

	public Aluno getId_aluno() {
		return id_aluno;
	}

	public void setId_aluno(Aluno id_aluno) {
		this.id_aluno = id_aluno;
	}
}
