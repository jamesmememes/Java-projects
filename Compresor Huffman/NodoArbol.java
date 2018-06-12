
public class NodoArbol {
 Comparable value; 
 NodoArbol izquierdo; 
 NodoArbol derecho; 

 public NodoArbol (Comparable value) {
  this.value = value; 	 
 }
 
 public NodoArbol getArbolDerecho () {
  return this.derecho; 	 
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
