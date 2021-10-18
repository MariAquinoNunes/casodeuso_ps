package pratica.domain;

import java.io.Serializable;
import java.util.Objects;

public class Categoria implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String nome;
	
	public Categoria() { //com esse construtor é possível instanciar objetos sem jogar nada para os atributos
		
	}

	public Categoria(Integer id, String nome) { //para gerar este construtor: Botão direito, source, Generate Constructor using Fields
		super();
		this.id = id;
		this.nome = nome;
	}
	//para gerar este construtor: Botão direito, source, Generate Getters e Setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	//para gerar este construtor: Botão direito, source, Generate HasCode and Equals

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categoria other = (Categoria) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	
	

}