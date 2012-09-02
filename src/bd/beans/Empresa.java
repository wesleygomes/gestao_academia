package bd.beans;

import javax.xml.soap.Text;

public class Empresa {

	private int id_empresa;
	private String cnpj;
	private Text descricao;
	private Cidade id_cidade;

	public Empresa() {

	}

	public Empresa(int id_empresa, String cnpj, Text descricao, Cidade id_cidade) {
		super();
		this.id_empresa = id_empresa;
		this.cnpj = cnpj;
		this.descricao = descricao;
		this.id_cidade = id_cidade;
	}

	public int getId_empresa() {
		return id_empresa;
	}

	public void setId_empresa(int id_empresa) {
		this.id_empresa = id_empresa;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Text getDescricao() {
		return descricao;
	}

	public void setDescricao(Text descricao) {
		this.descricao = descricao;
	}

	public Cidade getId_cidade() {
		return id_cidade;
	}

	public void setId_cidade(Cidade id_cidade) {
		this.id_cidade = id_cidade;
	}
}
