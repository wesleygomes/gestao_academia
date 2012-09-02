package bd.beans;

public class Tipo_usuario {

	private int id_tipousuario;
	private String privilegio;
	private String descricao;

	public Tipo_usuario() {

	}

	public Tipo_usuario(int id_tipousuario, String privilegio, String descricao) {
		super();
		this.id_tipousuario = id_tipousuario;
		this.privilegio = privilegio;
		this.descricao = descricao;
	}

	public int getId_tipousuario() {
		return id_tipousuario;
	}

	public void setId_tipousuario(int id_tipousuario) {
		this.id_tipousuario = id_tipousuario;
	}

	public String getPrivilegio() {
		return privilegio;
	}

	public void setPrivilegio(String privilegio) {
		this.privilegio = privilegio;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	
}
