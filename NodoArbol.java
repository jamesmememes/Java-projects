
public class NodoArbol {
 Comparable value; 
 NodoArbol izquierdo; 
 NodoArbol derecho; 
 ArbolBinario left;
 ArbolBinario right; 
 

 public NodoArbol (Comparable value) {
  this.value = value; 	 
 }
 
 public NodoArbol getArbolDerecho () {
  return this.derecho; 	 
 }
 
 public ArbolBinario getArbolLeft() {
  return this.getArbolLeft(); 	  
 }
 
 public void setArBolLeft(ArbolBinario arbol) {
  this.left = arbol; 	 
 }
 
public ArbolBinario getArbolRight() {
 return this.getArbolRight(); 	
}

public void setArbolRight(ArbolBinario arbol) {
 this.right = arbol; 
}

 
 public NodoArbol getArbolIzquierdo() {
  return this.izquierdo; 	 
 }
 
 public void setArbolDerecho (NodoArbol derecho) {
  this.derecho = derecho; 	 
 }
 
 public void setArbolIzquierdo (NodoArbol izquierdo) {
  this.izquierdo = izquierdo; 	 
 }
 
 public void setValue (Comparable value) {
  this.value = value;  
 }
 
 public Comparable getValue () {
  return this.value; 	 
 }
 
 
	
}
