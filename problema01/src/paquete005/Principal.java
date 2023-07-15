/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete005;


import paquete001.Persona;
import paquete002.Ciudad;
import paquete002.Propiedad;
import paquete003.*;
import paquete004.*;

import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) {
        //Variables usadas
        Scanner entrada = new Scanner(System.in);
        Persona cliente = new Persona();
        BilleteraPagos billeteraCliente = new BilleteraPagos();
        GastoPagos gastoPagos1 = new GastoPagos();
        ArrayList<Pagos> listaPagos = new ArrayList<>();


        boolean bandera;
        int opcion_usuario;

        //Inicio del Programa/
                bandera = true;

        System.out.println("=================== BILLETERA PAGOS ===================");
        System.out.println("Bienvenido estimad@ cliente.");
        System.out.println();


        System.out.println("=================== REGISTRO ===================");
        System.out.print("-Ingrese su nombre: ");
        cliente.setNombre(entrada.nextLine());
        System.out.print("-Ingrese su apellido: ");
        cliente.setApellido(entrada.nextLine());
        System.out.print("-Ingrese su edad: ");
        cliente.setEdad(entrada.nextInt());
        entrada.nextLine();
        System.out.print("-Ingrese su número de cédula: ");
        cliente.setCedula(entrada.nextLine());
        System.out.print("-Ingrese su ciudad: ");
        Ciudad ciudad = new Ciudad(entrada.nextLine());
        cliente.setCiudad(ciudad);
        billeteraCliente.setPersona(cliente);

        do {
            System.out.println();
            System.out.println("┌──────────────────────────────────────┐");
            System.out.println("│              MENU PAGOS              │");
            System.out.println("├──────────────────────────────────────┤");
            System.out.println("│ 1) Agua Potable                      │");
            System.out.println("│ 2) Luz Eléctrica                     │");
            System.out.println("│ 3) Pago Predial                      │");
            System.out.println("│ 4) Teléfono Convencional             │");
            System.out.println("│ 5) Reporte                           │");
            System.out.println("│ 6) Salir                             │");
            System.out.println("└──────────────────────────────────────┘");
            System.out.print(" ▒ Ingrese una opcion: ");
            opcion_usuario = entrada.nextInt();
            entrada.nextLine();

            switch (opcion_usuario) {
                case 1 -> {
                    PagoAguaPotable pagoAguaPotable1 = new PagoAguaPotable();

                    System.out.println("\n=================­== AGUA POTABLE ===================");
                    System.out.println(" ▒ Ingrese el mes: ");
                        pagoAguaPotable1.setMes(entrada.nextLine());
                    System.out.println(" ▒ Ingrese el tipo (comercial o casa) ");
                        pagoAguaPotable1.setTipo(entrada.nextLine());
                    System.out.println(" ▒ Ingrese la Tarifa Fija");
                        pagoAguaPotable1.setTarifaFija(entrada.nextDouble());
                    System.out.println(" ▒ Ingrese la Metros Cubicos Conumidos");
                        pagoAguaPotable1.setMetrosCubicosConsumo(entrada.nextDouble());
                    System.out.println(" ▒ Ingrese el Costo de Consumo Cubico");
                        pagoAguaPotable1.setCostoConsumoCubicos(entrada.nextDouble());
                    pagoAguaPotable1.calcularPago();
                    listaPagos.add(pagoAguaPotable1);
                }
                case 2 -> {
                    PagoLuzElectrica pagoLuzElectrica1 = new PagoLuzElectrica();
                    System.out.println("\n=================== Luz Electrica ===================");
                    System.out.println(" ▒ Ingrese el mes: ");
                        pagoLuzElectrica1.setMes(entrada.nextLine());
                    System.out.println(" ▒ Ingrese la Tarifa Base");
                        pagoLuzElectrica1.setTarifaBase(entrada.nextDouble());
                    System.out.println(" ▒ Ingrese los Kilovatios Consumidos");
                        pagoLuzElectrica1.setKilovatiosConsumidos(entrada.nextDouble());
                    System.out.println(" ▒ Ingrese el Costo de los Kilovatios");
                        pagoLuzElectrica1.setCostoKilovatio(entrada.nextDouble());
                        pagoLuzElectrica1.setCiudad(ciudad);
                    pagoLuzElectrica1.calcularPago();
                    listaPagos.add(pagoLuzElectrica1);
                }
                case 3 -> {
                    PagoPredial pagoPredial1 = new PagoPredial();
                    System.out.println("\n=================== PAGO PREDIAL ===================");
                    System.out.println(" ▒ Ingrese el mes: ");
                    pagoPredial1.setMes(entrada.nextLine());
                    System.out.println(" ▒ Ingrese el costo de la Propiedad");
                    Propiedad propiedad1 = new Propiedad(entrada.nextDouble());
                    pagoPredial1.setPropiedad(propiedad1);
                    System.out.println(" ▒ Ingrese el Porcentaje de pago de la Propiedad");
                    pagoPredial1.setPorcentaje(entrada.nextDouble());
                    pagoPredial1.calcularPago();
                    listaPagos.add(pagoPredial1);

                }
                case 4 -> {
                    PagoTelefonoConvencional telefonoConvencional = new PagoTelefonoConvencional();
                    System.out.println("\n=================== TELEFONO CONVENCIONAL ===================");
                    System.out.println(" ▒ Tarifa: ");
                    telefonoConvencional.setTarifa(entrada.nextDouble());
                    System.out.println(" ▒ Minutos Consumidos: ");
                    telefonoConvencional.setMinutosConsumidos(entrada.nextDouble());
                    System.out.println(" ▒ Costo Minuto: ");
                    telefonoConvencional.setCostoMinuto(entrada.nextDouble());
                    telefonoConvencional.calcularPago();
                    listaPagos.add(telefonoConvencional);
                    //listaPagos.add(telefonoConvencional);
                }
                case 5 -> {
                    gastoPagos1.setListaPagos(listaPagos);
                    gastoPagos1.calcularGastoPagos();

                    billeteraCliente.setListaPagos(listaPagos);
                    billeteraCliente.setGastoPagos(gastoPagos1);
                    System.out.println(billeteraCliente);
                }
                case 6 -> {
                    bandera = false;
                    System.out.println("SALIendo de billete...ra....");
                    entrada.close();
                }
                default -> {
                    System.out.println();
                    System.out.println("Opcion Incorrecta");
                    System.out.println();
                }
            }

        } while (bandera);
    }
}
