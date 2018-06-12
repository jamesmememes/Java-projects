public class Nodo {
 Comparable value;  
 Nodo nextOne; 
 ArbolBinario arbol; 
 
 public Nodo (Comparable value) {
 this.value = value; 
 }
 
 public void setArbolBinario (ArbolBinario arbol) {
  this.arbol = arbol;  	 
 }
 
 public ArbolBinario getArbol() {
  return this.arbol; 	 
 }
 
 
 public Comparable getValue () {
  return this.value; 	 
 }
 
 public void setValue (Comparable value) {
 this.value = value; 	 
 }
 
 public Nodo getNextOne () {
  return this.nextOne; 	 
 }
 
 public void setNextOne (Nodo nextOne) {
  this.nextOne = nextOne; 	 
 }
}
