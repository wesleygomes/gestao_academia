package bd.beans;

import javax.xml.soap.Text;

public class Cidade {

	private int id_cidade;
	private Text descricao;
	private Estado sigla;

	public Cidade() {

	}

	public Cidade(int id_cidade, Text descricao, Estado sigla) {
		super();
		this.id_cidade = id_cidade;
		this.descricao = descricao;
		this.sigla = sigla;
	}

	public int getId_cidade() {
		return id_cidade;
	}

	public void setId_cidade(int id_cidade) {
		this.id_cidade = id_cidade;
	}

	public Text getDescricao() {
		return descricao;
	}

	public void setDescricao(Text descricao) {
		this.descricao = descricao;
	}

	public Estado getSigla() {
		return sigla;
	}

	public void setSigla(Estado sigla) {
		this.sigla = sigla;
	}
}
