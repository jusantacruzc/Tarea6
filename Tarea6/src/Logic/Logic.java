package Logic;

import Data.*;
import UI.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Logic {

    public static void main(String[] args) {

        ArrayList<Productos> arrayListProductos = new ArrayList();
        LinkedList<Productos> linkedListProductos = new LinkedList();
        HashMap<String, Productos> hashMapProductos = new HashMap();
        TreeMap<String, Productos> treeMapProductos = new TreeMap();
        Set<Productos> hashSetProductos = new HashSet();
        // Set<Productos> treeSetProductos = new TreeSet();

        Date doñaGallinaCaducidad = new Date(123, 5, 3);
        Huevos doñaGallina = new Huevos("AA", 12, 0.06, doñaGallinaCaducidad, "17%");
        arrayListProductos.add(doñaGallina);
        linkedListProductos.add(doñaGallina);
        hashSetProductos.add(doñaGallina);
        // treeSetProductos.add(doñaGallina);
        hashMapProductos.put("hash-H1", doñaGallina);
        treeMapProductos.put("tree-H1", doñaGallina);

        Date huevosDoradosCaducidad = new Date(123, 5, 7);
        Huevos huevosDorados = new Huevos("AAA", 24, 0.07, huevosDoradosCaducidad, "17%");
        arrayListProductos.add(huevosDorados);
        linkedListProductos.add(huevosDorados);
        hashSetProductos.add(huevosDorados);
        // treeSetProductos.add(huevosDorados);
        hashMapProductos.put("hash-H2", huevosDorados);
        treeMapProductos.put("tree-H2", huevosDorados);

        Date gallinaDoradaCaducidad = new Date(123, 5, 4);
        Huevos gallinaDorada = new Huevos("A", 6, 0.05, gallinaDoradaCaducidad, "17%");
        arrayListProductos.add(gallinaDorada);
        linkedListProductos.add(gallinaDorada);
        hashSetProductos.add(gallinaDorada);
        // treeSetProductos.add(gallinaDorada);
        hashMapProductos.put("hash-H3", gallinaDorada);
        treeMapProductos.put("tree-H3", gallinaDorada);

        Date carne1Caducidad = new Date(123, 5, 3);
        Carne carne1 = new Carne("Pollo", 1.2, carne1Caducidad, "20%");
        arrayListProductos.add(carne1);
        linkedListProductos.add(carne1);
        hashSetProductos.add(carne1);
        // treeSetProductos.add(carne1);
        hashMapProductos.put("hash-C1", carne1);
        treeMapProductos.put("tree-C1", carne1);

        Date carne2Caducidad = new Date(123, 5, 3);
        Carne carne2 = new Carne("Carne", .7, carne2Caducidad, "20%");
        arrayListProductos.add(carne2);
        linkedListProductos.add(carne2);
        hashSetProductos.add(carne2);
        // treeSetProductos.add(carne2);
        hashMapProductos.put("hash-C2", carne2);
        treeMapProductos.put("tree-C2", carne2);

        Date carne3Caducidad = new Date(123, 5, 3);
        Carne carne3 = new Carne("Pescado", 2.2, carne3Caducidad, "21%");
        arrayListProductos.add(carne3);
        linkedListProductos.add(carne3);
        hashSetProductos.add(carne3);
        // treeSetProductos.add(carne3);
        hashMapProductos.put("hash-C3", carne3);
        treeMapProductos.put("tree-C3", carne3);

        Date gaseosa1Caducidad = new Date(124, 6, 6);
        Gasificada gaseosa1 = new Gasificada(true, true, true, 700, gaseosa1Caducidad, "7%");
        arrayListProductos.add(gaseosa1);
        linkedListProductos.add(gaseosa1);
        hashSetProductos.add(gaseosa1);
        // treeSetProductos.add(gaseosa1);
        hashMapProductos.put("hash-G1", gaseosa1);
        treeMapProductos.put("tree-G1", gaseosa1);

        Date gaseosa2Caducidad = new Date(124, 6, 6);
        Gasificada gaseosa2 = new Gasificada(false, true, true, 500, gaseosa2Caducidad, "7%");
        arrayListProductos.add(gaseosa2);
        linkedListProductos.add(gaseosa2);
        hashSetProductos.add(gaseosa2);
        // treeSetProductos.add(gaseosa2);
        hashMapProductos.put("hash-G2", gaseosa2);
        treeMapProductos.put("tree-G2", gaseosa2);

        Date gaseosa3Caducidad = new Date(124, 6, 6);
        Gasificada gaseosa3 = new Gasificada(false, true, false, 1000, gaseosa3Caducidad, "7%");
        arrayListProductos.add(gaseosa3);
        linkedListProductos.add(gaseosa3);
        hashSetProductos.add(gaseosa3);
        // treeSetProductos.add(gaseosa3);
        hashMapProductos.put("hash-G3", gaseosa3);
        treeMapProductos.put("tree-G3", gaseosa3);

        Date alcohol1Caducidad = new Date(127, 7, 10);
        Alcoholicas alcohol1 = new Alcoholicas(23, 1000, alcohol1Caducidad, "24%");
        arrayListProductos.add(alcohol1);
        linkedListProductos.add(alcohol1);
        hashSetProductos.add(alcohol1);
        // treeSetProductos.add(alcohol1);
        hashMapProductos.put("hash-A1", alcohol1);
        treeMapProductos.put("tree-A1", alcohol1);

        Date alcohol2Caducidad = new Date(127, 7, 10);
        Alcoholicas alcohol2 = new Alcoholicas(40, 600, alcohol2Caducidad, "24%");
        arrayListProductos.add(alcohol2);
        linkedListProductos.add(alcohol2);
        hashSetProductos.add(alcohol2);
        // treeSetProductos.add(alcohol2);
        hashMapProductos.put("hash-A2", alcohol2);
        treeMapProductos.put("tree-A2", alcohol2);

        Date alcohol3Caducidad = new Date(127, 7, 10);
        Alcoholicas alcohol3 = new Alcoholicas(13, 2000, alcohol3Caducidad, "24%");
        arrayListProductos.add(alcohol3);
        linkedListProductos.add(alcohol3);
        hashSetProductos.add(alcohol3);
        // treeSetProductos.add(alcohol3);
        hashMapProductos.put("hash-A3", alcohol3);
        treeMapProductos.put("tree-A3", alcohol3);

        Monitor monitor1 = new Monitor(17, "Raizer", "4%");
        Monitor monitor2 = new Monitor(27, "Lg", "4%");
        Monitor monitor3 = new Monitor(10, "Hp", "4%");
        arrayListProductos.add(monitor1);
        linkedListProductos.add(monitor1);
        hashSetProductos.add(monitor1);
        // treeSetProductos.add(monitor1);
        hashMapProductos.put("hash-MO1", monitor1);
        treeMapProductos.put("tree-MO1", monitor1);
        arrayListProductos.add(monitor2);
        linkedListProductos.add(monitor2);
        hashSetProductos.add(monitor2);
        // treeSetProductos.add(monitor2);
        hashMapProductos.put("hash-MO2", monitor2);
        treeMapProductos.put("tree-MO2", monitor2);
        arrayListProductos.add(monitor3);
        linkedListProductos.add(monitor3);
        hashSetProductos.add(monitor3);
        // treeSetProductos.add(monitor3);
        hashMapProductos.put("hash-MO3", monitor3);
        treeMapProductos.put("tree-MO3", monitor3);

        Mouse mouse1 = new Mouse(2, "Microsoft", "1%");
        Mouse mouse2 = new Mouse(5, "Lenovo", "1%");
        Mouse mouse3 = new Mouse(7, "Apple", "1%");
        arrayListProductos.add(mouse1);
        linkedListProductos.add(mouse1);
        hashSetProductos.add(mouse1);
        // treeSetProductos.add(mouse1);
        hashMapProductos.put("hash-M1", mouse1);
        treeMapProductos.put("tree-M1", mouse1);
        arrayListProductos.add(mouse2);
        linkedListProductos.add(mouse2);
        hashSetProductos.add(mouse2);
        // treeSetProductos.add(mouse2);
        hashMapProductos.put("hash-M2", mouse2);
        treeMapProductos.put("tree-M2", mouse2);
        arrayListProductos.add(mouse3);
        linkedListProductos.add(mouse3);
        hashSetProductos.add(mouse3);
        // treeSetProductos.add(mouse3);
        hashMapProductos.put("hash-M3", mouse3);
        treeMapProductos.put("tree-M3", mouse3);

        Teclado teclado1 = new Teclado("QWERTY", "Lenovo", "10%");
        Teclado teclado2 = new Teclado("Dvorak", "Microsoft", "10%");
        Teclado teclado3 = new Teclado("Colemak", "Hp", "10%");
        arrayListProductos.add(teclado1);
        linkedListProductos.add(teclado1);
        hashSetProductos.add(teclado1);
        // treeSetProductos.add(teclado1);
        hashMapProductos.put("hash-T1", teclado1);
        treeMapProductos.put("tree-T1", teclado1);
        arrayListProductos.add(teclado2);
        linkedListProductos.add(teclado2);
        hashSetProductos.add(teclado2);
        // treeSetProductos.add(teclado2);
        hashMapProductos.put("hash-T2", teclado2);
        treeMapProductos.put("tree-T2", teclado2);
        arrayListProductos.add(teclado3);
        linkedListProductos.add(teclado3);
        hashSetProductos.add(teclado3);
        // treeSetProductos.add(teclado3);
        hashMapProductos.put("hash-T3", teclado3);
        treeMapProductos.put("tree-T3", teclado3);

        Computadora pc1 = new Computadora("RaizerX", monitor1, teclado1, mouse1, "Raizer", "17%");
        Computadora pc2 = new Computadora("RaizerX", monitor2, teclado2, mouse2, "Apple", "17%");
        Computadora pc3 = new Computadora("RaizerX", monitor3, teclado3, mouse3, "Microsoft", "17%");
        arrayListProductos.add(pc1);
        linkedListProductos.add(pc1);
        hashSetProductos.add(pc1);
        // treeSetProductos.add(pc1);
        hashMapProductos.put("hash-PC1", pc1);
        treeMapProductos.put("tree-PC1", pc1);
        arrayListProductos.add(pc2);
        linkedListProductos.add(pc2);
        hashSetProductos.add(pc2);
        // treeSetProductos.add(pc2);
        hashMapProductos.put("hash-PC2", pc2);
        treeMapProductos.put("tree-PC2", pc2);
        arrayListProductos.add(pc3);
        linkedListProductos.add(pc3);
        hashSetProductos.add(pc3);
        // treeSetProductos.add(pc3);
        hashMapProductos.put("hash-PC3", pc3);
        treeMapProductos.put("tree-PC3", pc3);

        boolean van = true;
        ArrayList<Productos> carrito = new ArrayList();
        boolean vanCarrito = true;
        boolean vanFinalizarCompra = true;
        while (van == true) {

            switch (UI.menuPrincipal()) {
                case 1:
                    switch (UI.imprimirMenuInfo()) {
                        case 1:
                            UI.imprimirMonitor(monitor3);
                            break;
                        case 2:
                            UI.imprimirMouse(mouse3);
                            break;
                        case 3:
                            UI.imprimirTeclado(teclado3);
                            break;
                        case 4:
                            UI.imprimirHuevos(doñaGallina);
                            break;
                        case 5:
                            UI.imprimirHuevos(doñaGallina);
                            break;
                        case 6:
                            UI.imprimirHuevos(doñaGallina);
                            break;
                        case 7:
                            UI.imprimirHuevos(doñaGallina);
                            break;
                    }
                    if (UI.volverMenu() == 0) {
                        System.out.println("");
                        van = false;
                        UI.adios();
                    }
                    break;
                case 2:
                    for (int i = 0; i < arrayListProductos.size(); i++) {
                        System.out.print(i + 1);
                        UI.visualuzarProductos(arrayListProductos.get(i));
                        System.out.println("");
                    }
                    if (UI.volverMenu() == 0) {
                        van = false;
                        UI.adios();
                    }
                    break;
                case 3:

                    switch (UI.menuSeleccionarProductos()) {
                        case 1:

                            switch (UI.menuSeleccionarTecnologia()) {
                                case 1:
                                    for (Map.Entry<String, Productos> entry : treeMapProductos.entrySet()) {
                                        String key = entry.getKey();
                                        Productos value = entry.getValue();
                                        if (key.contains("PC")) {
                                            System.out.println("----------------");
                                            System.out.println(key + " => " + value);
                                        }
                                    }
                                    break;
                                case 2:
                                    for (Map.Entry<String, Productos> entry : treeMapProductos.entrySet()) {
                                        String key = entry.getKey();
                                        Productos value = entry.getValue();
                                        if (key.contains("MO")) {
                                            System.out.println("----------------");
                                            System.out.println(key + " => " + value);
                                        }
                                    }
                                    break;
                                case 3:
                                    for (Map.Entry<String, Productos> entry : treeMapProductos.entrySet()) {
                                        String key = entry.getKey();
                                        Productos value = entry.getValue();
                                        if (key.contains("M")) {
                                            System.out.println("----------------");
                                            System.out.println(key + " => " + value);
                                        }
                                    }
                                    break;
                                case 4:
                                    for (Map.Entry<String, Productos> entry : treeMapProductos.entrySet()) {
                                        String key = entry.getKey();
                                        Productos value = entry.getValue();
                                        if (key.contains("T")) {
                                            System.out.println("----------------");
                                            System.out.println(key + " => " + value);
                                        }
                                    }
                                    break;
                            }

                            break;
                        case 2:
                            switch (UI.menuSeleccionarAlimentos()) {
                                case 1:
                                    switch (UI.menuSeleccionarComida()) {
                                        case 1:
                                            for (Map.Entry<String, Productos> entry : treeMapProductos.entrySet()) {
                                                String key = entry.getKey();
                                                Productos value = entry.getValue();
                                                if (key.contains("H")) {
                                                    System.out.println("----------------");
                                                    System.out.println(key + " => " + value);
                                                }
                                            }
                                            break;
                                        case 2:
                                            for (Map.Entry<String, Productos> entry : treeMapProductos.entrySet()) {
                                                String key = entry.getKey();
                                                Productos value = entry.getValue();
                                                if (key.contains("C")) {
                                                    System.out.println("----------------");
                                                    System.out.println(key + " => " + value);
                                                }
                                            }
                                            break;
                                    }
                                    break;
                                case 2:
                                    switch (UI.menuSeleccionarBebida()) {
                                        case 1:
                                            for (Map.Entry<String, Productos> entry : treeMapProductos.entrySet()) {
                                                String key = entry.getKey();
                                                Productos value = entry.getValue();
                                                if (key.contains("G")) {
                                                    System.out.println("----------------");
                                                    System.out.println(key + " => " + value);
                                                }
                                            }
                                            break;
                                        case 2:
                                            for (Map.Entry<String, Productos> entry : treeMapProductos.entrySet()) {
                                                String key = entry.getKey();
                                                Productos value = entry.getValue();
                                                if (key.contains("A")) {
                                                    System.out.println("----------------");
                                                    System.out.println(key + " => " + value);
                                                }
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    UI.instruccionesCompra();
                    while (vanCarrito) {
                        String opcionCarritoCompra = UI.añadirProducto();
                        if (treeMapProductos.containsKey(opcionCarritoCompra)) {
                            Productos valor = treeMapProductos.get(opcionCarritoCompra);
                            carrito.add(valor);
                        } else if ("0".equals(opcionCarritoCompra)) {
                            vanCarrito = false;
                        } else {
                            UI.errorCarrito();
                        }
                    }
                    System.out.println("Su compra final es:");
                    for (Productos item : carrito) {
                        System.out.println(item + "\n");
                    }
                    break;
                case 4:
                    van = false;
                    UI.adios();
                    break;

            }
        }

    }
}
