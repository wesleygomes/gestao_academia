package bd.beans;

import java.util.Calendar;
import javax.xml.soap.Text;

public class Funcionario {

	private int id_funcionario;
	private Calendar data_entrada;
	private Calendar data_saida;
	private Boolean situacao;
	private int rg;
	private Text observacao;
	private int salario;
	private Empresa id_empresa;
	private Tipo_usuario id_tipofuncionario;
	private Matricula id_matricula;

	public Funcionario() {

	}

	public Funcionario(int id_funcionario, Calendar data_entrada,
			Calendar data_saida, Boolean situacao, int rg, Text observacao,
			int salario, Empresa id_empresa, Tipo_usuario id_tipofuncionario,
			Matricula id_matricula) {
		super();
		this.id_funcionario = id_funcionario;
		this.data_entrada = data_entrada;
		this.data_saida = data_saida;
		this.situacao = situacao;
		this.rg = rg;
		this.observacao = observacao;
		this.salario = salario;
		this.id_empresa = id_empresa;
		this.id_tipofuncionario = id_tipofuncionario;
		this.id_matricula = id_matricula;
	}

	public int getId_funcionario() {
		return id_funcionario;
	}

	public void setId_funcionario(int id_funcionario) {
		this.id_funcionario = id_funcionario;
	}

	public Calendar getData_entrada() {
		return data_entrada;
	}

	public void setData_entrada(Calendar data_entrada) {
		this.data_entrada = data_entrada;
	}

	public Calendar getData_saida() {
		return data_saida;
	}

	public void setData_saida(Calendar data_saida) {
		this.data_saida = data_saida;
	}

	public Boolean getSituacao() {
		return situacao;
	}

	public void setSituacao(Boolean situacao) {
		this.situacao = situacao;
	}

	public int getRg() {
		return rg;
	}

	public void setRg(int rg) {
		this.rg = rg;
	}

	public Text getObservacao() {
		return observacao;
	}

	public void setObservacao(Text observacao) {
		this.observacao = observacao;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	public Empresa getId_empresa() {
		return id_empresa;
	}

	public void setId_empresa(Empresa id_empresa) {
		this.id_empresa = id_empresa;
	}

	public Tipo_usuario getId_tipofuncionario() {
		return id_tipofuncionario;
	}

	public void setId_tipofuncionario(Tipo_usuario id_tipofuncionario) {
		this.id_tipofuncionario = id_tipofuncionario;
	}

	public Matricula getId_matricula() {
		return id_matricula;
	}

	public void setId_matricula(Matricula id_matricula) {
		this.id_matricula = id_matricula;
	}
}
