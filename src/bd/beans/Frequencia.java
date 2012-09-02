package bd.beans;

import java.util.Calendar;
import javax.xml.soap.Text;

public class Frequencia {

	private int id_frequencia;
	private Calendar data_inicio;
	private Calendar data_final;
	private Calendar horario;
	private Text observacao;
	private Aluno id_aluno;

	public Frequencia() {

	}

	public Frequencia(int id_frequencia, Calendar data_inicio,
			Calendar data_final, Calendar horario, Text observacao,
			Aluno id_aluno) {
		super();
		this.id_frequencia = id_frequencia;
		this.data_inicio = data_inicio;
		this.data_final = data_final;
		this.horario = horario;
		this.observacao = observacao;
		this.id_aluno = id_aluno;
	}

	public int getId_frequencia() {
		return id_frequencia;
	}

	public void setId_frequencia(int id_frequencia) {
		this.id_frequencia = id_frequencia;
	}

	public Calendar getData_inicio() {
		return data_inicio;
	}

	public void setData_inicio(Calendar data_inicio) {
		this.data_inicio = data_inicio;
	}

	public Calendar getData_final() {
		return data_final;
	}

	public void setData_final(Calendar data_final) {
		this.data_final = data_final;
	}

	public Calendar getHorario() {
		return horario;
	}

	public void setHorario(Calendar horario) {
		this.horario = horario;
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
