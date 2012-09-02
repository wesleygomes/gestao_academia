package bd.beans;

import javax.xml.soap.Text;

public class Tipo_funcionario {

	private int id_tipofuncionario;
	private String cargo;
	private Text observacao;

	public Tipo_funcionario() {

	}

	public Tipo_funcionario(int id_tipofuncionario, String cargo,
			Text observacao) {
		super();
		this.id_tipofuncionario = id_tipofuncionario;
		this.cargo = cargo;
		this.observacao = observacao;
	}

	public int getId_tipofuncionario() {
		return id_tipofuncionario;
	}

	public void setId_tipofuncionario(int id_tipofuncionario) {
		this.id_tipofuncionario = id_tipofuncionario;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Text getObservacao() {
		return observacao;
	}

	public void setObservacao(Text observacao) {
		this.observacao = observacao;
	}

}
