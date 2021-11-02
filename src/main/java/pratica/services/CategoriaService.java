package pratica.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pratica.domain.Categoria;
import pratica.repositories.CategoriaRepository;

@Service // serve para definir uma classe como pertencente à camada de Serviço da aplicação.
public class CategoriaService {
	@Autowired //instancia o objeto repo, fornece controle sobre onde e como a ligação entre os beans deve ser realizada. Pode ser usado para em métodos setter, no construtor, em uma propriedade ou métodos com nomes arbitrários e/ou vários argumentos.
	private CategoriaRepository repo; //serviço que busca categoria
	
	public Categoria find(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null);
	}
}
