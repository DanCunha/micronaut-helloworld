package micronaut.hello.world.dto;

import java.util.Date;

public class EventDTO {
	
	private Long id;
	private String nome;
	private Date DtEvento;
	private boolean status;
	private String descricao;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDtEvento() {
		return DtEvento;
	}
	public void setDtEvento(Date dtEvento) {
		DtEvento = dtEvento;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
