package company;

import company.Candidato;
import utils.Iban;
import utils.NSS;
import utils.Nif;

import java.time.LocalDate;

public class Traballador extends Candidato {
    private NSS nss;
    private LocalDate dataAlta;
    private Iban iban;
    private double salario;

    public Traballador(Nif dni, String anome, String direccion, String telefono, String email, LocalDate dataAlta, NSS nss, Iban iban, double salario) {
        super(dni, anome, direccion, telefono, email);
        this.dataAlta = dataAlta;
        this.nss = nss;
        this.iban = iban;
        this.salario = salario;
    }

    public Traballador(Candidato candidato, Traballador traballador) {
        super(traballador.dni, traballador.anome, traballador.direccion, traballador.telefono, traballador.email);
        this.dataAlta = traballador.dataAlta;
        this.nss = traballador.nss;
        this.iban = traballador.iban;
        this.salario = traballador.salario;
    }

    public NSS getNss() {
        return nss;
    }

    public LocalDate getDataAlta() {
        return dataAlta;
    }

    public Iban getIban() {
        return iban;
    }

    public void setIban(Iban iban) {
        this.iban = iban;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
