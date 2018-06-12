
public class Huffman {
String mensaje; 
ListaEnlazada lista = new ListaEnlazada();
int firstArbol = 0; 
int secondArbol = 1; 

public Huffman (String mensaje) {
 this.mensaje = mensaje; 	
 
 for (int i = 0; i < mensaje.length(); ++i) {
 String letraActual = Character.toString(mensaje.charAt(i)); 
 int contador = 1; 
 for (int h = i+1; h < mensaje.length(); ++h) {
	if (Character.toString(mensaje.charAt(h)).equals(letraActual)) {
	 ++contador; --h; mensaje = setNewString(mensaje, h+1);  
	} 
 }
 lista.addOrden(letraActual, contador); 
 }
 lista.print();  
}

public String setNewString (String mensaje, int posicion) {
return (mensaje.substring(0, posicion) + mensaje.substring(posicion+1, mensaje.length())); 	 
}
	
public void enlazarArboles() {
 for (int i = 0; i < (lista.getSize()-1); ++i) {	
	 
  Nodo first = lista.getNodoPosition(firstArbol); 
  Comparable cantidadFirst = first.getArbol().getCodigo().getCantidad(); 
  lista.extraerPosition(firstArbol);
  Nodo second = lista.getNodoPosition(secondArbol);  
  int cantidadSecond = (int) second.getArbol().getCodigo().getCantidad();
  lista.extraerPosition(secondArbol);
  int newCantidad = (int) cantidadFirst + cantidadSecond; 

  ArbolBinario arbol = new ArbolBinario(null, newCantidad); // creo un nuevo arbol con el peso de sus hijos.  	
  
  arbol.getRoot().setArbolLeft(first.getArbol()); // necesito el metodo setArbolIzquierdo. 
  
 }	
}
	
	
	
}
