package pratica.domain.enums;

public enum TipoCliente {
	PESSOAFISICA(1, "Pessoa Física"),
	PESSOAJURIDICA(2, "Pessoa Jurídica");
	private int cod;
	private String descricao;
	private TipoCliente(int cod, String descricao) { //Construtor do Tipo Enumerado é PRIVATE
	this.cod = cod;
	this.descricao = descricao;
	}
	public int getCod() { //Somente GET, uma vez que instancia um tipo enumerado não modifica mais o nome dele
		return cod;
	}
	public String getDescricao() {
		return descricao;
	}
	public static TipoCliente toEnum(Integer cod) { //
		if (cod == null) {
			 return null;
			 }
			 for (TipoCliente x : TipoCliente.values()) {
				 if (cod.equals(x.getCod())) { //faz uma varredura nos objetos
					 return x;
				 }
			 }
			 throw new IllegalArgumentException("Id inválido " + cod); 
			 }
			
private Integer tipo;
public TipoCliente getTipo() {
	return TipoCliente.toEnum(tipo);
}
public void setTipo(TipoCliente tipo) {
	this.tipo = tipo.getCod();
}
	}

