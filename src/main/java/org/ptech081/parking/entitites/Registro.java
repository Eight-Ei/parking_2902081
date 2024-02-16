package org.ptech081.parking.entitites;
import java.time.LocalDate;
import java.time.LocalTime;

    public class Registro {
        

        //Atributos intrínsecos
        public LocalDate fechaInicio;
        public LocalTime horaInicio;
        public LocalDate fechaFin;
        public LocalTime horaFin;
        public Long valor;

        //Atributos de relación

        public Cupo cupo;
        public Carro carro;
        public Cliente cliente;
        public Empleado empleado;


        //Constructores
        public Registro() {
        }


        public Registro(LocalDate fechaInicio, LocalTime horaInicio, LocalDate fechaFin, LocalTime horaFin, Long valor,
                Cupo cupo, Carro carro, Cliente cliente, Empleado empleado) {
            this.fechaInicio = fechaInicio;
            this.horaInicio = horaInicio;
            this.fechaFin = fechaFin;
            this.horaFin = horaFin;
            this.valor = valor;
            this.cupo = cupo;
            this.carro = carro;
            this.cliente = cliente;
            this.empleado = empleado;
        }

        
    }
