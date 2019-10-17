/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomatriculas;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author claudia, henry, maria
 */
public class ProyectoMatriculas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcionPrincipal;
        boolean salir = false;

        while (!salir) {

            try {

                System.out.println("Ingrese una operación: 1) Profesores 2) Alumnos 3) Asignaturas 4) Salir");
                opcionPrincipal = scanner.nextInt();

                switch (opcionPrincipal) {
                    case 1:
                        System.out.println("Opción profesores.");
                        System.out.println("Ingrese una operación: 1) Insertar 2) Modificar 3) Eliminar 4) Volver al menú principal");
                        int opcionProfesores = scanner.nextInt();
                        //submenuOpciones(opcionProfesores);

                        while (opcionProfesores != 4) {
                            if (opcionProfesores == 1) {
                                System.out.println("Opción insertar");
                            } else if (opcionProfesores == 2) {
                                System.out.println("Opción modificar");
                            } else if (opcionProfesores == 3) {
                                System.out.println("Opción eliminar");
                            } else {
                                System.out.println("Opción incorrecta");
                            }

                            System.out.println("Ingrese una operación: 1) Insertar 2) Modificar 3) Eliminar 4) Salir");
                            opcionProfesores = scanner.nextInt();
                        }

                        break;

                    case 2:
                        System.out.println("Opción Alumnos.");
                        System.out.println("Ingrese una operación: 1) Insertar 2) Modificar 3) Eliminar 4) Volver al menú principal");
                        int opcionAlumnos = scanner.nextInt();
                        //submenuOpciones(opcionAlumnos);

                        while (opcionAlumnos != 4) {
                            if (opcionAlumnos == 1) {
                                System.out.println("Opción insertar");
                            } else if (opcionAlumnos == 2) {
                                System.out.println("Opción modificar");
                            } else if (opcionAlumnos == 3) {
                                System.out.println("Opción eliminar");
                            } else {
                                System.out.println("Opción incorrecta");
                            }

                            System.out.println("Ingrese una operación: 1) Insertar 2) Modificar 3) Eliminar 4) Salir");
                            opcionAlumnos = scanner.nextInt();
                        }
                        break;

                    case 3:
                        System.out.println("Opción Asignaturas");
                        System.out.println("Ingrese una operación: 1) Insertar 2) Modificar 3) Eliminar 4) Volver al menú principal");
                        int opcionAsignaturas = scanner.nextInt();
                        //submenuOpciones(opcionAsignaturas);
                        break;
                    case 4:
                        salir = true;

                        break;

                    default:
                        System.out.println("Opción Incorrecta.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                scanner.next();
            }

        }

    }

//    public static void submenuOpciones(int opcion) {
//        Scanner scanner = new Scanner(System.in);
//        while (opcion != 4) {
//            if (opcion == 1) {
//                System.out.println("Opción insertar");
//            } else if (opcion == 2) {
//                System.out.println("Opción modificar");
//            } else if (opcion == 3) {
//                System.out.println("Opción eliminar");
//            } else {
//                System.out.println("Opción incorrecta");
//            }
//
//            System.out.println("Ingrese una operación: 1) Insertar 2) Modificar 3) Eliminar 4) Salir");
//            opcion = scanner.nextInt();
//        }
//
//    }
}
