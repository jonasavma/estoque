package utilitario;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.swing.JFrame;

public class Data extends JFrame{

    private String mes, dia, ano, dia_semana,hora;
    
    SimpleDateFormat horaFornatada = new SimpleDateFormat();
    
    public void le_hora(){
        Date horaAtual = new Date();
        hora = horaFornatada.format(horaAtual);
        
    }
    

    public void le_data() {
        LocalDate dataAtual = LocalDate.now();
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        dia = String.valueOf(dataAtual.getDayOfMonth());
        // mes = String.valueOf(dataAtual.getMonthValue());
        ano = String.valueOf(dataAtual.getYear());
        //dia_semana = dataAtual.getDayOfWeek();

        switch (dataAtual.getDayOfWeek()) {
            case SUNDAY:
                dia_semana = "Domingo";
                break;
            case MONDAY:
                dia_semana = "Segunda";
                break;
            case TUESDAY:
                dia_semana = "Terça";
                break;
            case WEDNESDAY:
                dia_semana = "Quarta";
                break;
            case THURSDAY:
                dia_semana = "Quinta";
                break;
            case FRIDAY:
                dia_semana = "Sexta";
                break;
            case SATURDAY:
                dia_semana = "Sábado";
                break;
            default:
                throw new AssertionError();
        }

        switch (dataAtual.getMonthValue()) {

            case 0:
                mes = "Janeiro";
                break;
            case 1:
                mes = "Fevereiro";
                break;
            case 2:
                mes = "Março";
                break;
            case 3:
                mes = "Abril";
                break;
            case 4:
                mes = "Maio";
                break;
            case 5:
                mes = "Junho";
                break;
            case 6:
                mes = "Julho";
                break;
            case 7:
                mes = "Agosto";
                break;
            case 8:
                mes = "Setembro";
                break;
            case 9:
                mes = "Outubro";
                break;
            case 10:
                mes = "Novembro";
                break;
            case 11:
                mes = "Dezembro";
                break;
        }

    }

    public String getMes() {
        return mes;
    }

    public void setMes( String mes ) {
        this.mes = mes;
    }

    public String getDia() {
        return dia;
    }

    public void setDia( String dia ) {
        this.dia = dia;
    }

    public String getAno() {
        return ano;
    }

    public void setAno( String ano ) {
        this.ano = ano;
    }

    public String getDia_semana() {
        return dia_semana;
    }

    public void setDia_semana( String dia_semana ) {
        this.dia_semana = dia_semana;
    }

    public String getHora() {
        return hora;
    }

    public void setHora( String hora ) {
        this.hora = hora;
    }

    public SimpleDateFormat getHoraFornatada() {
        return horaFornatada;
    }

    public void setHoraFornatada( SimpleDateFormat horaFornatada ) {
        this.horaFornatada = horaFornatada;
    }

}
