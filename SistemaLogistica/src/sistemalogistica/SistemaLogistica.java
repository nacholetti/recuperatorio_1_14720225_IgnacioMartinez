package sistemalogistica;

import java.util.Scanner;

public class SistemaLogistica {

    public static void main(String[] args) {
        Logistica logistica1 = new Logistica();
        Colectivo colectivo1 = new Colectivo(150, "HMG844", "VOLVO", 1925);
        CamionCarga camioncarga1 = new CamionCarga(50, "PEPE3342", "Scania", 1998);
        VehiculoInspeccion inspeccion = new VehiculoInspeccion(UsoAsignado.SUPERVISIÓN, "NMK033", "Fiat", 2003);
        logistica1.agregarVehiculos(inspeccion);
        logistica1.agregarVehiculos(colectivo1);
        logistica1.agregarVehiculos(camioncarga1);
        logistica1.mostrarVehiculos();
        logistica1.OrdenarPorFabricacion();
        logistica1.OrdenarPorMarca();

        int opcion;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Menu opciones");
            System.out.println("1.Agregar vehiculo");
            System.out.println("2.Mostrar todos los vehiculos");
            System.out.println("3.Iniciar recorrido");
            System.out.println("4.Mostrar vehiculos ordenados por marca");
            System.out.println("5.Mostrar vehiculos ordenados por año de fabricacion");
            System.out.println("6.Mostrar vehiculos ordenados por capacidad");
            System.out.println("0.Salir");
            System.out.println("Ingrese la opcion que desea");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("---Tipo de vehiculo---");
                    System.out.println("1.Vehiculo de inspeccion");
                    System.out.println("2.CamionCarga");
                    System.out.println("3.Colectivo");
                    System.out.println("Seleccione el tipo de vehiculo que desee");
                    int tipo = sc.nextInt();
                    sc.nextLine(); // limpiar salto de línea

                    System.out.print("Ingrese la patente del vehiculo: ");
                    String patente = sc.nextLine();

                    
                    
                    System.out.print("Ingrese la marca del vehiculo: ");
                    String marca = sc.nextLine();
                    
                    System.out.print("Ingrese año de fabricacion: ");
                    int anio = sc.nextInt();


                    sc.nextLine();

                    Vehiculo vehiculo = null;
                    switch (tipo) {
                        case 1:
                            System.out.println("Seleccione tipo de vehiculo de inspeccion:");
                            System.out.println("1. MANTENIMIENTO");
                            System.out.println("2. SUPERVISIÓN");
                            System.out.println("3. EMERGENCIA");
                            System.out.print("Opción: ");
                            int tipoEnum = sc.nextInt();

                            UsoAsignado usoAsignado = null;
                            
                            switch (tipoEnum) {
                                case 1 ->
                                    usoAsignado = UsoAsignado.MANTENIMIENTO;
                                case 2 ->
                                    usoAsignado = UsoAsignado.SUPERVISIÓN;
                                    
                                case 3 ->
                                    usoAsignado = UsoAsignado.EMERGENCIA;
                                default ->
                                    System.out.println("Opción inválida.");
                            }
                            vehiculo = new VehiculoInspeccion(usoAsignado, patente, marca, anio);
                            break;
                           
                        case 2:
                            System.out.print("Ingrese capacidad de carga ");
                            int carga = sc.nextInt();
                            vehiculo = new CamionCarga(carga, patente, marca, anio);
                            break;

                        case 3:
                            System.out.print("Ingrese cantidad de pasajeros: ");
                            int pasajeros = sc.nextInt();
                            vehiculo = new Colectivo(pasajeros, patente, marca, anio);
                            break;

                        default:
                            System.out.println("Tipo de vehiculo inválido.");
                    }

                    if (vehiculo != null) {
                        logistica1.agregarVehiculos(vehiculo);
                    }
                    break;

                case 2:
                    System.out.println("Vehiculos registrados en el sistema");
                    logistica1.mostrarVehiculos();
                    break;
                case 3:
                    System.out.println("Iniciar recorrido");
                    logistica1.recorrer();
                    break;
                case 4:
                    System.out.println("Ordenar vehiculos por marca");
                    logistica1.OrdenarPorMarca();
                    break;
                case 5:
                    System.out.println("Ordenar vehiculos por año de fabricacion");
                    logistica1.OrdenarPorFabricacion();
                    break;
                case 6:
                    System.out.println("No lo pude realizar");
                    break;
                case 0:
                    System.out.println("Saliendo del sistema");
                    break;
                default:
                    System.out.println("Opcion incorrecta");

            }

        } while (opcion != 0);
        sc.close();
    }

}
