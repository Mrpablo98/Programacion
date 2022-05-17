package ejercicio1;

	enum tema{Aventuras, Biografia, Ciencia, Economia, Historia, Informatica};
	enum formato{Cartone, Rustico, Tapa_dura};
	enum estado{Novedad, Reedicion};
	
public class Libro {
	
	

	private String autor;
	private String titulo;
	private int n_paginas;
	private tema tema;
	private estado estado;
	private formato formato;
	
	
	public Libro(String autor, String titulo, int n_paginas, tema tema, formato formato, estado estado) {
		
		this.autor=autor;
		this.titulo=titulo;
		this.n_paginas=n_paginas;
		this.tema=tema;
		this.formato=formato;
		this.estado=estado;
		
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public int getN_paginas() {
		return n_paginas;
	}


	public void setN_paginas(int n_paginas) {
		this.n_paginas = n_paginas;
	}


	public tema getTema() {
		return tema;
	}


	public void setTema(tema tema) {
		this.tema = tema;
	}


	public estado getEstado() {
		return estado;
	}


	public void setEstado(estado estado) {
		this.estado = estado;
	}


	public formato getFormato() {
		return formato;
	}


	public void setFormato(formato formato) {
		this.formato = formato;
	}
	
	@Override
	public String toString() {
		return "Libro [autor=" + autor + ", titulo=" + titulo + ", n_paginas=" + n_paginas + ", tema=" + tema
				+ ", estado=" + estado + ", formato=" + formato + "]";
	}

	
}
