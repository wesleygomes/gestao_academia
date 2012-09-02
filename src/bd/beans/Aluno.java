package bd.beans;

import java.util.Calendar;
import javax.xml.soap.Text;

public class Aluno {

	private int id_aluno;
	private Calendar data_entrada;
	private Calendar data_saida;
	private Text observacao;
	private Pessoa cpf;
	private Situacao_aluno id_situacao;
	private Matricula id_matricula;

	public Aluno() {

	}

	public Aluno(int id_aluno, Calendar data_entrada, Calendar data_saida,
			Text observacao, Pessoa cpf, Situacao_aluno id_situacao,
			Matricula id_matricula) {
		super();
		this.id_aluno = id_aluno;
		this.data_entrada = data_entrada;
		this.data_saida = data_saida;
		this.observacao = observacao;
		this.cpf = cpf;
		this.id_situacao = id_situacao;
		this.id_matricula = id_matricula;
	}

	public int getId_aluno() {
		return id_aluno;
	}

	public void setId_aluno(int id_aluno) {
		this.id_aluno = id_aluno;
	}

	public Calendar getData_entrada() {
		return data_entrada;
	}

	public void setData_entrada(Calendar data_entrada) {
		this.data_entrada = data_entrada;
	}

	public Calendar getData_saida() {
		return data_saida;
	}

	public void setData_saida(Calendar data_saida) {
		this.data_saida = data_saida;
	}

	public Text getObservacao() {
		return observacao;
	}

	public void setObservacao(Text observacao) {
		this.observacao = observacao;
	}

	public Pessoa getCpf() {
		return cpf;
	}

	public void setCpf(Pessoa cpf) {
		this.cpf = cpf;
	}

	public Situacao_aluno getId_situacao() {
		return id_situacao;
	}

	public void setId_situacao(Situacao_aluno id_situacao) {
		this.id_situacao = id_situacao;
	}

	public Matricula getId_matricula() {
		return id_matricula;
	}

	public void setId_matricula(Matricula id_matricula) {
		this.id_matricula = id_matricula;
	}

}
