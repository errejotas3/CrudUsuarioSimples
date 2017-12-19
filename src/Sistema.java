import java.util.HashMap;
import java.util.Scanner;

public class Sistema {

	public static void main(String[] args) {
		Usuario usuario = new Usuario();
		HashMap<String, Usuario> lista = new HashMap<String, Usuario>();
		String aux ="";
		Scanner teclado = new Scanner(System.in);
		do {
		System.out.println("Informe a opção desejada:");
		System.out.println("1 - Cadastrar usuário");
		System.out.println("2 - Listar usuários");
		System.out.println("3 - Alterar usuário");
		System.out.println("4 - Deletar usuário");
		
		
		aux = teclado.nextLine();
		
		String recebida = "";
		
		switch (aux) {
		case "1":
			System.out.println("Informe o nome do usuário: ");
			recebida = teclado.nextLine();
			usuario.setNome(recebida);
			System.out.println("Informe a idade: ");
			recebida = teclado.nextLine();
			usuario.setIdade(Integer.parseInt(recebida));
			System.out.println("Informe o cpf: ");
			recebida = teclado.nextLine();
			usuario.setCpf(Integer.parseInt(recebida));
			
			System.out.println("Novo usuário adicionado: ");
			System.out.println("Nome: " + usuario.getNome() + " || Idade: " + usuario.getIdade() + " || CPF: " + usuario.getCpf());
			lista.put(usuario.getNome(), usuario);
			break;
			
		case "2":
			for(String key : lista.keySet()) {
				System.out.println(key);
			}
			break;
		case "3":
			
			break;
			
		case "4":
			String remover ="";
			System.out.println("Quem vc deseja remover?");
			remover = teclado.nextLine();
			lista.remove(remover);
			

		default:
			break;
			
		}
		}while(!aux.equals("5"));
	}

}
