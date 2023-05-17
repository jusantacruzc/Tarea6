package UI;

import java.util.Scanner;

public class UI {

    public static void adios() {
        System.out.println("Gracias por hacer parte de la cooperativa Ecomun de Exquerrilleros de FARC");
        System.out.println("Que tenga un buen dia");
    }

    public static int menuPrincipal() {
        System.out.println("Bienvenido a la Tienda de la cooperativa Ecomun de Exquerrilleros de FARC");
        System.out.println("Por favor escoga una de las siguientes opciones:");
        System.out.println("1) Visualizar la informacion de los productos");
        System.out.println("2) Visualizar los productos");
        System.out.println("3) Visualizar el arbol de productos y hacer un pedido");
        System.out.println("4) Abandonar la Tienda");
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite su opcion: ");
        return sc.nextInt();
    }

    public static int menuSeleccionarProductos() {

        System.out.println("Que tipo de producto desea adquirir?");
        System.out.println("1) Tecnologia");
        System.out.println("2) Alimentos");

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite su opcion: ");
        return sc.nextInt();
    }

    public static int menuSeleccionarTecnologia() {

        System.out.println("Que tipo de Aparato Tecnologico desea adquirir?");
        System.out.println("1) Computadora");
        System.out.println("2) Monitor");
        System.out.println("3) Mouse");
        System.out.println("4) Teclado");

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite su opcion: ");
        return sc.nextInt();
    }

    public static int menuSeleccionarAlimentos() {

        System.out.println("Que tipo de Alimento desea adquirir?");
        System.out.println("1) Comida");
        System.out.println("2) bebida");

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite su opcion: ");
        return sc.nextInt();
    }

    public static int menuSeleccionarComida() {

        System.out.println("Que tipo de Comida desea adquirir?");
        System.out.println("1) Huevos");
        System.out.println("2) Carne");

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite su opcion: ");
        return sc.nextInt();
    }

    public static int menuSeleccionarBebida() {

        System.out.println("Que tipo de Bebida desea adquirir?");
        System.out.println("1) Gaseosa");
        System.out.println("2) Alcohol");

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite su opcion: ");
        return sc.nextInt();
    }

    public static int imprimirMenuInfo() {
        System.out.println("Info del producto:");
        System.out.println("Digite 1 para recibir informacion sobre el computador");
        System.out.println("Digite 2 para recibir informacion sobre el mouse");
        System.out.println("Digite 3 para recibir informacion sobre el teclado");
        System.out.println("Digite 4 para recibir informacion sobre los huevos");
        System.out.println("Digite 5 para recibir informacion sobre las carnes");
        System.out.println("Digite 6 para recibir informacion sobre las bebidas gasificadas");
        System.out.println("Digite 7 para recibir informacion sobre las bebidas Alcoholicas");
        Scanner lector = new Scanner(System.in);
        int opcion = lector.nextInt();
        return opcion;
    }

//    pubic static String FinalizarCompra() {
//        System.out.println("Desea agregar este producto al carrito?");
//        System.out.println("Digite 'Si' o 'No'");
//        Scanner lector = new Scanner(System.in);
//        String opcion = lector.next();
//        if(opcion.equalsIgnoreCase("Si")){
//            return 
//        } else{
//            System.out.println("Desea Comprar algo mas?");
//            return "" ;
//        }       
//        return 
//
//    }
    public static void imprimirPc(Data.Computadora computadora) {
        System.out.println(computadora);
    }

    public static void imprimirMonitor(Data.Monitor monitor) {
        System.out.println(monitor);
    }

    public static void imprimirMouse(Data.Mouse mouse) {
        System.out.println(mouse);
    }

    public static void imprimirTeclado(Data.Teclado teclado) {
        System.out.println(teclado);
    }

    public static void imprimirHuevos(Data.Huevos huevo) {
        System.out.println(huevo);
    }

    public static void imprimirCarnes(Data.Carne carne) {
        System.out.println(carne);
    }

    public static void imprimirGasificada(Data.Gasificada gasificada) {
        System.out.println(gasificada);
    }

    public static void imprimirAlcoholicas(Data.Alcoholicas alcoholicas) {
        System.out.println(alcoholicas);
    }

    public static void visualuzarProductos(Data.Productos producto) {
        System.out.println(producto.toString());
    }

//    public static String visualizarProductos(Data.Productos producto) {
//
////      USAR CASTING PARA CASTEAR LOS ELEMENTOS DE PRODUCTOS Y ACCEDER A TOSTRING
//        if (producto instanceof Data.Alcoholicas) {
//            Data.Alcoholicas Alcoholicas = (Data.Alcoholicas) producto;
//            return Alcoholicas.toString();
//        } else if (producto instanceof Data.Huevos) {
//            Data.Huevos Huevos = (Data.Huevos) producto;
//            return Huevos.toString();
//        } else if (producto instanceof Data.Gasificada) {
//            Data.Gasificada Gasificada = (Data.Gasificada) producto;
//            return Gasificada.toString();
//        } else if (producto instanceof Data.Monitor) {
//            Data.Monitor Monitor = (Data.Monitor) producto;
//            return Monitor.toString();
//        } else if (producto instanceof Data.Computadora) {
//            Data.Computadora Computadora = (Data.Computadora) producto;
//            return Computadora.toString();
//        } else if (producto instanceof Data.Teclado) {
//            Data.Teclado Teclado = (Data.Teclado) producto;
//            return Teclado.toString();
//        } else if (producto instanceof Data.Mouse) {
//            Data.Mouse Mouse = (Data.Mouse) producto;
//            return Mouse.toString();
//        } else if (producto instanceof Data.Carne) {
//            Data.Carne Carne = (Data.Carne) producto;
//            return Carne.toString();
//        }
//        return "";
//    }
    public static int volverMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Si desea volver al menu principal oprima 1");
        System.out.println("Si desea Salir del programa oprima 0");
        return sc.nextInt();
    }

    //0 Finalizar compra 
    public static void instruccionesCompra() {
        System.out.println("Añada un producto al carrito por medio de su codigo");
        System.out.println("Si desea finalizar compra oprima 0");
    }

    public static String añadirProducto() {
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }
    
    public static void errorCarrito(){
        System.out.println("El codigo que ingreso no existe por favor reviselo");
    }

}
