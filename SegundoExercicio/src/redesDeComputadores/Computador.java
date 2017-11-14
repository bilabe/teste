package redesDeComputadores;

import java.time.LocalDate;

public class Computador
{
	
	private String ip;
	private String marca;
	private String modelo;
	private LocalDate dataAquisicao;

	
	public Computador(String ip, String marca, String modelo, LocalDate dataAquisicao) 
	{
		this.ip = ip;
		this.marca = marca;
		this.modelo = modelo;
		this.dataAquisicao = dataAquisicao;
	}
	
	public Computador() 
	{
	}

	public String getIp() 
	{
		return ip;
	}
	public void setIp(String ip)
	{
		this.ip = ip;
	}
	public String getMarca()
	{
		return marca;
	}
	public void setMarca(String marca) 
	{
		this.marca = marca;
	}
	public String getModelo() 
	{
		return modelo;
	}
	public void setModelo(String modelo) 
	{
		this.modelo = modelo;
	}
	public LocalDate getDataAquisicao() 
	{
		return dataAquisicao;
	}
	public void setDataAquisicao(LocalDate dataAquisicao) 
	{
		this.dataAquisicao = dataAquisicao;
	}

	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Computador other = (Computador) obj;
		if (dataAquisicao == null) {
			if (other.dataAquisicao != null)
				return false;
		} else if (!dataAquisicao.equals(other.dataAquisicao))
			return false;
		if (ip == null) {
			if (other.ip != null)
				return false;
		} else if (!ip.equals(other.ip))
			return false;
		if (marca == null) {
			if (other.marca != null)
				return false;
		} else if (!marca.equals(other.marca))
			return false;
		if (modelo == null) {
			if (other.modelo != null)
				return false;
		} else if (!modelo.equals(other.modelo))
			return false;
		return true;
	}

	public String toString() 
	{
		return "Computador [ip=" + ip + ", marca=" + marca + ", modelo=" + modelo + ", dataAquisicao=" + dataAquisicao 
				+ "]";
	}
	
	
}
