
public class Huffman {
String mensaje; 
ListaEnlazada lista = new ListaEnlazada(); 

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
	
	
	
	
}
