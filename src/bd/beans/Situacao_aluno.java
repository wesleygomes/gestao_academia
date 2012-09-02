package bd.beans;

import javax.xml.soap.Text;

public class Situacao_aluno {

	private int id_situacao;
	private Text descricao;

	public Situacao_aluno() {

	}

	public Situacao_aluno(int id_situacao, Text descricao) {
		super();
		this.id_situacao = id_situacao;
		this.descricao = descricao;
	}

	public int getId_situacao() {
		return id_situacao;
	}

	public void setId_situacao(int id_situacao) {
		this.id_situacao = id_situacao;
	}

	public Text getDescricao() {
		return descricao;
	}

	public void setDescricao(Text descricao) {
		this.descricao = descricao;
	}
}
