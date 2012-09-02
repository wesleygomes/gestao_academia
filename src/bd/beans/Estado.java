package bd.beans;

import javax.xml.soap.Text;

public class Estado {

	private int sigla;
	private Text descricao;

	public Estado() {

	}

	public Estado(int sigla, Text descricao) {
		super();
		this.sigla = sigla;
		this.descricao = descricao;
	}

	public int getSigla() {
		return sigla;
	}

	public void setSigla(int sigla) {
		this.sigla = sigla;
	}

	public Text getDescricao() {
		return descricao;
	}

	public void setDescricao(Text descricao) {
		this.descricao = descricao;
	}
}
