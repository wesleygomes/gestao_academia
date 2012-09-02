package bd.beans;

public class Endereco {

	private int id_endereco;
	private String rua;
	private String numero;
	private String bairro;
	private String complemento;
	private int cep;
	private Pessoa cpf;
	private Empresa id_empresa;

	public Endereco() {

	}

	public Endereco(int id_endereco, String rua, String numero, String bairro,
			String complemento, int cep, Pessoa cpf, Empresa id_empresa) {
		super();
		this.id_endereco = id_endereco;
		this.rua = rua;
		this.numero = numero;
		this.bairro = bairro;
		this.complemento = complemento;
		this.cep = cep;
		this.cpf = cpf;
		this.id_empresa = id_empresa;
	}

	public int getId_endereco() {
		return id_endereco;
	}

	public void setId_endereco(int id_endereco) {
		this.id_endereco = id_endereco;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}

	public Pessoa getCpf() {
		return cpf;
	}

	public void setCpf(Pessoa cpf) {
		this.cpf = cpf;
	}

	public Empresa getId_empresa() {
		return id_empresa;
	}

	public void setId_empresa(Empresa id_empresa) {
		this.id_empresa = id_empresa;
	}

}
