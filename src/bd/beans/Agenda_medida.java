package bd.beans;

import java.util.Calendar;

public class Agenda_medida {

	private int id_agendamedida;
	private Calendar data;
	private Boolean situacao;
	private Aluno id_aluno;

	public Agenda_medida() {

	}

	public Agenda_medida(int id_agendamedida, Calendar data, Boolean situacao,
			Aluno id_aluno) {
		super();
		this.id_agendamedida = id_agendamedida;
		this.data = data;
		this.situacao = situacao;
		this.id_aluno = id_aluno;
	}

	public int getId_agendamedida() {
		return id_agendamedida;
	}

	public void setId_agendamedida(int id_agendamedida) {
		this.id_agendamedida = id_agendamedida;
	}

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}

	public Boolean getSituacao() {
		return situacao;
	}

	public void setSituacao(Boolean situacao) {
		this.situacao = situacao;
	}

	public Aluno getId_aluno() {
		return id_aluno;
	}

	public void setId_aluno(Aluno id_aluno) {
		this.id_aluno = id_aluno;
	}

}
