package project;

public class ComponentaPc {

	private int cod_produs;

	private String pret;

	private String marca;

	private String an_fabricatie;

	private String garantie;

	private String producator;

	private String tara_provenienta;

	private int stoc;

	public ComponentaPc(int cod_produs, String pret, String marca, String an_fabricatie, String garantie,
			String producator, String tara_provenienta, int stoc) {
		this.an_fabricatie = an_fabricatie;
		this.cod_produs = cod_produs;
		this.garantie = garantie;
		this.marca = marca;
		this.pret = pret;
		this.producator = producator;
		this.stoc = stoc;
		this.tara_provenienta = tara_provenienta;
	}

	public ComponentaPc(String pret, String marca, String an_fabricatie, String garantie, String producator,
			String tara_provenienta, int stoc) {
		this(0, pret, marca, an_fabricatie, garantie, producator, tara_provenienta, stoc);
	}

	public int getCod_produs() {
		return cod_produs;
	}

	public void setCod_produs(int cod_produs) {
		this.cod_produs = cod_produs;
	}

	public String getPret() {
		return pret;
	}

	public void setPret(String pret) {
		this.pret = pret;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getAn_fabricatie() {
		return an_fabricatie;
	}

	public void setAn_fabricatie(String an_fabricatie) {
		this.an_fabricatie = an_fabricatie;
	}

	public String getGarantie() {
		return garantie;
	}

	public void setGarantie(String garantie) {
		this.garantie = garantie;
	}

	public String getProducator() {
		return producator;
	}

	public void setProducator(String producator) {
		this.producator = producator;
	}

	public String getTara_provenienta() {
		return tara_provenienta;
	}

	public void setTara_provenienta(String tara_provenienta) {
		this.tara_provenienta = tara_provenienta;
	}

	public int getStoc() {
		return stoc;
	}

	public void setStoc(int stoc) {
		this.stoc = stoc;
	}

}
