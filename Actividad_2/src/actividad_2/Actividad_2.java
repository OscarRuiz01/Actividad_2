/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_2;

import java.util.Scanner;

/**
 *
 * @author OscarRuiz
 */
public class Actividad_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * 1.- Crear un horario de usted de cualquier día de la semana,
         * ej: 6 Despertar, 7 Clase LP1, 8 Clase LP1, 9 Clase Estructuras,
         * 10 …, 21 Dormir, leer un valor de 1  al 24 validar e imprimir la
         * acción que realiza en su horario.2.- Crear un metodo que determine
         * si es el día es habil (lunes a viernes), y emitir un mensaje o en su
         * caso emitir un mensaje que es fin de semana.3.- Crear un metodo que
         * lea un valor entero del 1 al 12 valide el valor y  nos diga en que
         * trimestre del año nos encontramos (Primer trimestre, Segundo Trimestre,
         * Tercer Trimeste, Cuarto Trimestre)
         */
        /**
         * 1.- Crear un horario de usted de cualquier día de la semana,
         * ej: 6 Despertar, 7 Clase LP1, 8 Clase LP1, 9 Clase Estructuras,
         * 10 …, 21 Dormir, leer un valor de 1  al 24 validar e imprimir la
         * acción que realiza en su horario.
         */
        System.out.println("=============================================================");
        Scanner st = new Scanner (System.in);
        System.out.println("Ingrese la hora que desea saber sobre mia actividades");
        int hora = st.nextInt();
        
        if (hora >= 1 && hora <= 24) {
            if(hora == 8){
                System.out.println("Despierto para poder preparar mis cosas antes de las clases en linea");
            } else if(hora >= 9 && hora < 11){
                System.out.println("Tengo clases de Ecuaciones Diferenciasles");
            } else if(hora >= 11 && hora < 13){
                System.out.println("Tengo clases de Algebra Lineal");
            } else if(hora >= 13 && hora < 17){
                System.out.println("Tango hora libre, la cual uso para comer o adelantar tareas");
            } else if(hora >= 17 && hora < 19 ){
                System.out.println("Tengo clases de Económia para Ingenieros");
            } else if(hora >= 19 && hora < 21){
                System.out.println("Tengo clases de Lenguajes de Programación I");
            } else if(hora >= 21 && hora < 4) {
                System.out.println("Hago tareas que dejaron en classroom");
            } else if(hora >= 4 && hora < 8) {
                System.out.println("Descanso");
            }
        } else {
            System.out.println("La hora que usted introdujo no es de 1 a 24 horas");
        
        }
    }
    
            public static void Actividad_2() {
            /**
             * 2.- Crear un metodo que determine
             * si es el día es habil (lunes a viernes), y emitir un mensaje o en su
             * caso emitir un mensaje que es fin de semana.
             */
                System.out.println("=============================================================");
            Scanner sr = new Scanner (System.in);
            System.out.println("Ingrese el dia que desea saber sobre mia actividades");
            int dia = sr.nextInt();
                System.out.println("1. Domingo");
                System.out.println("2. Lunes");
                System.out.println("3. Martes");
                System.out.println("4. Miercoles");
                System.out.println("5. Jueves");
                System.out.println("6. Viernes");
                System.out.println("7. Sabado");
            if (dia >= 2 && dia < 7) {
                System.out.println("Es un dia habil");
            }else if(dia == 1 || dia == 7) {
                System.out.println("Es fin de semana");
            }else {
                System.out.println("No cuenta como un dia de la semana");
            }
            
        }
            public static void Actividad_3() {
                /**
                 * 3.- Crear un metodo que
                 * lea un valor entero del 1 al 12 valide el valor y  nos diga en que
                 * trimestre del año nos encontramos (Primer trimestre, Segundo Trimestre,
                 * Tercer Trimeste, Cuarto Trimestre)
                 */
                System.out.println("=============================================================");
                Scanner sy = new Scanner (System.in);
                System.out.println("Ingrese un número del 1 al 12 para saber sobre el trimestre del año");
                int numDe = sy.nextInt();
                switch (numDe) {
                    case 1:
                        System.out.println("Es del primer trimestre");
                        break;
                    case 2:
                        System.out.println("Es del primer trimestre");
                        break;
                    case 3:
                        System.out.println("Es del primer trimestre");
                        break;
                    case 4:
                        System.out.println("Es del segundo trimestre");
                        break;
                    case 5:
                        System.out.println("Es del segundo trimestre");
                        break;
                    case 6:
                        System.out.println("Es del segundo trimestre");
                        break;
                    case 7:
                        System.out.println("Es del tercer trimestre");
                        break;
                    case 8:
                        System.out.println("Es del tercer trimestre");
                        break;
                    case 9:
                        System.out.println("Es del tercer trimestre");
                        break;
                    case 10:
                        System.out.println("Es del cuarto trimestre");
                        break;
                    case 11:
                        System.out.println("Es del cuarto trimestre");
                        break;
                    case 12:
                        System.out.println("Es del cuarto trimestre");
                        break;
                    default:
                        System.out.println("Ese número no tiene trimestre");
                        break;
                }
            }
            public static void Actividad_4 () {
                
            }
}
