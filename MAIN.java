package jugadores;

import javax.swing.JOptionPane;
import javax.swing.SpringLayout;

public class MAIN {

    public static void main(String[] args) {
        //Instanciamiento, utilizacion y llamado de métodos de Pila
        Pila Jugadores = new Pila(); //Creamos el objeto en la clase Pila 
        //Agregamos jugadores a la pila 
        Jugadores.AgregarJugador("Jugador 1", " 1 "); 
        Jugadores.AgregarJugador("Jugador 2", " 2 ");
        Jugadores.AgregarJugador("Jugador 3", " 3 "); 
        Jugadores.AgregarJugador("Jugador 4", " 4 "); 
        Jugadores.AgregarJugador("Jugador 5", " 5 "); 
        Jugadores.MostrarJugadores(); //Imprimimos los jugadores 

        System.out.println("\n"); 
        System.out.println("A continuacion se eliminara el último jugador ingresado");
        System.out.println("Eliminando el jugador 5 "); 
        Jugadores.QuitarJugador(); //Eliminamos al jugador 
        Jugadores.MostrarJugadores(); //Mostramos los jugadores restantes
        
        //Instanciamiento, utilizacion y llamado de métodos de Cola 
        Cola cola = new Cola(); //Creamos el objeto en la clase Cola 
        //Agregamos partidas a la cola
        cola.encolarPartida("Partida 1");
        cola.encolarPartida("Partida 2"); 
        cola.encolarPartida("Partida 3"); 
        cola.encolarPartida("Partida 4"); 
        cola.encolarPartida("Partida 5");  

        
        System.out.println("Partida en curso");
        NodosCola partidaEnComienzo = cola.partidaEnProgreso(); //Obtenemos la partida que está en progreso 
        System.out.print(partidaEnComienzo.toString()); //Mostramos la partida en curso 

        //Mostramos las partidas que aún se encuentran en lista de espera mediante el método para imprimir la cola
        System.out.println("");
        System.out.println("Partidas restantes en espera:");
        cola.imprimirCola();
    }
}
