/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomatriculas;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author claudia, henry, maria
 */
public class ProyectoMatriculas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("************************* Matriculas ****************************************");
        Profesor profesor = new Profesor();
        List<ProfesorDto> datosProfesor;
        int opcionPrincipal;
        boolean salir = false;

        while (!salir) {

            try {

                System.out.println("\n" + " Ingrese una operación: 1) Profesores 2) Alumnos 3) Asignaturas 4) Salir.");
                opcionPrincipal = scanner.nextInt();

                switch (opcionPrincipal) {
                    case 1:
                        System.out.println("\n" + "*********** Opción Profesores**************");
                        System.out.println("Ingrese una operación: 1) Insertar 2) Modificar 3) Eliminar  4) Consultar 5) Volver al menú principal.");
                        int opcionProfesores = scanner.nextInt();
                        //submenuOpciones(opcionProfesores);

                        while (opcionProfesores != 5) {
                            if (opcionProfesores == 1) {
                                System.out.println("Opción insertar profesor");
                                System.out.println("Ingrese la profesión");
                                String profesion = scanner.next();
                                System.out.println("Ingrese los nombres");
                                String nombres = scanner.next();
                                System.out.println("Ingrese los apellidos");
                                String apellidos = scanner.next();
                                System.out.println("Ingrese la identificación");
                                int identificacion = scanner.nextInt();
                                System.out.println("Ingrese la fecha nacimiento");
                                String fechaNacimiento = scanner.next();
                                System.out.println("Ingrese el telefono");
                                String telefono = scanner.next();
                                System.out.println("Ingrese el correo");
                                String correo = scanner.next();
                                System.out.println("Ingrese la dirección");
                                String direccion = scanner.next();
                                ProfesorDto profesorDto = new ProfesorDto();
                                datosProfesor = new ArrayList<ProfesorDto>();
                                profesorDto = new ProfesorDto(profesion, nombres, apellidos, identificacion, fechaNacimiento, telefono, correo, direccion);

                                profesor.agregarProfesor(datosProfesor);

                            } else if (opcionProfesores == 2) {
                                System.out.println("Opción modificar profesor");
                            } else if (opcionProfesores == 3) {
                                System.out.println("Opción eliminar profesor");
                            } else if (opcionProfesores == 4) {
                                System.out.println("Opción consultar profesor");

                                System.out.println("Ingrese la identificación");
                                int iden = scanner.nextInt();

                                if (profesor.buscarContacto(iden)) {
                                    System.out.println("El profesor existe ");
                                } else {
                                    System.out.println("No se encontró el registro profesor");
                                }
                            } else {
                                System.out.println("Opción incorrecta, ingrese una opción valida.");
                            }

                            System.out.println("Ingrese una operación: 1) Insertar 2) Modificar 3) Eliminar 4) Consultar 5)Salir.");
                            opcionProfesores = scanner.nextInt();
                        }

                        break;

                    case 2:
                        System.out.println("\n" + "*********** Opción Alumnos**************");
                        System.out.println("Ingrese una operación: 1) Insertar 2) Modificar 3) Eliminar  4) Consultar 5) Volver al menú principal.");
                        int opcionAlumnos = scanner.nextInt();
                        //submenuOpciones(opcionAlumnos);

                        while (opcionAlumnos != 5) {
                            if (opcionAlumnos == 1) {
                                System.out.println("Opción insertar alumno.");
                                System.out.println("Ingresar nombres: ");
                                String nombres = scanner.next();
                                
                            } else if (opcionAlumnos == 2) {
                                System.out.println("Opción modificar alumno.");
                            } else if (opcionAlumnos == 3) {
                                System.out.println("Opción eliminar alumno.");
                            } else if (opcionAlumnos == 4) {
                                System.out.println("Opción consultar alumno.");
                            } else {
                                System.out.println("Opción incorrecta, ingrese una opción valida.");
                            }

                            System.out.println("Ingrese una operación: 1) Insertar 2) Modificar 3) Eliminar 4) Consultar 5)Salir.");
                            opcionAlumnos = scanner.nextInt();
                        }
                        break;

                    case 3:
                        System.out.println("\n" + "*********** Opción Asignaturas**************");
                        System.out.println("Ingrese una operación: 1) Insertar 2) Modificar 3) Eliminar  4) Consultar 5) Volver al menú principal.");
                        int opcionAsignaturas = scanner.nextInt();
                        //submenuOpciones(opcionAsignaturas);

                        while (opcionAsignaturas != 5) {
                            if (opcionAsignaturas == 1) {
                                System.out.println("Opción insertar asignatura.");
                            } else if (opcionAsignaturas == 2) {
                                System.out.println("Opción modificar asignatura.");
                            } else if (opcionAsignaturas == 3) {
                                System.out.println("Opción eliminar asignatura.");
                            } else if (opcionAsignaturas == 4) {
                                System.out.println("Opción consultar asignatura.");
                            } else {
                                System.out.println("Opción incorrecta, ingrese una opción valida.");
                            }

                            System.out.println("Ingrese una operación: 1) Insertar 2) Modificar 3) Eliminar 4) Consultar 5)Salir.");
                            opcionAsignaturas = scanner.nextInt();
                        }
                        break;
                    case 4:
                        salir = true;

                        break;

                    default:
                        System.out.println("Opción Incorrecta. Ingrese una opción valida.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número.");
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
