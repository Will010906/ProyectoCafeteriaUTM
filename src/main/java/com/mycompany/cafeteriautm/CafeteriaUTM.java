package com.mycompany.cafeteriautm;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

/**
*Diaz Mozqueda Ivana Yamilet
*Lobato Alcantar Wilmer Ernesto
*Urueta Rodrigez Andrea
*/
public class CafeteriaUTM {
Scanner teclado = new Scanner(System.in);
//Creación de estructura de datos Array List
ArrayList<Encargado>arregloEmpleados = new ArrayList<>();
ArrayList<Cliente>arregloCliente = new ArrayList<>();
ArrayList<Comida>arregloMenuComida = new ArrayList<>();
ArrayList<Bebida>arregloMenuBebida = new ArrayList<>();
ArrayList<Pedido>arregloPedido = new ArrayList<>();
ArrayList<Venta>arregloVenta = new ArrayList<>();

static int idPedido = 0;

    public static void main(String[] args) {
        
        CafeteriaUTM cafeteria = new CafeteriaUTM();
        cafeteria.mostrarMenuCafeteriaUTM();
    }
//Construción de los objetos empleados
    public void construirObjetosEmpleados(){
        Encargado empleado1 = new Encargado (1,"Saul", "Matutino");
        Encargado empleado2 = new Encargado (2,"Andrea", "Vespertino");
        arregloEmpleados.add(empleado1);
        arregloEmpleados.add(empleado2);
    }
    public void mostrarObjetosEmpleados(){
        for (int i = 0; i < arregloEmpleados.size(); i++) {
            arregloEmpleados.get(i).mostrarDatosEmpleado();
            arregloEmpleados.get(i).getTurno();
        }
    }
//Construccion de los objetos clientes
    public void construirObjetosClientes(){
        Cliente cliente1 = new Cliente (1, "Aime", true, 50);
        Cliente cliente2 = new Cliente (2, "Juan", true, 50);
        Cliente cliente3 = new Cliente (3, "Dorian", false, 0);
        arregloCliente.add(cliente1);
        arregloCliente.add(cliente2);
        arregloCliente.add(cliente3);
    }
    public void mostrarObjetosCliente(){
        for (int i = 0; i < arregloCliente.size(); i++) {
            arregloCliente.get(i).mostrarDatosCliente();
        }
    }
     //Construción de los objetos producto comida
 public void registrarProductosComida(){
     System.out.println("Se registran los productos de comida en el inventario");
     Comida comida1 = new Comida ("C01", "Huaraches",(float)35, (short) 20, "Tortilla,Carne molida, Bistec, Lechuga, Cilantro, Cebolla, Salsa verde, Queso Oaxaca", "1 Pieza");
     Comida comida2 = new Comida ("C02", "Enchiladas suizas",(float) 50, (short) 10, "Tortilla, Polllo, Queso Ranchero, Crema, Salsa verde,", " 4 Pieza");
     Comida comida3 = new Comida ("C03", "Burrito",(float) 75, (short) 20, "Tortilla de harina, Frijoles, Bistec, Lechuga, Jtomate, Cebolla, Salsa roja, Queso Oaxaca", "1 Pieza");
     arregloMenuComida.add(comida1);
     arregloMenuComida.add(comida2);
     arregloMenuComida.add(comida3);
 }
 public void consultarProductosComida(){
     for (int i = 0; i < arregloMenuComida.size(); i++) {
         arregloMenuComida.get(i);
     }
 }
 //Construcción de los objetos producto bebida
 public void registrarProductosBebida(){
     System.out.println("Se registran los productos de bebida en el inventario");
     Bebida bebida1 = new Bebida ("C01", "Agua",  (float) 20, (short)30, (float) 500, "Jamaica", "Fría");
     Bebida bebida2= new Bebida ("C02", "Refresco",  (float) 20, (short)20, (float) 600, "CocaCola", "Fría");
     Bebida bebida3 = new Bebida ("C03", "Cafe",  (float) 15, (short)15, (float) 355, "Cafe de olla", "Caliente");
     arregloMenuBebida.add(bebida1);
     arregloMenuBebida.add(bebida2);
     arregloMenuBebida.add(bebida3);
 }
 public void consultarProductosBebida(){
     for (int i = 0; i < arregloMenuBebida.size(); i++) {
         arregloMenuBebida.get(i);
     }
 }
//Construccion del menu de la cafeteriaUTM
public void mostrarMenuCafeteriaUTM(){
    //Declaración de la variable "opcion"
    byte opcion;
    construirObjetosEmpleados();
    construirObjetosClientes();
    registrarProductosComida();
    registrarProductosBebida();

    do{
        System.out.println("-----------------------------------------------------------------------------------------------------------------------");
        System.out.println("Bienvenido a la cafeteria UTM");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------");
        System.out.println("Selecciona el menu de las operaciones a realizar");
        System.out.println("1.Gestionar Productos, Empleados y Clientes");
        System.out.println("2.Realizar pedido y venta");
        System.out.println("3.Reportes de ventas");
        System.out.println("4.Salir");
        System.out.print("Ingresa la opcion");
        opcion = teclado.nextByte();
        switch (opcion){
            case 1:
                System.out.println("------------------------------- Lista de Empleados -------------------------------");
                this.construirObjetosEmpleados();
                this.mostrarObjetosEmpleados();
                System.out.println("------------------------------- Lista de Clientes -------------------------------");
                this.construirObjetosClientes();
                this.mostrarObjetosCliente();
                System.out.println("------------------------------- Lista de Comidas -------------------------------");
                this.registrarProductosComida();
                this.consultarProductosComida();
                System.out.println("------------------------------- Lista de Bebidas -------------------------------");
                this.registrarProductosBebida();
                this.consultarProductosBebida();
                break;
            case 2:
       } 
} while (opcion != 4);
}

public void registrarPedidoCliente(){

    //Declaración de variables locales
byte elemento;
byte totalComidas = 0;
byte totalbebidas = 0;
byte totalBebidas = 0;
byte numPedido = 0;
short idCliente = 0 ;
short existenciasPedido = 0;
int cantidad = 0;
int totalCantidadComidas = 0;
int totalCantidadBebidas = 0;
int totalItems = 0;
double totalPrecioComida = 0;
double totalPrecioBebida =0;
double subtotal = 0;
double descuento = 0;
double totalPagar = 0;
boolean insertar = false;
String respuesta = "si";
Pedido pedido = null;
Cliente cliente = null;
Comida comida;
Bebida bebida;

//Fecha y hora
LocalDateTime now = LocalDateTime.now();
String fecha = now.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
String hora = now.format(DateTimeFormatter.ofPattern("HH:mm"));

// Selección de clientes
System.out.println("------------------------------- Clientes registrados -------------------------------");
mostrarObjetosCliente();
System.out.print("Selecciona el cliente que hara el pedido: ");
idCliente = teclado.nextShort();
cliente = buscarClientePorId(idCliente);

if (cliente == null){
    System.out.println("Cliente no registrado");
    return;
}
    System.out.println("Cliente Seleccionado: " + cliente.getNombre());
    
//Crear Pedido
pedido = new Pedido();
pedido.setIdPedido(pedido);
pedido.setFecha(fecha);
pedido.setHora(hora);
pedido.setIdCliente(cliente);
arregloPedido.add(pedido);
numPedido = (byte)(arregloPedido.size()-1);

//Ingresar comidas
System.out.println("------------------------------- Menu de Comidas -------------------------------");
consultarProductosComida();

totalCantidadComidas = 0;
totalPrecioComida = 0;

    do {
        if (comida.getExistencias()== 0) {
            System.out.println("Existencias insuficientes, elige otra comida.");
            break;
        } else {
            System.out.println("Cantidad de " + comida.getNombre() + "quieres comprar?");
            cantidad = teclado.nextByte();
            existenciasPedido = (short)(arregloMenuComida.get(elemento).getExistencias());
            
            if (existenciasPedido < cantidad) {
                System.out.println("No hay existencias suficientes, solo tenemos en existencia " + existenciasPedido);
            } else {
                insertar = true;
                break;
            }
            
        }
        
    } while (cantidad > existenciasPedido);
    if(insertar){
        existenciasPedido = (short)(existenciasPedido - cantidad);
        arregloMenuComida.get(elemento).setExistencias(existenciasPedido);
        
 //Agregando a los arreglos de pedido de comida y cantidad
 pedido.productosPedidosComida.add(comida);
 pedido.productosCantidadPedidosComida.add(cantidad);
 
 //Calculando el total por el numero de unidades
 totalCantidadComidas = totalCantidadComidas + cantidad;
 totalPrecioComida = totalPrecioComida + comida.getPrecio() * cantidad;
 System.out.println("Precio" + comida.getPrecio() + " x " + cantidad + "=$" + comida.getPrecio() * cantidad);
}
    System.out.println("Desea agregar otra comida (s/n)? : ");
    teclado.nextLine();
    insertar = false;
    respuesta = teclado.nextLine();
} while (respuesta.




}



