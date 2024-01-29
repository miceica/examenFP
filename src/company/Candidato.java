package company;

import utils.Nif;

public class Candidato {

    protected Nif dni;
    protected String anome;
    protected String direccion;
    protected String telefono;
    protected String email;

    public Candidato(Nif dni, String anome, String direccion, String telefono, String email) {
        this.dni = dni;
        this.anome = anome;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }

    public Candidato(Candidato candidato){
        this.dni = candidato.dni;
        this.anome = candidato.anome;
        this.direccion = candidato.direccion;
        this.telefono = candidato.telefono;
        this.email = candidato.email;
    }

    public Nif getDni() {
        return dni;
    }

    public String getAnome() {
        return anome;
    }

    public void setAnome(String apellidosNombre) {
        this.anome = apellidosNombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "[" + dni + "] " + anome;
    }
}
