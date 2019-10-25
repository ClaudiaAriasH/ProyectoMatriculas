/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomatriculas;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        AlumnoDto alumnoDto;
        Profesor profesor = new Profesor();
        Alumno alumno = new Alumno();
        Matricula matricula = new Matricula();

        while (!salir) {

            try {

                System.out.println("\n" + " Ingrese una operación: 1) Profesores 2) Alumnos 3) Asignaturas 4) Matrícula 5)Salir.");
                opcionPrincipal = scanner.nextInt();
                
                if(opcionPrincipal < 0 ){
                    throw new MenuException();
                }

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
                                ProfesorDto profesorAsignado = profesor.seleccionarProfesor();
                                asignaturaDto = new AsignaturasDto(codigo, nombre, intensidadH, creditos, profesorAsignado);
                                asignatura.agregarAsignatura(asignaturaDto);

                            } else if (opcionAsignaturas == 2) {
                                System.out.println("Opción modificar asignatura.");

                                System.out.println("Ingrese el código: ");
                                int codigo = scanner.nextInt();
                                int existe = asignatura.buscarAsignatura(codigo);

                                if (existe != -1) {

                                    System.out.println("Seleccione el campo que desea modificar:\n1)Nombre.\n"
                                            + "2)Intensidad Horaria.\n3)Créditos.");

                                    int opcionseleccionada = scanner.nextInt();

                                    switch (opcionseleccionada) {

                                        case 1:
                                            System.out.println("Ingrese el nuevo nombre: ");
                                            String nombre = scanner.next();
                                            asignatura.modificarAsignatura(nombre, existe, opcionseleccionada);
                                            break;
                                        case 2:
                                            System.out.println("Ingrese la nueva intensidad horaria: ");
                                            String intHoraria = scanner.next();
                                            asignatura.modificarAsignatura(intHoraria, existe, opcionseleccionada);
                                            break;
                                        case 3:
                                            System.out.println("Ingrese los nuevos créditos: ");
                                            String creditos = scanner.next();
                                            asignatura.modificarAsignatura(creditos, existe, opcionseleccionada);
                                            break;

                                        default:
                                            System.out.println("La opción seleccionada no es válida.");
                                            break;
                                    }

                                } else {
                                    System.out.println("La asignatura no existe en el sistema");
                                }

                            } else if (opcionAsignaturas == 3) {
                                System.out.println("Opción eliminar asignatura.");
                                System.out.println("Ingrese el codigo de la asignatura");
                                String codigo = scanner.next();
                                asignatura.eliminarAsignatura(codigo);
                            } else if (opcionAsignaturas == 4) {
                                System.out.println("Opción consultar asignatura.");
                                System.out.println("Ingrese el codigo de la asignatura");
                                int codigo = scanner.nextInt();
                                asignatura.buscarAsignatura(codigo);
                            } else {

                                System.out.println("Opción incorrecta, ingrese una opción valida.");
                            }

                            System.out.println("Ingrese una operación: 1) Insertar 2) Modificar 3) Eliminar 4) Consultar 5)Salir.");
                            opcionAsignaturas = scanner.nextInt();
                        }
                        break;
                    case 4:

                        System.out.println("Ingrese el código de la asignatura: ");
                        int codigo = scanner.nextInt();

                        String resultadoAsignatura = asignatura.seleccionar(codigo);

                        System.out.println("Ingrese el identificación del alumno: ");
                        int identificacion = scanner.nextInt();
                        String resultadoAlumno = alumno.seleccionar(identificacion);
                        System.out.println("\n" + "***************** Datos Matricula *********************");
                        matricula.matricularEstudiante(resultadoAsignatura, resultadoAlumno);

                        break;

                    case 5:

                        salir = true;

                        break;

                    default:
                        System.out.println("Opción Incorrecta. Ingrese una opción valida.");
                }
            } catch (Exception e) {
                System.out.println(e);
            }

        }

    }

}
