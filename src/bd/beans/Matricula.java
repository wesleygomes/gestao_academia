package bd.beans;

import java.util.Calendar;

public class Matricula {

	private int id_matricula;
	private Calendar data_matricula;
	private Boolean situacao_matricula;
	private Calendar data_cancelamento;
	private String motivo_cancelamento;

	public Matricula() {

	}

	public Matricula(int id_matricula, Calendar data_matricula,
			Boolean situacao_matricula, Calendar data_cancelamento,
			String motivo_cancelamento) {
		super();
		this.id_matricula = id_matricula;
		this.data_matricula = data_matricula;
		this.situacao_matricula = situacao_matricula;
		this.data_cancelamento = data_cancelamento;
		this.motivo_cancelamento = motivo_cancelamento;
	}

	public int getId_matricula() {
		return id_matricula;
	}

	public void setId_matricula(int id_matricula) {
		this.id_matricula = id_matricula;
	}

	public Calendar getData_matricula() {
		return data_matricula;
	}

	public void setData_matricula(Calendar data_matricula) {
		this.data_matricula = data_matricula;
	}

	public Boolean getSituacao_matricula() {
		return situacao_matricula;
	}

	public void setSituacao_matricula(Boolean situacao_matricula) {
		this.situacao_matricula = situacao_matricula;
	}

	public Calendar getData_cancelamento() {
		return data_cancelamento;
	}

	public void setData_cancelamento(Calendar data_cancelamento) {
		this.data_cancelamento = data_cancelamento;
	}

	public String getMotivo_cancelamento() {
		return motivo_cancelamento;
	}

	public void setMotivo_cancelamento(String motivo_cancelamento) {
		this.motivo_cancelamento = motivo_cancelamento;
	}

}
