package unilab;

import java.util.Random;
import javax.swing.JOptionPane;

public class Unilab {

    public static void main(String[] args) {
        // Define
        int opmenu1, opmenu2, opmenu3, opmenu4, cMenu1, cMenu2, cMenu3, cMenu4;
        cMenu1 = 1;

        while (cMenu1 == 1) {
            // Lee
            opmenu1 = Integer.parseInt(
                    JOptionPane.showInputDialog(null, "1. Miscelánea de Juegos \n2. Procesos matemáticos \n3. Salir",
                            "Menu Principal", JOptionPane.PLAIN_MESSAGE));
            switch (opmenu1) {
                case 1 -> {
                    cMenu2 = 1;
                    while (cMenu2 == 1) {
                        opmenu2 = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "1. Dados \n2. Punto y fama \n3. Triqui \n4. Salir",
                                "Miscelánea de Juegos", JOptionPane.PLAIN_MESSAGE));
                        switch (opmenu2) {
                            case 1:
                                // Defnir variables
                                int dado1,
                                 dado2,
                                 player,
                                 puntaje1 = 0,
                                 puntaje2 = 0,
                                 acum1 = 0,
                                 acum2 = 0,
                                 tirar,
                                 resta1 = 0,
                                 resta2 = 0;
                                int seguir = Integer
                                        .parseInt(JOptionPane.showInputDialog("Bienvenido!\n(Digite 1 para iniciar)"));
                                // Se inicia un contador para controlar el numero de jugadas
                                while (seguir <= 21) {
                                    player = 1;
                                    while (player == 1) {
                                        puntaje1 = 0;
                                        Random num1 = new Random();
                                        dado1 = num1.nextInt(7);
                                        if (dado1 == 0) {
                                            dado1 = dado1 + 1;
                                        }
                                        Random num2 = new Random();
                                        dado2 = num2.nextInt(7);
                                        if (dado2 == 0) {
                                            dado2 = dado2 + 1;
                                        }
                                        // Se generan los dados
                                        tirar = Integer.parseInt(JOptionPane
                                                .showInputDialog("Jugador 1, arroje los dados \n(1.Arrojar): "));
                                        if (tirar == 1) {
                                            seguir = seguir + 1;
                                            JOptionPane.showMessageDialog(null,
                                                    "Resultado Jugador 1:\nDado1: " + dado1 + "\nDado2: " + dado2);
                                            puntaje1 = puntaje1 + dado1 + dado2;
                                            while (dado1 == dado2) {
                                                // Ciclo para cuando salgan dobles
                                                puntaje1 = 0;
                                                acum1 = acum1 + 1;
                                                resta1 = resta1 + 1;
                                                // COntador para en caso de que los puntajes sean iguales, restarle esto
                                                // al acumulado
                                                JOptionPane.showMessageDialog(null,
                                                        "Debido a sacar dobles, obtiene un punto y puede volver a tirar");
                                                dado1 = num1.nextInt(7);
                                                if (dado1 == 0) {
                                                    dado1 = dado1 + 1;
                                                }

                                                dado2 = num2.nextInt(7);
                                                if (dado2 == 0) {
                                                    dado2 = dado2 + 1;
                                                }
                                                // Se vuelven a generar los dados, en caso de que algun numero aleatorio
                                                // sea 0 a este se le sumara 1
                                                tirar = Integer.parseInt(JOptionPane.showInputDialog(
                                                        "Jugador 1, arroje los dados \n(1.Arrojar): "));
                                                if (tirar == 1) {
                                                    seguir = seguir + 1;
                                                    JOptionPane.showMessageDialog(null, "Resultado Jugador 1:\nDado1: "
                                                            + dado1 + "\nDado2: " + dado2);
                                                    puntaje1 = puntaje1 + dado1 + dado2;
                                                }
                                            }
                                            JOptionPane.showMessageDialog(null, "Puntaje de la jugada: " + puntaje1);
                                            player = 2;
                                        }
                                    }
                                    if ((acum1 - acum2) >= 15 || (acum2 - acum1) >= 15) {
                                        JOptionPane.showMessageDialog(null, "Ventaja de 15 puntos, partido acabado");
                                        seguir = 22;
                                    }
                                    // si algun jugador obtiene una ventaja de 15 puntos acumulados, se pone un
                                    // valor al elevado al contador para salir del ciclo (se ubica aqui para asi si
                                    // el jugador 1 sobrepasa en 15 a el jugador 2, se saldra del ciclo de inmediato
                                    // y no le dara la oportunidad al jugador 2 de salvar esta diferencia)
                                    while (player == 2) {
                                        puntaje2 = 0;
                                        Random num1 = new Random();
                                        dado1 = num1.nextInt(7);
                                        if (dado1 == 0) {
                                            dado1 = dado1 + 1;
                                        }
                                        Random num2 = new Random();
                                        dado2 = num2.nextInt(7);
                                        if (dado2 == 0) {
                                            dado2 = dado2 + 1;
                                        }
                                        // se generan los dados para el jugador 2
                                        tirar = Integer.parseInt(JOptionPane
                                                .showInputDialog("Jugador 2, arroje los dados \n(1.Arrojar): "));
                                        if (tirar == 1) {
                                            JOptionPane.showMessageDialog(null,
                                                    "Resultado Jugador 2:\nDado1: " + dado1 + "\nDado2: " + dado2);
                                            puntaje2 = puntaje2 + dado1 + dado2;
                                            while (dado1 == dado2) {
                                                puntaje2 = 0;
                                                acum2 = acum2 + 1;
                                                resta2 = resta2 + 1;
                                                // contador para en caso de que los puntajes sean iguales, restarle esto
                                                // al acumulado
                                                JOptionPane.showMessageDialog(null,
                                                        "Debido a sacar dobles, obtiene un punto y puede volver a tirar");

                                                dado1 = num1.nextInt(7);
                                                if (dado1 == 0) {
                                                    dado1 = dado1 + 1;
                                                }

                                                dado2 = num2.nextInt(7);
                                                if (dado2 == 0) {
                                                    dado2 = dado2 + 1;
                                                }
                                                tirar = Integer.parseInt(JOptionPane.showInputDialog(
                                                        "Jugador 2, arroje los dados \n(1.Arrojar): "));
                                                if (tirar == 1) {
                                                    JOptionPane.showMessageDialog(null, "Resultado Jugador 2:\nDado1: "
                                                            + dado1 + "\nDado2: " + dado2);
                                                    puntaje2 = puntaje2 + dado1 + dado2;
                                                }
                                            }
                                            JOptionPane.showMessageDialog(null, "Puntaje de la jugada: " + puntaje2);
                                            player = 3;
                                            // se iguala a 3 para salir del ciclo para poder evaluar si alguna de las
                                            // condiciones de victoria se cumple y repartir los puntos ganados
                                        }
                                    }
                                    if (puntaje1 == puntaje2) {
                                        JOptionPane.showMessageDialog(null,
                                                "Debido a puntajes iguales se anulara la jugada, ningun jugador recibira puntos");
                                        seguir = seguir - 1;
                                        acum1 = acum1 - resta1;
                                        acum2 = acum2 - resta2;
                                        // Si el puntaje es el mismo se anula la jugada y se restaran los puntos
                                        // otorgados por dobles
                                    } else {
                                        if (puntaje1 > puntaje2) {
                                            acum1 = acum1 + 3;
                                        }
                                        if (puntaje2 > puntaje1) {
                                            acum2 = acum2 + 3;
                                        } // puntos para el jugador con mayor numero en la jugada
                                    }
                                    if ((acum1 - acum2) >= 15 || (acum2 - acum1) >= 15) {
                                        JOptionPane.showMessageDialog(null, "Ventaja de 15 puntos, partido acabado");
                                        seguir = 22;
                                    }
                                    // si algun jugador obtiene una ventaja de 15 puntos acumulados, se pone un
                                    // valor al elevado al contador para salir del ciclo
                                    JOptionPane.showMessageDialog(null, "Puntaje acumulado Jugador 1: " + acum1
                                            + "\nPuntaje acumulado Jugador 2: " + acum2);
                                    // aqui se ira mostrando los puntos de los jugadores
                                }
                                if (acum1 > acum2) {
                                    JOptionPane.showMessageDialog(null, "El ganador es el Jugador 1");
                                } else {
                                    JOptionPane.showMessageDialog(null, "El ganador es el Jugador 2");
                                }
                                break;
                            case 2:
                                // Famas
                                int d1,
                                 d2,
                                 d3,
                                 d4,
                                 d21,
                                 d22,
                                 d23,
                                 d24,
                                 famas;
                                famas = 0;
                                int puntos = 0,
                                 i = 1;
                                int cifra1,
                                 cifra2,
                                 cifra2o,
                                 cifra1o;
                                Random num1 = new Random();
                                cifra1 = num1.nextInt(10000);

                                if (cifra1 < 1000) {
                                    cifra1 = cifra1 + 1000;
                                }
                                cifra1o = cifra1;
                                // variable para guardar el numero original para la comparacion
                                d4 = cifra1 % 10;
                                cifra1 = cifra1 / 10;
                                d3 = cifra1 % 10;
                                cifra1 = cifra1 / 10;
                                d2 = cifra1 % 10;
                                cifra1 = cifra1 / 10;
                                d1 = cifra1 % 10;

                                // se genera un numero aleatorio hasta 9999, si este numero es menor a 1000, se
                                // le sumara 1000 para asi volverlo de 4 cifras, despues con una serie de
                                // operaciones se separa cada digito
                                while (d1 == d2 || d1 == d3 || d1 == d4 || d2 == d3 || d2 == d4 || d3 == d4) {
                                    // while para comparar los digitos y validar que ninguno sea igual, en caso de
                                    // que sea igual se volvera a generar el numero
                                    cifra1 = num1.nextInt(10000);

                                    if (cifra1 < 1000) {
                                        cifra1 = cifra1 + 1000;
                                    }
                                    cifra1o = cifra1;
                                    d4 = cifra1 % 10;
                                    cifra1 = cifra1 / 10;
                                    d3 = cifra1 % 10;
                                    cifra1 = cifra1 / 10;
                                    d2 = cifra1 % 10;
                                    cifra1 = cifra1 / 10;
                                    d1 = cifra1 % 10;
                                    // se realiza la misma serie de operaciones anterior
                                }
                                cifra2 = Integer.parseInt(JOptionPane.showInputDialog(
                                        "El numero ha sido generado, Jugador por favor ingrese un numero de 4 digitos sin digitos repetidos"));
                                cifra2o = cifra2; // variable para guardar numero original
                                d24 = cifra2 % 10;
                                cifra2 = cifra2 / 10;
                                d23 = cifra2 % 10;
                                cifra2 = cifra2 / 10;
                                d22 = cifra2 % 10;
                                cifra2 = cifra2 / 10;
                                d21 = cifra2 % 10;// misma serie de operaciones anterior, aplicada al numero digitado
                                // por el usuario

                                while (cifra2o < 1000 || cifra2o > 9999) { // se valida que el numero sea de 4digitos
                                    cifra2 = Integer.parseInt(JOptionPane
                                            .showInputDialog("Numero invalido!, Por favor ingrese un numero valido"));
                                    cifra2o = cifra2;
                                    d24 = cifra2 % 10;
                                    cifra2 = cifra2 / 10;
                                    d23 = cifra2 % 10;
                                    cifra2 = cifra2 / 10;
                                    d22 = cifra2 % 10;
                                    cifra2 = cifra2 / 10;
                                    d21 = cifra2 % 10;

                                }
                                while (d21 == d22 || d21 == d23 || d21 == d24 || d22 == d23 || d22 == d24
                                        || d23 == d24) { // se valida que el numero no tenga digitos repetidos
                                    cifra2 = Integer.parseInt(JOptionPane.showInputDialog(
                                            "Numero con digitos repetidos!, Por favor ingrese un numero sin digitos repetidos: "));
                                    cifra2o = cifra2;
                                    d24 = cifra2 % 10;
                                    cifra2 = cifra2 / 10;
                                    d23 = cifra2 % 10;
                                    cifra2 = cifra2 / 10;
                                    d22 = cifra2 % 10;
                                    cifra2 = cifra2 / 10;
                                    d21 = cifra2 % 10;

                                }

                                while (cifra2o != cifra1o) {
                                    // si el numero digitado no es igual al numero generado por la pc, se compararan
                                    // los digitos de ambos y sus posiciones, brindando 1 fama por mismo numero en
                                    // misma posicion o 1 punto por mismo numero en diferente posicion
                                    famas = 0;
                                    puntos = 0;
                                    if (d24 == d4) {
                                        famas = famas + 1;
                                    } else {
                                        if (d24 == d3 || d24 == d2 || d24 == d1) {
                                            puntos = puntos + 1;
                                        }
                                    }
                                    if (d23 == d3) {
                                        famas = famas + 1;
                                    } else {
                                        if (d23 == d4 || d23 == d2 || d23 == d1) {
                                            puntos = puntos + 1;
                                        }
                                    }
                                    if (d22 == d2) {
                                        famas = famas + 1;
                                    } else {
                                        if (d22 == d3 || d22 == d4 || d22 == d1) {
                                            puntos = puntos + 1;
                                        }
                                    }
                                    if (d21 == d1) {
                                        famas = famas + 1;
                                    } else {
                                        if (d21 == d3 || d21 == d2 || d21 == d4) {
                                            puntos = puntos + 1;
                                        }
                                    }
                                    JOptionPane.showMessageDialog(null,
                                            "Numero de Famas: " + famas + "\nNumero de puntos: " + puntos);
                                    cifra2 = Integer.parseInt(
                                            JOptionPane.showInputDialog("Por favor ingrese otro numero nuevamente: "));
                                    cifra2o = cifra2;
                                    d24 = cifra2 % 10;
                                    cifra2 = cifra2 / 10;
                                    d23 = cifra2 % 10;
                                    cifra2 = cifra2 / 10;
                                    d22 = cifra2 % 10;
                                    cifra2 = cifra2 / 10;
                                    d21 = cifra2 % 10;
                                    while (cifra2o < 1000 || cifra2o > 9999) {
                                        // se valida que el numero sea de digitos
                                        cifra2 = Integer.parseInt(JOptionPane.showInputDialog(
                                                "Numero invalido!, Por favor ingrese un numero valido"));
                                        cifra2o = cifra2;
                                        d24 = cifra2 % 10;
                                        cifra2 = cifra2 / 10;
                                        d23 = cifra2 % 10;
                                        cifra2 = cifra2 / 10;
                                        d22 = cifra2 % 10;
                                        cifra2 = cifra2 / 10;
                                        d21 = cifra2 % 10;
                                    }
                                    while (d21 == d22 || d21 == d23 || d21 == d24 || d22 == d23 || d22 == d24
                                            || d23 == d24) {
                                        // se valida que el numero no tenga digitos repetidos
                                        cifra2 = Integer.parseInt(JOptionPane.showInputDialog(
                                                "Numero con digitos repetidos!, Por favor ingrese un numero sin digitos repetidos: "));
                                        cifra2o = cifra2;
                                        d24 = cifra2 % 10;
                                        cifra2 = cifra2 / 10;
                                        d23 = cifra2 % 10;
                                        cifra2 = cifra2 / 10;
                                        d22 = cifra2 % 10;
                                        cifra2 = cifra2 / 10;
                                        d21 = cifra2 % 10;
                                    }
                                    // contador para ver el numero de intentos
                                    i = i + 1;
                                }
                                JOptionPane.showMessageDialog(null,
                                        "Felicidades! Adivinaste el numero\nNumero de intentos " + i);

                                break;
                            case 3:
                                // Define
                                int c1 = 0,
                                 c2 = 0,
                                 c3 = 0,
                                 c4 = 0,
                                 c5 = 0,
                                 c6 = 0,
                                 c7 = 0,
                                 c8 = 0,
                                 c9 = 0,
                                 casilla,
                                 usuario = 1,
                                 completado = 0;
                                String sc1 = "  ",
                                 sc2 = "  ",
                                 sc3 = "  ",
                                 sc4 = "  ",
                                 sc5 = "  ",
                                 sc6 = "  ",
                                 sc7 = "  ",
                                 sc8 = "  ",
                                 sc9 = "  ",
                                 tabla;

                                while (completado == 0) {

                                    while (usuario == 1 && completado == 0) {
                                        // Organiza 
                                        tabla = sc1 + " | " + sc2 + " | " + sc3 + "\n" + sc4 + " | " + sc5 + " | " + sc6
                                                + "\n" + sc7 + " | " + sc8 + " | " + sc9;
                                        // Lee
                                        casilla = Integer.parseInt(
                                                JOptionPane.showInputDialog(null, tabla,
                                                        "Usuario 1", JOptionPane.PLAIN_MESSAGE));
                                        // Valida
                                        while (casilla < 1 || casilla > 9) {
                                            tabla = sc1 + " | " + sc2 + " | " + sc3 + "\n" + sc4 + " | " + sc5 + " | "
                                                    + sc6
                                                    + "\n" + sc7 + " | " + sc8 + " | " + sc9;
                                            casilla = Integer.parseInt(
                                                    JOptionPane.showInputDialog(null, tabla,
                                                            "Usuario 1", JOptionPane.PLAIN_MESSAGE));
                                        }
                                        // Proceso
                                        switch (casilla) {
                                            case 1:
                                                if (c1 == 0) {
                                                    c1 = 1;
                                                    sc1 = "O";
                                                    usuario = 2;
                                                } else {
                                                    JOptionPane.showMessageDialog(null,
                                                            "Casilla no valida", "Error", JOptionPane.PLAIN_MESSAGE);
                                                }
                                                break;

                                            case 2:
                                                if (c2 == 0) {
                                                    c2 = 1;
                                                    sc2 = "O";
                                                    usuario = 2;
                                                } else {
                                                    JOptionPane.showMessageDialog(null,
                                                            "Casilla no valida", "Error", JOptionPane.PLAIN_MESSAGE);
                                                }
                                                break;

                                            case 3:
                                                if (c3 == 0) {
                                                    c3 = 1;
                                                    sc3 = "O";
                                                    usuario = 2;
                                                } else {
                                                    JOptionPane.showMessageDialog(null,
                                                            "Casilla no valida", "Error", JOptionPane.PLAIN_MESSAGE);
                                                }
                                                break;

                                            case 4:
                                                if (c4 == 0) {
                                                    c4 = 1;
                                                    sc4 = "O";
                                                    usuario = 2;
                                                } else {
                                                    JOptionPane.showMessageDialog(null,
                                                            "Casilla no valida", "Error", JOptionPane.PLAIN_MESSAGE);
                                                }
                                                break;

                                            case 5:
                                                if (c5 == 0) {
                                                    c5 = 1;
                                                    sc5 = "O";
                                                    usuario = 2;
                                                } else {
                                                    JOptionPane.showMessageDialog(null,
                                                            "Casilla no valida", "Error", JOptionPane.PLAIN_MESSAGE);
                                                }
                                                break;

                                            case 6:
                                                if (c6 == 0) {
                                                    c6 = 1;
                                                    sc6 = "O";
                                                    usuario = 2;
                                                } else {
                                                    JOptionPane.showMessageDialog(null,
                                                            "Casilla no valida", "Error", JOptionPane.PLAIN_MESSAGE);
                                                }
                                                break;

                                            case 7:
                                                if (c7 == 0) {
                                                    c7 = 1;
                                                    sc7 = "O";
                                                    usuario = 2;
                                                } else {
                                                    JOptionPane.showMessageDialog(null,
                                                            "Casilla no valida", "Error", JOptionPane.PLAIN_MESSAGE);
                                                }
                                                break;

                                            case 8:
                                                if (c8 == 0) {
                                                    c8 = 1;
                                                    sc8 = "O";
                                                    usuario = 2;
                                                } else {
                                                    JOptionPane.showMessageDialog(null,
                                                            "Casilla no valida", "Error", JOptionPane.PLAIN_MESSAGE);
                                                }
                                                break;

                                            case 9:
                                                if (c9 == 0) {
                                                    c9 = 1;
                                                    sc9 = "O";
                                                    usuario = 2;
                                                } else {
                                                    JOptionPane.showMessageDialog(null,
                                                            "Casilla no valida", "Error", JOptionPane.PLAIN_MESSAGE);
                                                }
                                                break;
                                        }
                                    }
                                    // Valida
                                    if (c1 == 1 && c2 == 1 && c3 == 1) {
                                        JOptionPane.showMessageDialog(null,
                                                "Jugador uno ha ganado la partida", "Ganador",
                                                JOptionPane.PLAIN_MESSAGE);
                                        completado = 1;
                                    } else {
                                        if (c4 == 1 && c5 == 1 && c6 == 1) {
                                            JOptionPane.showMessageDialog(null,
                                                    "Jugador uno ha ganado la partida", "Ganador",
                                                    JOptionPane.PLAIN_MESSAGE);
                                            completado = 1;
                                        } else {
                                            if (c7 == 1 && c8 == 1 && c9 == 1) {
                                                JOptionPane.showMessageDialog(null,
                                                        "Jugador uno ha ganado la partida", "Ganador",
                                                        JOptionPane.PLAIN_MESSAGE);
                                                completado = 1;
                                            } else {
                                                if (c1 == 1 && c4 == 1 && c7 == 1) {
                                                    JOptionPane.showMessageDialog(null,
                                                            "Jugador uno ha ganado la partida", "Ganador",
                                                            JOptionPane.PLAIN_MESSAGE);
                                                    completado = 1;
                                                } else {
                                                    if (c2 == 1 && c5 == 1 && c8 == 1) {
                                                        JOptionPane.showMessageDialog(null,
                                                                "Jugador uno ha ganado la partida", "Ganador",
                                                                JOptionPane.PLAIN_MESSAGE);
                                                        completado = 1;
                                                    } else {
                                                        if (c3 == 1 && c6 == 1 && c9 == 1) {
                                                            JOptionPane.showMessageDialog(null,
                                                                    "Jugador uno ha ganado la partida", "Ganador",
                                                                    JOptionPane.PLAIN_MESSAGE);
                                                            completado = 1;
                                                        } else {
                                                            if (c1 == 1 && c5 == 1 && c9 == 1) {
                                                                JOptionPane.showMessageDialog(null,
                                                                        "Jugador uno ha ganado la partida", "Ganador",
                                                                        JOptionPane.PLAIN_MESSAGE);
                                                                completado = 1;
                                                            } else {
                                                                if (c3 == 1 && c5 == 1 && c7 == 1) {
                                                                    System.out.println(
                                                                            "Jugador uno ha ganado la partida");
                                                                    completado = 1;
                                                                } else {
                                                                    if (c1 != 0 && c2 != 0 && c3 != 0 && c4 != 0
                                                                            && c5 != 0 && c6 != 0 && c7 != 0 && c8 != 0
                                                                            && c9 != 0) {

                                                                        JOptionPane.showMessageDialog(null,
                                                                                "No hubo ganador en esta partida",
                                                                                "Se acabo", JOptionPane.PLAIN_MESSAGE);
                                                                        completado = 1;
                                                                    }
                                                                    while (usuario == 2 && completado == 0) {
                                                                        // Organiza
                                                                        tabla = sc1 + " | " + sc2 + " | " + sc3 + "\n"
                                                                                + sc4 + " | " + sc5 + " | " + sc6
                                                                                + "\n" + sc7 + " | " + sc8 + " | "
                                                                                + sc9;
                                                                        // Lee
                                                                        casilla = Integer.parseInt(
                                                                                JOptionPane.showInputDialog(null, tabla,
                                                                                        "Usuario 2",
                                                                                        JOptionPane.PLAIN_MESSAGE));
                                                                        // Valida
                                                                        while (casilla < 1 || casilla > 9) {
                                                                            tabla = sc1 + " | " + sc2 + " | " + sc3
                                                                                    + "\n" + sc4 + " | " + sc5 + " | "
                                                                                    + sc6
                                                                                    + "\n" + sc7 + " | " + sc8 + " | "
                                                                                    + sc9;
                                                                            casilla = Integer.parseInt(
                                                                                    JOptionPane.showInputDialog(null,
                                                                                            tabla,
                                                                                            "Usuario 2",
                                                                                            JOptionPane.PLAIN_MESSAGE));
                                                                        }
                                                                        // Valida
                                                                        switch (casilla) {
                                                                            case 1:
                                                                                if (c1 == 0) {
                                                                                    c1 = 2;
                                                                                    sc1 = "X";
                                                                                    usuario = 1;
                                                                                } else {
                                                                                    JOptionPane.showMessageDialog(null,
                                                                                            "Casilla no valida",
                                                                                            "Error",
                                                                                            JOptionPane.PLAIN_MESSAGE);
                                                                                }
                                                                                break;

                                                                            case 2:
                                                                                if (c2 == 0) {
                                                                                    c2 = 2;
                                                                                    sc2 = "X";
                                                                                    usuario = 1;
                                                                                } else {
                                                                                    JOptionPane.showMessageDialog(null,
                                                                                            "Casilla no valida",
                                                                                            "Error",
                                                                                            JOptionPane.PLAIN_MESSAGE);
                                                                                }
                                                                                break;

                                                                            case 3:
                                                                                if (c3 == 0) {
                                                                                    c3 = 2;
                                                                                    sc3 = "X";
                                                                                    usuario = 1;
                                                                                } else {
                                                                                    JOptionPane.showMessageDialog(null,
                                                                                            "Casilla no valida",
                                                                                            "Error",
                                                                                            JOptionPane.PLAIN_MESSAGE);
                                                                                }
                                                                                break;

                                                                            case 4:
                                                                                if (c4 == 0) {
                                                                                    c4 = 2;
                                                                                    sc4 = "X";
                                                                                    usuario = 1;
                                                                                } else {
                                                                                    JOptionPane.showMessageDialog(null,
                                                                                            "Casilla no valida",
                                                                                            "Error",
                                                                                            JOptionPane.PLAIN_MESSAGE);
                                                                                }
                                                                                break;

                                                                            case 5:
                                                                                if (c5 == 0) {
                                                                                    c5 = 2;
                                                                                    sc5 = "X";
                                                                                    usuario = 1;
                                                                                } else {
                                                                                    JOptionPane.showMessageDialog(null,
                                                                                            "Casilla no valida",
                                                                                            "Error",
                                                                                            JOptionPane.PLAIN_MESSAGE);
                                                                                }
                                                                                break;

                                                                            case 6:
                                                                                if (c6 == 0) {
                                                                                    c6 = 2;
                                                                                    sc6 = "X";
                                                                                    usuario = 1;
                                                                                } else {
                                                                                    JOptionPane.showMessageDialog(null,
                                                                                            "Casilla no valida",
                                                                                            "Error",
                                                                                            JOptionPane.PLAIN_MESSAGE);
                                                                                }
                                                                                break;

                                                                            case 7:
                                                                                if (c7 == 0) {
                                                                                    c7 = 2;
                                                                                    sc7 = "X";
                                                                                    usuario = 1;
                                                                                } else {
                                                                                    JOptionPane.showMessageDialog(null,
                                                                                            "Casilla no valida",
                                                                                            "Error",
                                                                                            JOptionPane.PLAIN_MESSAGE);
                                                                                }
                                                                                break;

                                                                            case 8:
                                                                                if (c8 == 0) {
                                                                                    c8 = 2;
                                                                                    sc8 = "X";
                                                                                    usuario = 1;
                                                                                } else {
                                                                                    JOptionPane.showMessageDialog(null,
                                                                                            "Casilla no valida",
                                                                                            "Error",
                                                                                            JOptionPane.PLAIN_MESSAGE);
                                                                                }
                                                                                break;

                                                                            case 9:
                                                                                if (c9 == 0) {
                                                                                    c9 = 2;
                                                                                    sc9 = "X";
                                                                                    usuario = 1;
                                                                                } else {
                                                                                    JOptionPane.showMessageDialog(null,
                                                                                            "Casilla no valida",
                                                                                            "Error",
                                                                                            JOptionPane.PLAIN_MESSAGE);
                                                                                }
                                                                                break;
                                                                        }
                                                                    }
                                                                    // Valida
                                                                    if (c1 == 2 && c2 == 2 && c3 == 2) {
                                                                        JOptionPane.showMessageDialog(null,
                                                                                "Jugador dos ha ganado la partida",
                                                                                "Ganador",
                                                                                JOptionPane.PLAIN_MESSAGE);
                                                                        completado = 1;
                                                                    } else {
                                                                        if (c4 == 2 && c5 == 2 && c6 == 2) {
                                                                            JOptionPane.showMessageDialog(null,
                                                                                    "Jugador dos ha ganado la partida",
                                                                                    "Ganador",
                                                                                    JOptionPane.PLAIN_MESSAGE);
                                                                            completado = 1;
                                                                        } else {
                                                                            if (c7 == 2 && c8 == 2 && c9 == 2) {
                                                                                JOptionPane.showMessageDialog(null,
                                                                                        "Jugador dos ha ganado la partida",
                                                                                        "Ganador",
                                                                                        JOptionPane.PLAIN_MESSAGE);
                                                                                completado = 1;
                                                                            } else {
                                                                                if (c1 == 2 && c4 == 2 && c7 == 2) {
                                                                                    JOptionPane.showMessageDialog(null,
                                                                                            "Jugador dos ha ganado la partida",
                                                                                            "Ganador",
                                                                                            JOptionPane.PLAIN_MESSAGE);
                                                                                    completado = 1;
                                                                                } else {
                                                                                    if (c2 == 2 && c5 == 2 && c8 == 2) {
                                                                                        JOptionPane.showMessageDialog(
                                                                                                null,
                                                                                                "Jugador dos ha ganado la partida",
                                                                                                "Ganador",
                                                                                                JOptionPane.PLAIN_MESSAGE);
                                                                                        completado = 1;
                                                                                    } else {
                                                                                        if (c3 == 2 && c6 == 2
                                                                                                && c9 == 2) {
                                                                                            JOptionPane
                                                                                                    .showMessageDialog(
                                                                                                            null,
                                                                                                            "Jugador dos ha ganado la partida",
                                                                                                            "Ganador",
                                                                                                            JOptionPane.PLAIN_MESSAGE);
                                                                                            completado = 1;
                                                                                        } else {
                                                                                            if (c1 == 2 && c5 == 2
                                                                                                    && c9 == 2) {
                                                                                                JOptionPane
                                                                                                        .showMessageDialog(
                                                                                                                null,
                                                                                                                "Jugador dos ha ganado la partida",
                                                                                                                "Ganador",
                                                                                                                JOptionPane.PLAIN_MESSAGE);
                                                                                                completado = 1;
                                                                                            } else {
                                                                                                if (c3 == 2 && c5 == 2
                                                                                                        && c7 == 2) {
                                                                                                    JOptionPane
                                                                                                            .showMessageDialog(
                                                                                                                    null,
                                                                                                                    "Jugador dos ha ganado la partida",
                                                                                                                    "Ganador",
                                                                                                                    JOptionPane.PLAIN_MESSAGE);
                                                                                                    completado = 1;
                                                                                                } else {
                                                                                                    if (c1 != 0
                                                                                                            && c2 != 0
                                                                                                            && c3 != 0
                                                                                                            && c4 != 0
                                                                                                            && c5 != 0
                                                                                                            && c6 != 0
                                                                                                            && c7 != 0
                                                                                                            && c8 != 0
                                                                                                            && c9 != 0) {
                                                                                                        JOptionPane
                                                                                                                .showMessageDialog(
                                                                                                                        null,
                                                                                                                        "No hubo ganador en esta partida",
                                                                                                                        "Se acabo",
                                                                                                                        JOptionPane.PLAIN_MESSAGE);
                                                                                                        completado = 1;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                break;
                            case 4:
                                // Sale
                                JOptionPane.showConfirmDialog(null, "Confirma su salida?", "Salir",
                                        JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
                                cMenu2 = 0;
                                break;
                        }
                    }
                }
                case 2 -> {
                    cMenu3 = 1;
                    while (cMenu3 == 1) {
                        opmenu3 = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "1. Multiplicación Rusa \n2. Eliminar un dígito \n3. Series de Taylor \n4. Salir",
                                "Procesos matemáticos", JOptionPane.PLAIN_MESSAGE));
                        switch (opmenu3) {
                            case 1:
                                // Define
                                int a;
                                int b;
                                int c;
                                int mc;
                                int md;
                                int ci = 1;

                                while (ci == 1) {
                                    //Lee
                                    c = 0;
                                    mc = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresar multiplicador",
                                            "Multiplicacion rusa", JOptionPane.PLAIN_MESSAGE));
                                    md = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresar multiplicando",
                                            "Multiplicacion rusa", JOptionPane.PLAIN_MESSAGE));
                                    a = mc;
                                    b = md;

                                    //Evalua
                                    while (a != 0) {
                                        if (a % 2 != 0) {
                                            c = c + b;
                                        }
                                        a = (int) Math.floor(a / 2);
                                        b = b * 2;
                                    }

                                    //Muestra
                                    JOptionPane.showMessageDialog(null,
                                            "El resultado de " + mc + " multiplicado por " + md + " es: " + c,
                                            "Multiplicacion rusa", JOptionPane.PLAIN_MESSAGE);
                                    ci = Integer.parseInt(JOptionPane.showInputDialog(null,
                                            "¿Desea hacer otra multiplicación? \n1. ¡Si quiero!\n2. ¡No quiero!",
                                            "Multiplicacion rusa", JOptionPane.PLAIN_MESSAGE));
                                    while (ci < 1 || ci > 2) {
                                        ci = Integer.parseInt(
                                                JOptionPane.showInputDialog(null, "Por favor, digie una opción valida",
                                                        "Multiplicacion rusa", JOptionPane.PLAIN_MESSAGE));
                                    }
                                }
                                break;
                            case 2:
                                // Define
                                String NuevoNumero = "";
                                int terminado = 0,
                                 Numero,
                                 NumeroOp,
                                 BorrarDigito;

                                // Lee
                                JOptionPane.showMessageDialog(null,
                                        "Dado un número mayor de 1000, eliminar un dígito elegido por el usuario.",
                                        "Eliminar un dígito", JOptionPane.PLAIN_MESSAGE);
                                Numero = Integer
                                        .parseInt(JOptionPane.showInputDialog(null, "Digite un numero mayor de 1000:"));
                                while (Numero < 1000) {
                                    Numero = Integer.parseInt(JOptionPane.showInputDialog(null,
                                            "Digite un numero mayor de 1000 (correctamente):"));
                                }
                                NumeroOp = Numero;
                                BorrarDigito = Integer.parseInt(
                                        JOptionPane.showInputDialog(null, "Escriba un digito para eliminar:"));
                                while (BorrarDigito < 0 || BorrarDigito > 9) {
                                    BorrarDigito = Integer.parseInt(JOptionPane.showInputDialog(null,
                                            "Escriba un digito para eliminar (correctamente):",
                                            JOptionPane.PLAIN_MESSAGE));
                                }

                                // Evalua
                                while (terminado == 0) {
                                    if (NumeroOp % 10 != BorrarDigito) {
                                        NuevoNumero = (NumeroOp % 10) + NuevoNumero;
                                    }
                                    NumeroOp = NumeroOp / 10;
                                    if (NumeroOp == 0) {
                                        terminado = 1;
                                    }
                                }

                                // Muestra
                                NuevoNumero = "Numero principal: " + Numero + "\nDigito a eliminar: " + BorrarDigito
                                        + "\nNumero final: " + NuevoNumero;
                                JOptionPane.showMessageDialog(null, NuevoNumero, "Resultado",
                                        JOptionPane.PLAIN_MESSAGE);
                                break;
                            case 3:
                                // Define
                                double NumSen,
                                 Angulo,
                                 DenSen,
                                 PotSen,
                                 ISen,
                                 INumSen,
                                 IDenSen,
                                 NumCos,
                                 DenCos,
                                 PotCos,
                                 ICos,
                                 INumCos,
                                 IDenCos,
                                 Rep,
                                 Cos,
                                 Sen,
                                 Tan,
                                 Cot,
                                 Csc,
                                 Sec,
                                 Angulo1;
                                cMenu4 = 0;
                                ;

                                // Lee
                                JOptionPane.showMessageDialog(null,
                                        "Teniendo en cuenta que el seno y coseno se pueden calcular utilizando las siguientes fórmulas o series de Taylor, \nel programa debe permitir calcular las demás funciones basadas en estas 2. \nTener en cuenta que la sumatoria debe tener un fin suministrado por el usuario para poder dar un resultado. \nNo olvidar que la potencia debe ser implementada con ciclos.",
                                        "Series de Taylor", JOptionPane.PLAIN_MESSAGE);

                                while (cMenu4 == 0) {
                                    Rep = 0;
                                    Angulo = 0;
                                    Angulo1 = 0;
                                    // Lee
                                    opmenu4 = Integer.parseInt(JOptionPane.showInputDialog(null,
                                            " 1. Sen(x)             2. Cos(x)             3. Tan(x) \n 4. Csc(x)             5. Sec(x)             6. Cot(x) \n                            7. Salir                             ",
                                            " Series de Taylor ", JOptionPane.PLAIN_MESSAGE));
                                    if (opmenu4 != 7) {
                                        Angulo1 = (double) Double.parseDouble(
                                                JOptionPane.showInputDialog(null, "Digite el angulo en grados:", "Angulo",
                                                        JOptionPane.PLAIN_MESSAGE));
                                        Rep = Double.parseDouble(
                                                JOptionPane.showInputDialog(null, "Digite numero de repeticiones:",
                                                        "Repeticiones", JOptionPane.PLAIN_MESSAGE));

                                        // Evalua radian
                                        Angulo = Angulo1 * Math.PI / 180;
                                    }

                                    // Evalua seno
                                    Sen = 0;
                                    for (ISen = 0; ISen <= Rep; ISen++) {
                                        NumSen = 1;
                                        for (INumSen = 1; INumSen <= ISen; INumSen++) {
                                            NumSen = NumSen * (-1);
                                        }
                                        DenSen = 1;
                                        PotSen = 1;

                                        for (IDenSen = 1; IDenSen <= 2 * ISen + 1; IDenSen++) {
                                            DenSen = DenSen * IDenSen;
                                            PotSen = PotSen * Angulo;
                                        }
                                        Sen = Sen + NumSen / DenSen * PotSen;
                                    }

                                    // Evalua Coseno
                                    Cos = 0;
                                    for (ICos = 0; ICos <= Rep; ICos++) {
                                        NumCos = 1;
                                        for (INumCos = 1; INumCos <= ICos; INumCos++) {
                                            NumCos = NumCos * (-1);
                                        }
                                        PotCos = 1;
                                        DenCos = 1;
                                        for (IDenCos = 1; IDenCos <= 2 * ICos; IDenCos++) {
                                            PotCos = (double) PotCos * Angulo;
                                            DenCos = (double) DenCos * IDenCos;
                                        }
                                        Cos = (double) Cos + ((NumCos * PotCos) / DenCos);
                                    }

                                    // Muestra
                                    switch (opmenu4) {
                                        case 1 ->
                                            JOptionPane.showMessageDialog(null, Sen, "Seno(" + Angulo1 + ")",
                                                    JOptionPane.PLAIN_MESSAGE);
                                        case 2 ->
                                            JOptionPane.showMessageDialog(null, Cos, "Coseno(" + Angulo1 + ")",
                                                    JOptionPane.PLAIN_MESSAGE);
                                        case 3 -> {
                                            Tan = Sen / Cos;
                                            JOptionPane.showMessageDialog(null, Tan, "Tangente(" + Angulo1 + ")",
                                                    JOptionPane.PLAIN_MESSAGE);
                                        }
                                        case 4 -> {
                                            Csc = 1 / Sen;
                                            JOptionPane.showMessageDialog(null, Csc, "Cosecante(" + Angulo1 + ")",
                                                    JOptionPane.PLAIN_MESSAGE);
                                        }
                                        case 5 -> {
                                            Sec = 1 / Cos;
                                            JOptionPane.showMessageDialog(null, Sec, "Secante(" + Angulo1 + ")",
                                                    JOptionPane.PLAIN_MESSAGE);
                                        }
                                        case 6 -> {
                                            Cot = Cos / Sen;
                                            JOptionPane.showMessageDialog(null, Cot, "Cotangente(" + Angulo1 + ")",
                                                    JOptionPane.PLAIN_MESSAGE);
                                        }
                                        case 7 -> {
                                            JOptionPane.showMessageDialog(null, "Confirma su salida?", "salir",
                                                    JOptionPane.PLAIN_MESSAGE);
                                            cMenu4 = 1;
                                        }
                                    }
                                }
                                break;
                            case 4:
                                // Sale
                                JOptionPane.showMessageDialog(null, "Confirma su salida?", "salir",
                                        JOptionPane.PLAIN_MESSAGE);
                                cMenu3 = 0;
                        }
                    }
                }
                case 3 -> {
                    // Sale
                    JOptionPane.showMessageDialog(null, "Confirma su salida?", "salir",
                            JOptionPane.PLAIN_MESSAGE);
                    cMenu1 = 0;
                }
            }

        }
    }

}
