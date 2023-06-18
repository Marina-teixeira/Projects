
package com.mycompany.atividade2;

/**
 *
 * @author Acer
 */
public class ListaEnc <T> {
	private Celula start,end;
	private int tamanho;
	
	//Construtor Lista
	public ListaEnc() {
		
	}
	
	//Gerar Lista
	public ListaEnc(T Elemento) {
		this.start = null;
		this.end = null;
		this.tamanho = 0;
	}
	
	//Adicionar ao inicio
	public void StartAdd(T Elemento) {
		Celula celulinha = new Celula(Elemento);
		if (this.tamanho == 0) {
			start= end= celulinha; 
			this.tamanho++;
		} else {
			celulinha.setProximo(start);
			start = celulinha;
			this.tamanho++;
		}	
	}
	
	//Remove Inicio:
		public void removeInicio(T Elemento) {
			if (this.tamanho == 0) {
				throw new IndexOutOfBoundsException("THE LIST IS IMEPITI");
			} else if (start == end) {
				start = end = null;
	            this.tamanho -= 1;
			} else {
				start = start.getProximo();
	            this.tamanho -= 1;
			}
		}
	
	//Adicionar ao fim:
		public void EndAdd(T Elemento) {
			Celula celulinha = new Celula(Elemento);
			if (this.tamanho == 0) {
				start= end= celulinha; 
				this.tamanho++;
			} else {
				celulinha.setProximo(end);
				end = celulinha;
				this.tamanho++;
			}	
		}
	//Removem Fim:
		public void removeFim(T Elemento) {
			if (this.tamanho == 0) {
				throw new IndexOutOfBoundsException("THE LIST IS EMPTY");
			} else if (end == start) {
				end = start = null;
	            this.tamanho -= 1;
			} else {
				end = end.getProximo();
	            this.tamanho -= 1;
			}
		}
		
	//Adicionar Objeto
		public void add(T Elemento, int Position) {
			if (Position < 0 || Position >= this.getTamanho()) {
		        throw new IndexOutOfBoundsException("Posição inválida");
		    } else {
		    Iterador it = new Iterador(this.start);
		    int i = 0;
		    while (it.hasNext()) {
		    	if(i!= Position) {
		    		it.next();
			    	i++;
		    	} else {
		    		break;
		    	}
		    }
		    Celula nova = new Celula(Elemento);
			nova.setElemento(nova);
		    }	
		}
		
	//Apagar Objeto:
		public void remove(int Position, T Elemento) {
			if (Position < 0 || Position >= this.getTamanho()) {
		        throw new IndexOutOfBoundsException("Posição inválida");
		    } else {
		    Iterador it = new Iterador(this.start);
		    int i = 0;
		    while (it.hasNext()) {
		    	if(i!= Position) {
		    		it.next();
			    	i++;
		    	} else {
		    		break;
		    	}
		    }
		    Celula nova = new Celula(null);
			nova.setElemento(nova);
		    }	
		}

			
	//Limpar Lista:
		public void eraser(Celula start, Celula end) {
			this.start = null;
			this.end = null;
		}
	//Existir dado:
		public boolean hasDado(T Elemento) {
			if (this.getTamanho() != 0) {
				return true;
			} else {
				return false;
			}
		}
		
	//Recuperar Objeto:
		public T Recupera(int Position) {
			if (Position < 0 || Position >= this.getTamanho()) {
		        throw new IndexOutOfBoundsException("Posição inválida");
		    } else {
		    Iterador it = new Iterador(this.start);
		    int i = 0;
		    while (it.hasNext()) {
		    	if(i!= Position) {
		    		it.next();
			    	i++;
		    	} else {
		    		break;
		    	}
		    }
		    return (T) it.getAtual().getElemento();
		    }	
		}

		public Celula getStart() {
			return start;
		}

		public void setStart(Celula start) {
			this.start = start;
		}

		public Celula getEnd() {
			return end;
		}

		public void setEnd(Celula end) {
			this.end = end;
		}

		public int getTamanho() {
			return tamanho;
		}

		public void setTamanho(int tamanho) {
			this.tamanho = tamanho;
		}

}


