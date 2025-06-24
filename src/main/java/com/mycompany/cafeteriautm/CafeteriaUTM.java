package com.mycompany.cafeteriautm;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class CafeteriaUTM {

    // Scanner y estructuras de datos
    private Scanner teclado = new Scanner(System.in);
    private ArrayList<Encargado> arregloEmpleados = new ArrayList<>();
    private ArrayList<Cliente> arregloCliente = new ArrayList<>();
    private ArrayList<Comida> arregloMenuComida = new ArrayList<>();
    private ArrayList<Bebida> arregloMenuBebida = new ArrayList<>();
    private ArrayList<Pedido> arregloPedido = new ArrayList<>();
    private ArrayList<Venta> arregloVenta = new ArrayList<>();

    private static int idPedido = 0;

    public static void main(String[] args) {
        CafeteriaUTM cafeteria = new CafeteriaUTM();
        cafeteria.inicializarDatos();
        cafeteria.mostrarMenuCafeteriaUTM();
    }

    public void inicializarDatos() {
        construirObjetosEncargado();
        construirObjetosClientes();
        registrarProductosComida();
        registrarProductosBebida();
    }

    // Métodos para empleados
    public void construirObjetosEncargado() {
        arregloEmpleados.add(new Encargado(1, "Saul", "Matutino"));
        arregloEmpleados.add(new Encargado(2, "Andrea", "Vespertino"));
    }

    public void mostrarObjetosEncargado() {
        for (Encargado emp : arregloEmpleados) {
            emp.mostrarDatosEmpleado();
        }
    }

    // Métodos para clientes
    public void construirObjetosClientes() {
        arregloCliente.add(new Cliente(1, "Aime", true, 50));
        arregloCliente.add(new Cliente(2, "Juan", true, 50));
        arregloCliente.add(new Cliente(3, "Dorian", false, 0));
    }

    public void mostrarObjetosCliente() {
        for (Cliente cli : arregloCliente) {
            cli.mostrarDatosCliente();
        }
    }

    // Métodos para comidas
    public void registrarProductosComida() {
        arregloMenuComida.add(new Comida("Huaraches", "C01", 35, (short) 20, "Tortilla, Carne, Lechuga, Queso", "1 Pieza"));
        arregloMenuComida.add(new Comida("Enchiladas", "C02", 50, (short) 10, "Tortilla, Pollo, Salsa Verde", "4 Piezas"));
        arregloMenuComida.add(new Comida("Burrito", "C03", 75, (short) 20, "Tortilla Harina, Bistec, Verduras", "1 Pieza"));
    }

    public void consultarProductosComida() {
        for (int i = 0; i < arregloMenuComida.size(); i++) {
            System.out.print(i + ". ");
            arregloMenuComida.get(i).mostrarDatosComida();
        }
    }

    // Métodos para bebidas
    public void registrarProductosBebida() {
        arregloMenuBebida.add(new Bebida("Agua", "C01", 20, (short) 30, 500, "Jamaica", "Fría"));
        arregloMenuBebida.add(new Bebida("Refresco", "C02", 20, (short) 20, 600, "CocaCola", "Fría"));
        arregloMenuBebida.add(new Bebida("Café", "C03", 15, (short) 15, 355, "Café de Olla", "Caliente"));
    }

    public void consultarProductosBebida() {
        for (int i = 0; i < arregloMenuBebida.size(); i++) {
            System.out.print(i + ". ");
            arregloMenuBebida.get(i).mostrarDatosBebida();
        }
    }

    // Menú principal
    public void mostrarMenuCafeteriaUTM() {
        byte opcion;
        do {
            System.out.println("------ Bienvenido a la Cafetería UTM ------");
            System.out.println("1. Mostrar Productos, Empleados y Clientes");
            System.out.println("2. Realizar pedido y venta");
            System.out.println("3. Reporte de ventas");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = teclado.nextByte();
            teclado.nextLine(); // Limpia el buffer

            switch (opcion) {
                case 1:
                    System.out.println("----- Empleados -----");
                    mostrarObjetosEncargado();
                    System.out.println("----- Clientes -----");
                    mostrarObjetosCliente();
                    System.out.println("----- Comidas -----");
                    consultarProductosComida();
                    System.out.println("----- Bebidas -----");
                    consultarProductosBebida();
                    break;
                case 2:
                    registrarPedidoCliente();
                    break;
                case 3:
                    generarReporteVenta();
                    break;
                case 4:
                    System.out.println("Gracias por visitar Cafetería UTM.");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 4);
    }

    // Registrar pedido
    public void registrarPedidoCliente() {
        System.out.println("----- Clientes -----");
        mostrarObjetosCliente();
        System.out.print("Selecciona el cliente por ID: ");
        int idCliente = teclado.nextInt();
        teclado.nextLine(); // Limpia buffer

        Cliente cliente = buscarClientePorId(idCliente);
        if (cliente == null) {
            System.out.println("Cliente no registrado.");
            return;
        }
        System.out.println("Cliente seleccionado: " + cliente.getNombre());
        System.out.println("-------------------------------");
        System.out.println("----------- Menú de Comidas -----------");
        System.out.println("-------------------------------");

        LocalDateTime now = LocalDateTime.now();
        String fecha = now.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        String hora = now.format(DateTimeFormatter.ofPattern("HH:mm"));

        Pedido pedido = new Pedido();
        pedido.setIdPedido(idPedido);
        pedido.setFecha(fecha);
        pedido.setHora(hora);
        pedido.setIdCliente(cliente);
        arregloPedido.add(pedido);

        int totalCantidadComidas = 0;
        double totalPrecioComida = 0;
        String respuesta = null;

        consultarProductosComida();
        do {
            System.out.print("Número de platillo: ");
            byte elemento = teclado.nextByte();
            teclado.nextLine();
            if (elemento < 0 || elemento >= arregloMenuComida.size()) {
                System.out.println("Opción inválida.");
                continue;
            }
            Comida comida = arregloMenuComida.get(elemento);
            if (comida.getExistencias() == 0) {
                System.out.println("Sin existencias.");
                continue;
            }
            System.out.print("¿Cuantas cantidades de " + comida.getNombre() + " quieres comprar? ");
            int cantidad = teclado.nextInt();
            teclado.nextLine();

            if (cantidad > comida.getExistencias()) {
                System.out.println("Solo hay " + comida.getExistencias() + " disponibles.");
                continue;
            }

            comida.setExistencias((short) (comida.getExistencias() - cantidad));
            pedido.agregarProductoComida(comida, cantidad);
            totalCantidadComidas += cantidad;
            totalPrecioComida += comida.getPrecio() * cantidad;
            System.out.print("¿Agregar otra comida? (s/n): ");
            respuesta = teclado.nextLine();
        } while (respuesta.equalsIgnoreCase("s"));
        
        System.out.println("-------------------------------");
        System.out.println("----------- Menú de Bebidas -----------");
        System.out.println("-------------------------------");


        int totalCantidadBebidas = 0;
        double totalPrecioBebida = 0;

        consultarProductosBebida();
        do {
            System.out.print("Número de bebida: ");
            byte elemento = teclado.nextByte();
            teclado.nextLine();
            if (elemento < 0 || elemento >= arregloMenuBebida.size()) {
                System.out.println("Opción inválida.");
                continue;
            }
            Bebida bebida = arregloMenuBebida.get(elemento);
            if (bebida.getExistencias() == 0) {
                System.out.println("Sin existencias.");
                continue;
            }
            System.out.print("¿Cuantas cantidades de " + bebida.getNombre()+ " quieres comprar? ");
            int cantidad = teclado.nextInt();
            teclado.nextLine();

            if (cantidad > bebida.getExistencias()) {
                System.out.println("Solo hay " + bebida.getExistencias() + " disponibles.");
                continue;
            }

            bebida.setExistencias((short) (bebida.getExistencias() - cantidad));
            pedido.agregarProductoBebida(bebida, cantidad);
            totalCantidadBebidas += cantidad;
            totalPrecioBebida += bebida.getPrecio() * cantidad;

            System.out.print("¿Agregar otra bebida? (s/n): ");
            respuesta = teclado.nextLine();
        } while (respuesta.equalsIgnoreCase("s"));

        double subtotal = totalPrecioComida + totalPrecioBebida;
        double descuento = subtotal * cliente.getPorcentaje() / 100;
        double totalPagar = subtotal - descuento;
        int totalProductos = totalCantidadComidas + totalCantidadBebidas;

        pedido.setTotalProductos(totalProductos);
        pedido.setSubtotal((float) subtotal);
        pedido.setDescuento((float) descuento);
        pedido.setTotal((float) totalPagar);
        pedido.mostrarPedidoFinal();

        System.out.print("¿Desea pagar el pedido? (s/n): ");
        String confirmar = teclado.nextLine().trim().toLowerCase();
        if (confirmar.equals("s")) {
            Venta venta = new Venta(pedido.getTotal(), cliente.getIdCliente(), pedido.getIdPedido());
            arregloVenta.add(venta);
            generarReporteVenta();
        }
        idPedido++;
    }

    // Buscar cliente por ID
    private Cliente buscarClientePorId(int idCliente) {
        for (Cliente cliente : arregloCliente) {
            if (cliente.getIdCliente() == idCliente) {
                return cliente;
            }
        }
        return null;
    }

    // Reporte de ventas
    private void generarReporteVenta() {
        System.out.println("----- Reporte de Ventas -----");
        float total = 0;
        for (Venta v : arregloVenta) {
            v.mostrarVenta();
            total += v.getTotal();
        }
        System.out.println("Total acumulado: $" + total);
    }
}
