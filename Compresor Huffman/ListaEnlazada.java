public class ListaEnlazada {
Nodo head; 
	
public ListaEnlazada () {
 head = null; 		
}	

public void addOrden (Comparable letra, Comparable cantidad) { 
Nodo nuevo = new Nodo(cantidad); 
ArbolBinario arbol = new ArbolBinario (letra, cantidad); 
nuevo.setArbolBinario(arbol);
Nodo temporal = head;  
if (head != null) {
if (head.getValue().compareTo(cantidad) > 0) {
 nuevo.setNextOne(head); 
 head = nuevo; 	
}	
else {	
 while (temporal.getNextOne() != null && temporal.getNextOne().getValue().compareTo(cantidad) < 0) {
  temporal = temporal.getNextOne(); 	 
 }
 if (temporal.getNextOne() != null) {
  if (temporal.getNextOne().getValue().compareTo(cantidad) > 0) { 
    nuevo.setNextOne(temporal.getNextOne());
    temporal.setNextOne(nuevo);
  }
  else { 
	while (temporal.getNextOne() != null && 
	temporal.getNextOne().getValue().compareTo(cantidad) == 0) {
	 temporal = temporal.getNextOne();  		
	}  
	if (temporal.getClass() != null) {
	 nuevo.setNextOne(temporal.getNextOne()); 
     temporal.setNextOne(nuevo); 		
	}
	else {
	nuevo.setNextOne(null);
	temporal.setNextOne(nuevo);
	}
  }
 }
 else {
  temporal.setNextOne(nuevo);	 
 }
}	
}
else {
 head = nuevo; 	
}
	
}


public int getPosition (Comparable letra) {   
 Nodo temporal = head; 
 int position = 0; 
 if (head != null && head.getArbol().getCodigo().getLetra().compareTo(letra) != 0) {
  
  while (temporal.getNextOne() != null  && temporal.getNextOne().getArbol().getCodigo().getLetra().compareTo(letra) != 0) {
   temporal = temporal.getNextOne(); ++position; 	    
  }	
    if (temporal.getNextOne() != null) {
	 ++position;   	  
	 }
	 else {	 
	 position = -1; 
	 }
	}
	else {
     if (head == null) {	 
      position = -1;
     }
    }
 return position; 
}

public void print () {
String representacionTexto = ""; 	 
 Nodo temporal = head; 
 if (head != null) {
  representacionTexto+=""+head.getArbol().getCodigo().getLetra(); 	  
	  while (temporal.getNextOne() != null) { 
	 	temporal = temporal.getNextOne();   
	 	representacionTexto +="  "+temporal.getArbol().getCodigo().getLetra(); 
	  }
	  
 } 
System.out.println(representacionTexto); 
}





public void extraer (Comparable cantidad) { // funciona para una lista ordenada, si encuentra uno mayor, ya no busca.  
 Nodo temporal = head; 
 if (head != null) {
   if (head.getValue() != cantidad) {
    while (temporal.getNextOne() != null && temporal.getNextOne().getValue().compareTo(cantidad) < 0) {
     temporal = temporal.getNextOne(); 	
    }
    if (temporal.getNextOne() != null && temporal.getNextOne().getValue().compareTo(cantidad) == 0) { 
     if (temporal.getNextOne().getNextOne() != null) {
      temporal.setNextOne(temporal.getNextOne().getNextOne());	 
     }
     else {
      temporal.setNextOne(null);	 
     }
    }
   }
   else { 
	 if (head.getNextOne() != null) {
	   head = head.getNextOne(); 	 
	 }
	 else {
	   head = null; 	 
	 }
   }
 }
 
}

public void extraerPosition (int position) { // extrae una posicion de la lista. 
 Nodo temporal = head; 
 if (head != null) {
  if (position == 0) {
	head = head.getNextOne();   
  }
  else {
	int contador = 0;   
   while (temporal.getNextOne() != null && contador < (position-1)) {
	 temporal = temporal.getNextOne();   ++contador; 
   }
   if (temporal.getNextOne() != null) { 
	if (temporal.getNextOne().getNextOne() != null) {
	  temporal.setNextOne(temporal.getNextOne().getNextOne());	
	}
	else {
	 temporal.setNextOne(null);	
	}
   }
   else {
	 // de lo contrario, el siguiente es nulo y no encontre la posicion.    
   }
  }
	 
 }
}



public void extraerListaDesorden (Comparable elemento) { //funciona para listas desordenadas, busca hasta el final. 
 Nodo temporal = head; 
 if (head != null) {
  if (head.getValue() != elemento) {
	while (temporal.getNextOne() != null && temporal.getNextOne().getValue() != elemento) {
	 temporal = temporal.getNextOne(); 	
	}
	if (temporal.getNextOne() != null && temporal.getNextOne().getNextOne() != null) {
	  temporal.setNextOne(temporal.getNextOne().getNextOne()); 	
	}
	else {
	 if (temporal.getNextOne() != null) {
	   temporal.setNextOne(null);	 
	 }	
	}
  }
  else {
   head.setValue(null);   
  }
 }	
}

}
