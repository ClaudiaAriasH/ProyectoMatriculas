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

        System.out.println("************************* Matriculas ****************************************");

        int opcionPrincipal;
        boolean salir = false;

        Asignaturas asignatura = new Asignaturas();
        AsignaturasDto asignaturaDto;
        Profesor profesor = new Profesor();
        Alumno alumno = new Alumno();

        while (!salir) {

            try {

                System.out.println("\n" + " Ingrese una operación: 1) Profesores 2) Alumnos 3) Asignaturas 4) Salir.");
                opcionPrincipal = scanner.nextInt();

                switch (opcionPrincipal) {
                    case 1:
                        System.out.println("\n" + "*********** Opción Profesores**************");
                        System.out.println("Ingrese una operación: 1) Insertar 2) Modificar 3) Eliminar  4) Consultar 5) Volver al menú principal.");
                        int opcionProfesores = scanner.nextInt();

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

                                profesor.agregarProfesor(profesion, nombres, apellidos, identificacion, fechaNacimiento, telefono, correo, direccion);

                            } else if (opcionProfesores == 2) {
                                System.out.println("Opción modificar profesor");

                                System.out.println("Ingrese la identificación: ");
                                int iden = scanner.nextInt();
                                int existe = profesor.buscarProfesor(iden);

                                if (existe != -1) {

                                    System.out.println("Seleccione el campo que desea modificar:\n1)Telefono.\n"
                                            + "2)Correo.\n3)Dirección.");

                                    int opcionseleccionada = scanner.nextInt();

                                    switch (opcionseleccionada) {

                                        case 1:
                                            System.out.println("Ingrese el nuevo telefono: ");
                                            String telefono = scanner.next();
                                            profesor.modificarProfesor(telefono, existe, opcionseleccionada);
                                            break;
                                        case 2:
                                            System.out.println("Ingrese el nuevo correo: ");
                                            String correo = scanner.next();
                                            profesor.modificarProfesor(correo, existe, opcionseleccionada);
                                            break;
                                        case 3:
                                            System.out.println("Ingrese la nueva dirección: ");
                                            String direccion = scanner.next();
                                            profesor.modificarProfesor(direccion, existe, opcionseleccionada);
                                            break;

                                        default:
                                            System.out.println("La opción seleccionada no es válida.");
                                            break;
                                    }

                                } else {
                                    System.out.println("El Profesor no existe en el sistema");
                                }

                            } else if (opcionProfesores == 3) {
                                System.out.println("Opción eliminar profesor");
                                System.out.println("Ingrese la identificación");
                                int iden = scanner.nextInt();
                                profesor.eliminarProfesor(iden);
                            } else if (opcionProfesores == 4) {
                                System.out.println("Opción consultar profesor");

                                System.out.println("Ingrese la identificación");
                                int iden = scanner.nextInt();

                                profesor.buscarProfesor(iden);

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

                        while (opcionAlumnos != 5) {
                            if (opcionAlumnos == 1) {
                                System.out.println("Opción insertar alumno.");
                                System.out.println("Ingrese los nombres: ");
                                String nombres = scanner.next();
                                System.out.println("Ingrese los apellidos: ");
                                String apellidos = scanner.next();
                                System.out.println("Ingrese la identificación: ");
                                int identificacion = scanner.nextInt();
                                System.out.println("Ingrese la fecha nacimiento Año/Mes/Día: ");
                                String fechaNacimiento = scanner.next();
                                System.out.println("Ingrese el telefono: ");
                                String telefono = scanner.next();
                                System.out.println("Ingrese el correo: ");
                                String correo = scanner.next();
                                System.out.println("Ingrese la dirección: ");
                                String direccion = scanner.next();
                                System.out.println("Ingrese si es becado: seleccione 1)SI, 2)No: ");
                                int becado = scanner.nextInt();

                                alumno.agregarAlumno(nombres, apellidos, identificacion, fechaNacimiento, telefono, correo, direccion, becado);

                            } else if (opcionAlumnos == 2) {
                                System.out.println("Opción modificar alumno.");
                                System.out.println("Ingrese la identificación: ");
                                int iden = scanner.nextInt();
                                int existe = alumno.consultarAlumno(iden);

                                if (existe != -1) {

                                    System.out.println("Seleccione el campo que desea modificar:\n1)Telefono.\n"
                                            + "2)Correo.\n3)Dirección.\n4)La beca.");

                                    int opcionseleccionada = scanner.nextInt();

                                    switch (opcionseleccionada) {

                                        case 1:
                                            System.out.println("Ingrese el nuevo telefono: ");
                                            String telefono = scanner.next();
                                            alumno.modificarAlumno(telefono, existe, opcionseleccionada);
                                            break;
                                        case 2:
                                            System.out.println("Ingrese el nuevo correo: ");
                                            String correo = scanner.next();
                                            alumno.modificarAlumno(correo, existe, opcionseleccionada);
                                            break;
                                        case 3:
                                            System.out.println("Ingrese la nueva dirección: ");
                                            String direccion = scanner.next();
                                            alumno.modificarAlumno(direccion, existe, opcionseleccionada);
                                            break;
                                        case 4:
                                            System.out.println("Modifique si es becado: seleccione 1)SI, 2)No: ");
                                            String becado = scanner.next();
                                            alumno.modificarAlumno(becado, existe, opcionseleccionada);
                                            break;
                                        default:
                                            System.out.println("La opción seleccionada no es válida.");
                                            break;
                                    }

                                } else {
                                    System.out.println("El alumno no existe en el sistema");
                                }
                            } else if (opcionAlumnos == 3) {
                                System.out.println("Opción eliminar alumno.");
                                System.out.println("Ingrese la identificación: ");
                                int iden = scanner.nextInt();
                                alumno.eliminarAlumno(iden);
                            } else if (opcionAlumnos == 4) {
                                System.out.println("Opción consultar alumno.");
                                System.out.println("Ingrese la identificación: ");
                                int iden = scanner.nextInt();
                                alumno.consultarAlumno(iden);
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

                        while (opcionAsignaturas != 5) {
                            if (opcionAsignaturas == 1) {
                                System.out.println("Opción insertar asignatura.");

                                System.out.println("Ingrese el código");
                                String codigo = scanner.next();
                                System.out.println("Ingrese el nombre");
                                String nombre = scanner.next();
                                System.out.println("Ingrese la intensidad horaria");
                                String intensidadH = scanner.next();
                                System.out.println("Ingrese los créditos");
                                String creditos = scanner.next();

                                //Agregar profesor                                 
                                profesor.agregarProfesor("medico", "rupertino", "velez", 321, "1212", "3333333", "nnn", "na");

                                asignaturaDto = new AsignaturasDto(codigo, nombre, intensidadH, creditos, profesor);
                                asignatura.agregarAsignatura(asignaturaDto);

                            } else if (opcionAsignaturas == 2) {
                                System.out.println("Opción modificar asignatura.");
                            } else if (opcionAsignaturas == 3) {
                                System.out.println("Opción eliminar asignatura.");
                                System.out.println("Ingrese el codigo de la asignatura");
                                String codigo = scanner.next();
                                asignatura.eliminarAsignatura(codigo);
                            } else if (opcionAsignaturas == 4) {
                                System.out.println("Opción consultar asignatura.");
                                System.out.println("Ingrese el codigo de la asignatura");
                                String codigo = scanner.next();
                                asignatura.buscarAsignatura(codigo);
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

}
