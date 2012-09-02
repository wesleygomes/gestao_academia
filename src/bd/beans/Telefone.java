package bd.beans;

import javax.xml.soap.Text;

public class Telefone {

	private int id_telefone;
	private int fone1;
	private int fone2;
	private int celular;
	private Text observacao;
	private Pessoa cpf;

	public Telefone() {

	}

	public Telefone(int id_telefone, int fone1, int fone2, int celular,
			Text observacao, Pessoa cpf) {
		super();
		this.id_telefone = id_telefone;
		this.fone1 = fone1;
		this.fone2 = fone2;
		this.celular = celular;
		this.observacao = observacao;
		this.cpf = cpf;
	}

	public int getId_telefone() {
		return id_telefone;
	}

	public void setId_telefone(int id_telefone) {
		this.id_telefone = id_telefone;
	}

	public int getFone1() {
		return fone1;
	}

	public void setFone1(int fone1) {
		this.fone1 = fone1;
	}

	public int getFone2() {
		return fone2;
	}

	public void setFone2(int fone2) {
		this.fone2 = fone2;
	}

	public int getCelular() {
		return celular;
	}

	public void setCelular(int celular) {
		this.celular = celular;
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
}
