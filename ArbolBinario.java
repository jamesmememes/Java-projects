public class ArbolBinario {
 NodoArbol root; 
 CodigoHuffman codigo; 
 
 
 public ArbolBinario (Comparable letra, Comparable cantidad) { // todo arbol binario, tiene su codigo huffman. 
  root = null;
  CodigoHuffman codigo = new CodigoHuffman (letra, cantidad);
  this.codigo = codigo; 
 }
 
 public CodigoHuffman getCodigo () {
  return this.codigo;  
 }
 
 // ESTOS METODOS DE AÑADIR NODO SON PARA CREAR UN ARBOL BINARIO. NO TIENEN NADA QUE VER CON EL PROGRAMA. 
 public void addNewNodo (Comparable value) {
 NodoArbol nuevo = new NodoArbol (value); 	 
 NodoArbol temporal = root; 	 
 
 if (root != null) {
  add (nuevo, temporal); 	 
 }
 else {
  this.root = nuevo;  	 
 }
 
 }
		 
 
public void add (NodoArbol nuevo, NodoArbol temporal) { 
int entrada = rightOrLeft (nuevo, temporal);
switch(entrada) {

case 0: 
 if (temporal.getArbolIzquierdo() != null) {
  add (nuevo, temporal.getArbolIzquierdo()); 	 
 }
 else { // caso trivial, raiz nula
  temporal.setArbolIzquierdo(nuevo);	 
 }
	break; 
	
case 1: 
 if (temporal.getArbolDerecho() != null) {
  add (nuevo, temporal.getArbolDerecho()); 		
	}
	else { // caso trivial, raiz nula
		  temporal.setArbolDerecho(nuevo);	
	}
	
	break; 
	
default:
	// el valor que deseo ingresar ya se encuentra en el arbol. 
	break; 
}		
}


public int rightOrLeft (NodoArbol nuevo, NodoArbol temporal) {
int numero; 
if (nuevo.getValue().compareTo(temporal.getValue()) < 0) {
 numero = 0; 	 
}
else {
 if (nuevo.getValue().compareTo(temporal.getValue()) != 0) {
 numero = 1; 	 
 }
 else {
 numero = 2; 	 
 }
}
	
return numero; 
} 

}
