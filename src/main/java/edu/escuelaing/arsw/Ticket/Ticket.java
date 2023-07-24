package edu.escuelaing.arsw.Ticket;

import java.util.ArrayList;
import java.util.List;

public class Ticket {
    private static Ticket instance = new Ticket();
    private List<String> listaTickets;
    private int numeroTicket;

    private Ticket(){
        listaTickets = new ArrayList<>();
        numeroTicket = 0;
    }

    public int getNumeroTicket(){
        return numeroTicket;
    }

    public List<String> getListaTickets(){
        return listaTickets;
    }

    public static Ticket getInstance() {
        return instance;
    }

    public synchronized int nuevoNumeroTicket(){
        int nuevoTicket = numeroTicket++;
        listaTickets.add(String.valueOf(nuevoTicket));
        return nuevoTicket;
    }

    public boolean cancelarTicket(String ticket) {
        if (listaTickets.contains(ticket)) {
            listaTickets.remove(ticket);
            return true;
        }
        return false;
    }
}
