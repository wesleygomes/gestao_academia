package bd.beans;

public class Pessoa {

	private int cpf;
	private String nome;
	private String sexo;
	private String foto;
	private Cidade id_cidade;
	private Empresa id_empresa;

	public Pessoa() {

	}

	public Pessoa(int cpf, String nome, String sexo, String foto,
			Cidade id_cidade, Empresa id_empresa) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.sexo = sexo;
		this.foto = foto;
		this.id_cidade = id_cidade;
		this.id_empresa = id_empresa;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public Cidade getId_cidade() {
		return id_cidade;
	}

	public void setId_cidade(Cidade id_cidade) {
		this.id_cidade = id_cidade;
	}

	public Empresa getId_empresa() {
		return id_empresa;
	}

	public void setId_empresa(Empresa id_empresa) {
		this.id_empresa = id_empresa;
	}
}
