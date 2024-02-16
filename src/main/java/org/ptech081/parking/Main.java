package org.ptech081.parking;
import org.ptech081.parking.entitites.*;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        //crear carros con los constructores:
        Carro carrito1 = new Carro("ASB 456", TipoVehiculo.MOTO);
        Carro carrito3 = new Carro("DSA 345", TipoVehiculo.SEDAN);
        Carro carrito2 = new Carro();
        carrito2.placa = "ERRT 566";
        carrito2.tipoVehiculo = TipoVehiculo.CAMIONETA;

        //crear clientes
        Cliente cliente1 = new Cliente("Samuel ", "Perez", 6785875878L);
        Cliente cliente2 = new Cliente("Andres ", "Suarez", 6743475878L);
        
        Empleado empleado1 = new Empleado("Sara Adames ", 3475878L);
        Empleado empleado2 = new Empleado("Fabio Gonzales ", 5475878L);
        
        

        //invocar el metodo addcar
        cliente1.addCar(carrito1);
        cliente1.addCar("ASB 456", TipoVehiculo.BUS);
        cliente2.addCar(carrito3);
        cliente2.addCar("DSA 345", TipoVehiculo.SEDAN);

        //Crear dos cupos
        Cupo cupo1 = new Cupo('A');
        Cupo cupo2 = new Cupo('B');
        Cupo cupo3 = new Cupo('C');
        Cupo cupo4 = new Cupo('D');

        //Crear dos registros E/S
        LocalDate fechaInicio = LocalDate.now();
        LocalTime horaInicio = LocalTime.now();
        LocalDate fechaFin = LocalDate.of(2024, Month.MARCH, 24);
        LocalTime horaFin = LocalTime.of( 11, 30, 00 );

        LocalDate fechaInicio2 = LocalDate.now();
        LocalTime horaInicio2 = LocalTime.now();
        LocalDate fechaFin2 = LocalDate.of(2024, Month.APRIL, 14);
        LocalTime horaFin2 = LocalTime.of( 12, 30, 00 );

        LocalDate fechaInicio3 = LocalDate.now();
        LocalTime horaInicio3 = LocalTime.now();
        LocalDate fechaFin3 = LocalDate.of(2024, Month.FEBRUARY, 14);
        LocalTime horaFin3 = LocalTime.of( 01, 30, 00 );

        

        //Crear lista de registros
        List<Registro>misRegistros = new ArrayList<Registro>();

        //Crear Registros
        Registro registro1 = new Registro(  fechaInicio, 
                                            horaInicio, 
                                            fechaFin, 
                                            horaFin, 
                                            5000L,
                                            cupo1, 
                                            cliente1.misCarros.get(1),
                                            cliente1,
                                            empleado1
                                             );


        Registro registro2 = new Registro(
                                            fechaInicio2,
                                            horaInicio2,
                                            fechaFin2,
                                            horaFin2,
                                            4000L,
                                            cupo2,
                                            cliente2.misCarros.get(0),
                                            cliente2,
                                            empleado2
        );

        Registro registro3 = new Registro(
            fechaInicio3,
            horaInicio3,
            fechaFin3,
            horaFin3,
            1000L,
            cupo3,
            cliente2.misCarros.get(1),
            cliente2,
            empleado1
);


        //Añadir registro a la lista

        misRegistros.add(registro1);
        misRegistros.add(registro2);
        System.out.println("Registros E/S parking");
        for(Registro r: misRegistros){
             System.out.println( "Cliente" +
                                 ": " + 
                                 r.cliente.nombre +
                                 "- " +
                                 r.cliente.apellido + 
                                 "|" + 
                                 r.carro.placa + 
                                 "|" + 
                                 r.carro.tipoVehiculo + 
                                 "|" + 
                                 r.valor + 
                                 "|" +
                                 r.fechaInicio + 
                                 "|" +
                                 r.horaInicio + 
                                 "| El código del empleado es: " +
                                 r.empleado.codigoEmpleado 
                                 );}


    }
}