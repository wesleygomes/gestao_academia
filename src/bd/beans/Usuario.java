package bd.beans;

public class Usuario {

	private int login;
	private String nome;
	private String senha;
	private Tipo_usuario id_tipousuario;
	private Pessoa cpf;

	public Usuario() {

	}

	public Usuario(int login, String nome, String senha,
			Tipo_usuario id_tipousuario, Pessoa cpf) {
		super();
		this.login = login;
		this.nome = nome;
		this.senha = senha;
		this.id_tipousuario = id_tipousuario;
		this.cpf = cpf;
	}

	public int getLogin() {
		return login;
	}

	public void setLogin(int login) {
		this.login = login;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Tipo_usuario getCodigo() {
		return id_tipousuario;
	}

	public void setCodigo(Tipo_usuario codigo) {
		this.id_tipousuario = codigo;
	}

	public Pessoa getCpf() {
		return cpf;
	}

	public void setCpf(Pessoa cpf) {
		this.cpf = cpf;
	}
}
