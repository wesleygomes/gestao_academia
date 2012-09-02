package financeiro.usuario;

import java.util.List;
import java.util.Locale;
import financeiro.util.DAOFactory;
import financeiro.util.RNException;
import financeiro.util.UtilException;

public class UsuarioRN {

	private UsuarioDAO usuarioDAO;

	public UsuarioRN() {
		this.usuarioDAO = DAOFactory.criarUsuarioDAO();
	}

	public Usuario carregar(Integer codigo) {
		return this.usuarioDAO.carregar(codigo);
	}

	public Usuario buscarPorLogin(String login) {
		return this.usuarioDAO.buscarPorLogin(login);
	}

	public void salvar(Usuario usuario) {

		Integer codigo = usuario.getCodigo();
		if (codigo == null || codigo == 0) {

			//usuario.getPermissao().add("ROLE_USUARIO");

			this.usuarioDAO.salvar(usuario);

		} else {
			System.out.println("erro doido");
			//this.usuarioDAO.atualizar(usuario);
		}
	}

	public void excluir(Usuario usuario) {

		this.usuarioDAO.excluir(usuario);
	}

	public List<Usuario> listar() {
		return this.usuarioDAO.listar();
	}

}