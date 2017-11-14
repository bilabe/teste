package redesDeComputadores;

import java.time.LocalDate;

import java.util.Arrays;


public class RedeDeComputadores
{

	int cont;
	private String ip;
	private Computador[] listaComputadores = new Computador[50];
	
	public RedeDeComputadores(String ip, Computador[] listaComputadores) 
	{
		this.ip = ip;
		this.listaComputadores = listaComputadores;
	}
	
	public RedeDeComputadores()
	{

	}

	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public Computador[] getListaComputadores() {
		return listaComputadores;
	}
	public void setListaComputadores(Computador[] listaComputadores) {
		this.listaComputadores = listaComputadores;
	}
	
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RedeDeComputadores other = (RedeDeComputadores) obj;
		if (ip == null) {
			if (other.ip != null)
				return false;
		} else if (!ip.equals(other.ip))
			return false;
		if (!Arrays.equals(listaComputadores, other.listaComputadores))
			return false;
		return true;
	}

	public String toString()
	{
		return "RedeDeComputadores [ip=" + ip + ", listaComputadores=" + Arrays.toString(listaComputadores) + "]";
	}
	
	public void adicionaComputadorNaLista(Computador comp) 
	{
		if (cont < 50) 
		{
			this.listaComputadores[cont] = comp;
			cont++;
		}
	}
	
	public void listaComputadoresPorMarca(String marcacomp) 
	{
		for (int i = 0; i < cont; i++) 
		{
			Computador comp = listaComputadores[i];
			if (listaComputadores[i].getMarca().equals(marcacomp)) 
			{
				System.out.println(comp.toString());	
			}
		}
	}

	public void listaComputadoresPorModelo(String modelo) 
	{
		for (int i = 0; i < cont; i++) 
		{
			Computador comp = listaComputadores[i];
			if (listaComputadores[i].getModelo().equals(modelo)) 
			{
				System.out.println(comp.toString());
			}
		}
	}
	public int qtdComputadoresAdquiridosAposData(LocalDate data) 
	{
		int contdata = 0;
		for (int i = 0; i < cont; i++) 
		{
			if (listaComputadores[i].getDataAquisicao().isAfter(data)) 
			{
				contdata++;
			}
		}
		return contdata;
	}
	
	public int tamanho()
	{
		return this.cont;
	}

}
	

